package pages.menu.pages;


import org.openqa.selenium.WebDriver;


public class AccountPage extends MenuPage {

    private static final String BASE_URL = "https://mycompany36.lightning.force.com/lightning/o/Account/list?filterName=Recent";
    public static final String TITLE= "Accounts";

    public AccountPage(WebDriver driver) {
        super(driver, BASE_URL, TITLE);
    }
}
