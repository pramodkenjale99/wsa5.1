package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class InvalidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		BaseTest bT = new BaseTest();
		bT.setUp();
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		int rc = flib.getLastRowCount(Excel_Path, "Invalidcreds");
		for (int i = 1; i <= rc; i++) {
			lp.InvalidLoginMethod(flib.readExcelData(Excel_Path, "Invalidcreds", i, 0),
					flib.readExcelData(Excel_Path, "Invalidcreds", i, 1));
		}
		bT.tearDown();

	}

}
