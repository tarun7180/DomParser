package domCode;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class DOMReader {

	
	 public Document createDocument(InputStream inputStream){
		  DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		  DocumentBuilder documentBuilder = null;
		  Document document = null;
		  try {
		   documentBuilder = documentBuilderFactory.newDocumentBuilder();
		   document = documentBuilder.parse(inputStream);		   
		  } catch (ParserConfigurationException e) {
		   e.printStackTrace();
		  } catch (FileNotFoundException e) {
		   e.printStackTrace();
		  } catch (SAXException e) {
		   e.printStackTrace();
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
		  return document;
		  
		 }
	 
	 public Map<Integer,Account> createAccountList(String xmlFileName){
		 InputStream inputStream = getClass().getClassLoader().getResourceAsStream(xmlFileName); 
		 Map<Integer,Account> AccountMap = new HashMap<Integer,Account>();
		  Document document = createDocument(inputStream);
		  NodeList nodeList = document.getElementsByTagName("Account");
		  createAcccountObject(AccountMap,nodeList);
		  return AccountMap;
		 }
	
	private void createAcccountObject(Map<Integer,Account> accountMap,
			NodeList nodeList) {
		int nodeListSize = nodeList.getLength();
		for(int count=0;count<nodeListSize;count++){
			Account account = new Account();
			Node acctNode = nodeList.item(count);
			Element acctElement = (Element)acctNode;
			account.setAccountName(acctNode.getNodeName());
			Integer organizationNumber = Integer.parseInt(acctElement.getElementsByTagName("OrganizationNumber").item(0).getTextContent());
			account.setAccountOrganizationNumber(organizationNumber);
			account.setAccountAddress1(acctElement.getElementsByTagName("Address1").item(0).getTextContent());
			account.setAccountAddress2(acctElement.getElementsByTagName("Address2").item(0).getTextContent());
			account.setAccountCity(acctElement.getElementsByTagName("City").item(0).getTextContent());
			account.setAccountCountry(acctElement.getElementsByTagName("Country").item(0).getTextContent());
			account.setAccountProgramName(acctElement.getElementsByTagName("ProgramName").item(0).getTextContent());
			account.setAccountCreditLine(Float.parseFloat(acctElement.getElementsByTagName("CreditLine").item(0).getTextContent()));
			accountMap.put(organizationNumber, account);
		}
		
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		DOMReader domReader = new DOMReader();
		Map<Integer,Account> AccountMap = domReader.createAccountList("AssignmentXML.xml");

	}

}
