package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;


public class LoginPage {

    private Locator usernameInput;
    private Locator passwordInput;
    private Locator submitButton;

    public LoginPage(Page page) {
        usernameInput = page.locator("#email1");
        passwordInput = page.locator("#password1");
        submitButton = page.locator(".submit-btn");
    }

    //Approach 1 - create method and pass parameters for all 3 params
    public void loginToApp(String userName, String password) {
        usernameInput.fill(userName);
        passwordInput.fill(password);
        submitButton.click();
    }


    //Approach 2 - create method for each action and pass parameter
    public void enterUserName(String userName) {
        usernameInput.fill(userName);
    }

    public void enterPassword(String password) {
        passwordInput.fill(password);
    }

    public void clickOnSignIn() {
        submitButton.click();
    }

    //Builder Pattern
    public LoginPage enterUserNameBP(String userName) {
        usernameInput.fill(userName);
        return this;
    }

    public LoginPage enterPasswordBP(String password) {
        passwordInput.fill(password);
        return this;
    }

    public LoginPage clickOnSignInBP() {
        submitButton.click();
        return this;
    }

}
