package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConst;
import generics.BasePage;
import generics.ExcelLibrary;

public class ActitimeLogin extends BasePage implements AutoConst{
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(name="pwd")
	
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepLoggedInCheckBox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(id="toPasswordRecoveryPageLink")
	private WebElement toPasswordRecoveryPageLink;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actitimeInc;
	
	@FindBy(xpath="//div[@class='atLogoImg']")
	private WebElement atLogoImg;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logoutLink;

	public ActitimeLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	
	public void loginMethod() throws IOException {
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 1));
		keepLoggedInCheckBox.click();
		loginButton.click();
	}
	public void forgotPassword() {
		toPasswordRecoveryPageLink.click();
	}
	public void actitimeInc() {
		actitimeInc.click();
	}
	public void logoutLinkMethod() {
		logoutLink.click();
	}
}
