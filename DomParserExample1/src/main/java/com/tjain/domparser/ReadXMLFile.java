package com.tjain.domparser;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXMLFile {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		ReadXMLFile readXMLFile = new ReadXMLFile();
		 InputStream inputStream = readXMLFile.getFileInputStream(); 
				 
		//Object.class.getClass().getClassLoader().getResourceAsStream("D:/NewTest/DomParserExample1/src/main/resources/Staff.xml");
		 DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		 Document document = dBuilder.parse(inputStream);
		 document.getDocumentElement().normalize();
		 
		 System.out.println("Root element: "+ document.getDocumentElement().getNodeName());
		 
		 NodeList nList = document.getElementsByTagName("staff");
		 System.out.println("-------------------------------------");
		 int nListSize = nList.getLength();
		 for(int count=0;count<nListSize;count++){
			 Node nNode = nList.item(count);
			 
			 System.out.println("\nCurrent Element: " + nNode.getNodeName());
			 
			 if(nNode.getNodeType() == Node.ELEMENT_NODE){
				 Element eElement = (Element)nNode;
				 
				 System.out.println("Staff id: "+ eElement.getAttribute("id"));
				 System.out.println("First Name: "+ eElement.getElementsByTagName("firstname").item(0).getTextContent());
				 System.out.println("Last Name: "+eElement.getElementsByTagName("lastname").item(0).getTextContent());
				 System.out.println("Nick Name: "+eElement.getElementsByTagName("nickname").item(0).getTextContent());
				 System.out.println("Salary: "+eElement.getElementsByTagName("salary").item(0).getTextContent());
			 }
		 }
	}

	private InputStream getFileInputStream() {
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("Staff.xml");
		return inputStream;
	}

}
