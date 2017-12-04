
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.File;
import java.io.IOException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class test {
	public static String filepath;
//    public static void main(String[] args)
//    {
//        System.out.println(ReadFile("/src/test/resources/qa/data/redington.xml","1"));
//    }

//            public static String ReadFile(String fileName,String id)
//        {
//
//                String testinput = null;
//                String projectPath=System.getProperty("user.dir");
//                System.out.println(projectPath);
//                File fXmlFile = new File(projectPath+File.separator+fileName);
//                System.out.println(fXmlFile);
//                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder dBuilder = null;
//            try {
//                dBuilder = dbFactory.newDocumentBuilder();
//            } catch (ParserConfigurationException e) {
//                e.printStackTrace();
//            }
//            Document doc= null;
//            try {
//                doc = dBuilder.parse(fXmlFile);
//            } catch (SAXException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
//                XPath xPath =  XPathFactory.newInstance().newXPath();
//                String expression = String.format("/TestCases/Test[@id='"+id+"']/userid");
//                System.out.println(expression);
//            Node node = null;
//            try {
//                node = (Node) xPath.compile(expression).evaluate(doc, XPathConstants.NODE);
//            } catch (XPathExpressionException e) {
//                e.printStackTrace();
//            }
//            testinput = node != null ? (node.getTextContent()) : "cannot read the test case xml file";
//                return testinput;
//
//        }
    
	public static void main(String argv[]) {
		String credit = "1000.00" ;
		credit = credit.split("\\.",2)[0];
		System.out.println(credit);
		

		File currentDir = new File ("src/test/resources/qa/data/redington.xml");
		try {
			filepath = currentDir.getCanonicalPath();
			System.out.println("Baseapth :"+filepath);
		

					
			}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
					}
		//String filepath = "/home/rle0502/Documents/code/genesis-auto/schl-rco-test-ca/src/test/resources/qa/data/redington.xml";
		System.out.println(filepath);
		try {

			File fXmlFile = new File(filepath);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

			//optional, but recommended
			//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
			doc.getDocumentElement().normalize();

			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

			NodeList nList = doc.getElementsByTagName("testcase");

			System.out.println("----------------------------");
			//System.out.println("Staff id : " + eElement.getAttribute("id"));
			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);

				System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					System.out.println("Staff id : " + eElement.getAttribute("id"));
					if (eElement.getAttribute("id").equals("OrderApproval")) {
						System.out.println("First Name : " + eElement.getElementsByTagName("userPM").item(0).getTextContent());
						System.out.println("Last Name : " + eElement.getElementsByTagName("domain").item(0).getTextContent());
				
					}	
				}
			}
		    } catch (Exception e) {
			e.printStackTrace();
		    }
		
}
	}
    
    
