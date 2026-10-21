package tests;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TestLoginPage {
    @Test
    public void login() {
        Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://freelance-learn-automation.vercel.app/login");
        LoginPage loginPage = new LoginPage(page);

        /*
        //Approach 1
        loginPage.loginToApp("admin@email.com", "admin@123");

        //Approach 2
        loginPage.enterUserName("admin@email.com");
        loginPage.enterPassword("admin@123");
        loginPage.clickOnSignIn();
        */

        //Calling login page methods using Builder Pattern
        loginPage.enterUserNameBP("admin@email.com").enterPasswordBP("admin@123").clickOnSignInBP();


    }
}
