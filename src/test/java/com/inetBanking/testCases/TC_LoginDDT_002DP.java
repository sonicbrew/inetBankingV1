package com.inetBanking.testCases;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginDDT_002DP extends BaseClass {

    @Test(dataProvider = "LoginData")
    public void testMethod(String user, String pwd) throws InterruptedException  //        public void loginDDT
        {
            LoginPage lp = new LoginPage(driver);
            lp.setUserName(user);
            logger.info("user name provided");
            lp.setPassword(pwd);
            logger.info("password provided");
            lp.clickSubmit();
            Thread.sleep(3000);


        if (isAlertPresent() == true) {
            driver.switchTo().alert().accept();//close alert
            driver.switchTo().defaultContent();
            Assert.assertTrue(false);
            logger.warn("Login failed");
        } else {
            Assert.assertTrue(true);
            logger.info("Login passed");
                lp.clickLogout();
            Thread.sleep(3000);
            driver.switchTo().alert().accept();//close logout alert
            driver.switchTo().defaultContent();

        }
    }
    public boolean isAlertPresent() //user defined method created to check alert is presetn or not
    {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }

    }
    @DataProvider(name="LoginData")
    public Object[][] getData(){
        return new Object[][]
                {
                        { "mngr276926", "EdasEru" },
                        { "mngr276927", "EdasEru" },
                        { "mngr276928", "EdasEru" }
                };
    }
}
