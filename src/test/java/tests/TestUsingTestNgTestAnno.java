package tests;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;

public class TestUsingTestNgTestAnno {

    @Test
    public void login()
    {
        Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://freelance-learn-automation.vercel.app/login");
        page.locator("#email1").fill("admin@email.com");
        page.locator("#password1").fill("admin@123");
        page.waitForTimeout(3000);
        page.locator(".submit-btn").click();
    }
}
