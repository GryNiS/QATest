import static org.junit.Assert.*;

import java.io.IOException;

import javax.xml.soap.SOAPException;

import org.junit.Test;

public class TestCountCheatService {

	@Test
	public void testLetterSolutions() throws SOAPException, IOException {
		
		MyRequest req = new MyRequest();
		
		String message = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://services.aonaware.com/webservices/\"><soapenv:Header/><soapenv:Body><web:LetterSolutions><web:anagram>testing</web:anagram></web:LetterSolutions></soapenv:Body></soapenv:Envelope>";
		
		String str = req.sendMessage("http://services.aonaware.com/CountCheatService/CountCheatService.asmx", message);

		assertTrue(str.contains("<LetterSolutionsResult><string>setting</string><string>testing</string><string>ingest</string><string>tinges</string><string>gents</string><string>gites</string><string>inset</string><string>singe</string><string>stein</string><string>sting</string><string>stint</string><string>tents</string><string>tines</string><string>tinge</string><string>tings</string><string>tints</string><string>gens</string><string>gent</string><string>gets</string><string>gins</string><string>gist</string><string>gite</string><string>gits</string><string>nest</string><string>nets</string><string>nett</string><string>nits</string><string>sent</string><string>sett</string><string>sign</string><string>sine</string><string>sing</string><string>site</string><string>tens</string><string>tent</string><string>test</string><string>ties</string><string>tine</string><string>ting</string><string>tins</string><string>tint</string><string>tits</string></LetterSolutionsResult>"));
	}
	
	@Test
	public void testLetterSolutionsMin() throws SOAPException, IOException {
		
		MyRequest req = new MyRequest();
		
		String message = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://services.aonaware.com/webservices/\"><soapenv:Header/><soapenv:Body><web:LetterSolutionsMin><web:anagram>testing</web:anagram><web:minLetters>4</web:minLetters></web:LetterSolutionsMin></soapenv:Body></soapenv:Envelope>";
		
		String str = req.sendMessage("http://services.aonaware.com/CountCheatService/CountCheatService.asmx", message);

		assertTrue(str.contains("<LetterSolutionsMinResult><string>setting</string><string>testing</string><string>ingest</string><string>tinges</string><string>gents</string><string>gites</string><string>inset</string><string>singe</string><string>stein</string><string>sting</string><string>stint</string><string>tents</string><string>tines</string><string>tinge</string><string>tings</string><string>tints</string><string>gens</string><string>gent</string><string>gets</string><string>gins</string><string>gist</string><string>gite</string><string>gits</string><string>nest</string><string>nets</string><string>nett</string><string>nits</string><string>sent</string><string>sett</string><string>sign</string><string>sine</string><string>sing</string><string>site</string><string>tens</string><string>tent</string><string>test</string><string>ties</string><string>tine</string><string>ting</string><string>tins</string><string>tint</string><string>tits</string></LetterSolutionsMinResult>"));
	}

}
