package pages.menu.pages;


import org.openqa.selenium.WebDriver;

public class ContactPage extends MenuPage {

        private static final String BASE_URL = "https://mycompany-ac.lightning.force.com/lightning/o/Contact/list?filterName=Recent";
        public static final String TITLE = "Contacts";

        public ContactPage(WebDriver driver) {
            super(driver, BASE_URL, TITLE);
        }
}
