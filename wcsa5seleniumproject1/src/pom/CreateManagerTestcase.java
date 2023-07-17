package pom;

import java.io.IOException;

public class CreateManagerTestcase extends BaseTest{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bT = new BaseTest();
		bT.setUp();
		
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		WorkLib worklib = new WorkLib();
		
		UsersPage nup = new UsersPage(driver);
		Flib flib = new Flib();
		
		lp.validLoginMethod(flib.readPropertyData(Prop_path, "Username"), flib.readPropertyData(Prop_path, "Password"));
		hp.clickonUserModule();
		nup.validUserCred(flib.readExcelData(Excel_Path, "Managercreds", 1, 0), flib.readExcelData(Excel_Path, "Managercreds", 1, 1), flib.readExcelData(Excel_Path, "Managercreds", 1, 2), flib.readExcelData(Excel_Path, "Managercreds",1, 3), flib.readExcelData(Excel_Path, "Managercreds", 1, 4));
		nup.deleteManager();
		worklib.handleConfirmationPoputp();
		
		Thread.sleep(2000);
		bT.tearDown();
		
		
		
	}

}
