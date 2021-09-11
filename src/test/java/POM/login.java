package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	@FindBy(id="username")
	private WebElement usernameTextfield;
	@FindBy(xpath="//input[@type=\"password\"]")
	private WebElement usernamePasswordTestfield;
	@FindBy(xpath="//input[@type=\"checkbox\"]")
	private WebElement keepmeloggedinCheckbox;
	@FindBy(xpath="//a[.='Login ']")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement ForgotyourpasswordLink;
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actitimeincLink;
	@FindBy(id="logoutLink")
	private WebElement logoutbuttonofHomepage;
	public login(WebDriver driver) 
	{ 
		PageFactory.initElements(driver,this);
	}	 
	public void setUsername(String username){
		 usernameTextfield.sendKeys(username);
		
	}
	public void setPassword(String password){
		usernamePasswordTestfield.sendKeys(password);
	}	
}
