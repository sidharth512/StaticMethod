package TastClassMethod;




import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.login;
import Readconfilt.Readconflitdata;
import Readconfilt.Utilesclass;

public class TestClass extends Baseclass {
	
@Test(dataProvider="Logindata")
public  void m1(String user,String PWD) {

	login page=new login(driver);
	page.setUsername(user);
	page.setPassword(PWD);
}
@DataProvider(name="Logindata")
String[][] getData() throws IOException{
	int rownum=Utilesclass.getrowcount("Sheet1");
	int cellcount=Utilesclass.getCellcount("Sheet1", rownum);
	String loginData[][]=new String[rownum][cellcount];
	for(int i=1;i<=rownum;i++) {
		for(int j=0;j<cellcount;j++) {
			loginData [i-1][j]=Utilesclass.getcellData("Sheet1", i, j);
			
		}
	}
	return loginData;
	
	
}
}
