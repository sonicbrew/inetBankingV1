package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.Test;
import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{

    @Test
    public void logInTest() throws IOException
    {
        
        logger.info("URL is opened");

        LoginPage lp = new LoginPage(driver);
        lp.setUserName(username); //using page object classes
        logger.info("Entered username");
        
        lp.setPassword(password);
        logger.info("Entered password");
        
        lp.clickSubmit();
        logger.info("clicked on Submit");
        

        if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
        {
            Assert.assertTrue(true);
            logger.info("Login test passed");
        }else
        {
        	captureScreen(driver, "logInTest");
            Assert.assertTrue(false);
            logger.info("Login test failed");
            

        }
    }
}


