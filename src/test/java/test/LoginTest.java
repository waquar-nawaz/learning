package test;

import org.testng.annotations.Test;

import Utility.Constants;

public class LoginTest extends BaseTest{

    

    @Test

    public void verifyLoginfeature() throws Exception {

        lp.enter_user(Constants.hrm_username);

        lp.enter_pass(Constants.hrm_password);

        lp.clickLoginButton();

        lp.verifyApplicationTitle(driver.getTitle(), "OrangeHRM");

        lp.clickUserDropdown();

        lp.clickLogout();

        lp.verifyApplicationTitle(driver.getTitle(), "OrangeHRM");
 

    }



}