package steps;

import components.buttons.menu.AccountsButton;
import components.buttons.menu.ContactsButton;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.menu.pages.AccountPage;
import pages.menu.pages.ContactPage;
import pages.HomePage;
import pages.LoginPage;
import utils.AllureUtils;

import java.nio.charset.StandardCharsets;

public class MainSteps extends BaseStep{

    private LoginPage loginPage;
    private HomePage homePage;
    private AccountsButton accountButton;
    private ContactsButton contactButton;
    private static final String USERNAME = System.getProperty("username");
    private static final String PASSWORD = System.getProperty("password");

    public MainSteps(WebDriver driver) {
        super(driver);
    }

    @Step ("Open login page")
    public MainSteps openSalesForseLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.openPage();
        validatePageIsLoaded(loginPage);
        return this;
    }

    @Step ("Authentication")
    public MainSteps validCredentialsLogin() {
        loginPage.authentication(USERNAME, PASSWORD);
        String json = String.format("{\"username\": \"%s\", \"password\": \"%s\"}", USERNAME, PASSWORD);
        AllureUtils.attachJson(json.getBytes(StandardCharsets.UTF_8));
        homePage = new HomePage(driver);
        validatePageIsLoaded(homePage);
        return this;
    }

    @Step ("Open 'New account' form")
    public AccountSteps openAccountPage() {
        accountButton = new AccountsButton(driver);
        Assert.assertTrue(
                accountButton.isComponentDisplayed(),
                accountButton.getClass().getSimpleName().concat(" not displayed")
        );
        accountButton.click();
        validatePageIsLoaded(new AccountPage(driver));
        return new AccountSteps(driver);
    }

    @Step ("Open 'New contact' form")
    public ContactSteps openContactPage() {
        contactButton = new ContactsButton(driver);
        Assert.assertTrue(
                contactButton.isComponentDisplayed(),
                contactButton.getClass().getSimpleName().concat(" not displayed")
        );
        contactButton.click();
        validatePageIsLoaded(new ContactPage(driver));
        return new ContactSteps(driver);
    }

}
