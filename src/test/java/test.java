
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
		
		//String mainChapterNumber = chapterNumber.split("\\.", 2)[0];

//		   try {
//			 String testinput = null;
//             String projectPath=System.getProperty("user.dir");
//             System.out.println(projectPath);
//             File filepathx = new File(projectPath+File.separator+"/src/test/resources/qa/data/redington.xml");
//             
		    
//			   String filepath = "/home/rle0502/Documents/code/genesis-auto/schl-rco-test-ca/src/test/resources/qa/data/redington.xml";
//			   System.out.println(filepath);
//			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
//			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
//			Document doc = docBuilder.parse(filepath);
//
//			// Get the root element
//			Node company = doc.getFirstChild();
//
//			// Get the staff element , it may not working if tag has spaces, or
//			// whatever weird characters in front...it's better to use
//			// getElementsByTagName() to get it directly.
//			// Node staff = company.getFirstChild();
//
//			// Get the staff element by tag name directly
//			Node staff = doc.getElementsByTagName("testcase").item(1);
//
//			// update staff attribute
////			NamedNodeMap attr = staff.getAttributes();
////			Node nodeAttr = attr.getNamedItem("id");
////			nodeAttr.setTextContent("2");
//
//			// append a new node to staff
////			Element age = doc.createElement("age");
////			age.appendChild(doc.createTextNode("28"));
////			staff.appendChild(age);
//
//			// loop the staff child node
//			NodeList list = staff.getChildNodes();
//
//			for (int i = 0; i < list.getLength(); i++) {
//
//	                   Node node = list.item(i);
//
//			   // get the salary element, and update the value
//			   if ("userPM".equals(node.getNodeName())) {
//				node.setTextContent("pm14@qa.mailinator.com");
//			   }
//
//			   
//			   if ("password".equals(node.getNodeName())) {
//				node.setTextContent("Pass@123");
//			   }
//	                   //remove firstname
////			   if ("firstname".equals(node.getNodeName())) {
////				staff.removeChild(node);
////			   }
//
//			}
//
//			// write the content into xml file
//			TransformerFactory transformerFactory = TransformerFactory.newInstance();
//			Transformer transformer = transformerFactory.newTransformer();
//			DOMSource source = new DOMSource(doc);
//			StreamResult result = new StreamResult(new File(filepath));
//			transformer.transform(source, result);
//
//			System.out.println("Done");
//
//		   } catch (ParserConfigurationException pce) {
//			pce.printStackTrace();
//		   } catch (TransformerException tfe) {
//			tfe.printStackTrace();
//		   } catch (IOException ioe) {
//			ioe.printStackTrace();
//		   } catch (SAXException sae) {
//			sae.printStackTrace();
//		   }
//		}
	}
	}
    
    
