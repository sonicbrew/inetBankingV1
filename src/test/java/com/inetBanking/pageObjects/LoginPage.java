package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	 WebDriver ldriver; //l - local

	    public LoginPage(WebDriver rdriver)// Constructor takes WD as parameter/ r -remote
	    {
	        ldriver=rdriver;
	        PageFactory.initElements(rdriver, this);
	    }

	    @FindBy(name="uid") //findBy name user name field
	    @CacheLookup   //cache of the WebElement instead of searching for it every time
	    WebElement txtUserName;

	    @FindBy(name="password") //findBy name password field
	    @CacheLookup
	    WebElement txtPassword;

	    @FindBy(name="btnLogin") //findBy name user name field
	    @CacheLookup
	    WebElement btnLogin;
	    
	    @FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	    @CacheLookup
	    WebElement lnkLogout;

	    //writing action methods for each element

	    public void setUserName(String uname) {
	        txtUserName.sendKeys(uname);
	    }

	    public void setPassword(String pwd) {
	        txtPassword.sendKeys(pwd);
	    }

	    public void clickSubmit()
	    {
	        btnLogin.click();
	    }
	    public void clickLogout()
	    {
	        lnkLogout.click();
	    }
}
	

