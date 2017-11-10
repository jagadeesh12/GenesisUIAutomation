import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.imageio.ImageIO;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import com.scholastic.torque.common.TestBase;
import com.scholastic.torque.common.TestBaseProvider;

import cucumber.api.Scenario;


public class CaptureFullScreenshot {
	
	static {
		String userDir = System.getProperty("user.dir");
		//System.setProperty("webdriver.gecko.driver",userDir+"/servers/geckodriver.exe");
		System.setProperty("webdriver.firefox.marionette",userDir+"/servers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver",userDir+"/servers/IEDriverServer.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://development-rco-scholastic.demandware.net/s/rco-ca/en/home");
		Thread.sleep(5000);
		Scenario scenario = null;
		try {
			takeFullPageScreenshot(scenario);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	public  static void takeScreenshot(Scenario scenario) throws IOException {
		boolean alwaysCaptureScreenshot = TestBaseProvider.getTestBase()
				.getContext().getBoolean("always.capture.screenshot", true);
		if ((!(alwaysCaptureScreenshot)) && (!(scenario.isFailed())))
			return;
		if (TestBaseProvider.getTestBase().getContext()
				.getBoolean("capture.fullpage.screenshot", false)) {
			takeFullPageScreenshot(scenario);
		} else
			takeScreenshotfromWebDriver(scenario);
	}

	private static void takeScreenshotfromWebDriver(Scenario scenario) {
		TestBase testBase = TestBaseProvider.getTestBase();
		try {
			byte[] screenshot = (byte[]) ((TakesScreenshot) testBase
					.getDriver()).getScreenshotAs(OutputType.BYTES);

			scenario.embed(screenshot, "image/png");
		} catch (WebDriverException e) {
			System.err.println(e.getMessage());
		}
	}
	
	private static void takeFullPageScreenshot(Scenario scenario) throws IOException {
		TestBase testBase = TestBaseProvider.getTestBase();

		Screenshot screenshot = new AShot().shootingStrategy(
				ShootingStrategies.viewportPasting(1000)).takeScreenshot(
				testBase.getDriver());

		BufferedImage image = screenshot.getImage();

		String tempfilePath = testBase.getContext().getString("outputdir", "")
				+ RandomStringUtils.randomAlphabetic(15) + ".png";
		ImageIO.write(image, "PNG", new File(tempfilePath));
		System.out.println(tempfilePath);
		/*scenario.embed(Files.readAllBytes(new File(tempfilePath).toPath()),
				"image/png");*/

		//new File(tempfilePath).delete();
	}
}
