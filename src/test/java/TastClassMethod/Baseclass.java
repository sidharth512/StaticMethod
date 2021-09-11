package TastClassMethod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import Readconfilt.Readconflitdata;

public class Baseclass {
	
	 public WebDriver driver;
public static String name;
public static String userpassword;
@BeforeClass
public static void setup() throws IOException {
String Drive=Readconflitdata.div();
String Url=Readconflitdata.readurl();
String name=Readconflitdata.readmethod();
String userpassword=Readconflitdata.readpwd();

System.setProperty("webdriver.chrome.driver",Drive);
ChromeDriver driver=new  ChromeDriver();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.get(Url);

}


}