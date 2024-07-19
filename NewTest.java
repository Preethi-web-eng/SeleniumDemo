import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;

public class NewTest {
  @Test
  public void postmethod() throws Exception {
	  
	  FileInputStream file=new FileInputStream("C:\Users\goli.preethi\OneDrive - Entain Group\Desktop\Preethi\API Automation\workspace\API Automation\xml files\request.xml");
	  RestAssured.baseURI="http://www.dneonline.com";
	  Response response=
			  Given
	 
	  
  }
}
