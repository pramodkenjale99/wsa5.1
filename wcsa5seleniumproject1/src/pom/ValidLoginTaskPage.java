package pom;

import java.io.IOException;

public class ValidLoginTaskPage extends BaseTest{

	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		
		bt.setUp();
		
		Flib flib = new Flib();
    	//to call the webelements of login page create the obj of loginpage class
    	LoginPage lp = new LoginPage(driver);
    	lp.validLoginMethod(flib.readPropertyData(Prop_path, "Username"),flib.readPropertyData(Prop_path, "Password"));

	}

}
