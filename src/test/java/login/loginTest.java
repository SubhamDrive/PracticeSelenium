package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.*;

public class loginTest extends BaseTest {
    @Test
    public void testSuccesfulllogin()
    {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");


    }

}
