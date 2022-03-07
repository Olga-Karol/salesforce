package components.buttons.menu;

import org.openqa.selenium.WebDriver;

public class ContactsButton extends MenuButton{

    private static final String ACCOUNT_BUTTON_LABEL = "Contacts";

    public ContactsButton(WebDriver driver) {
        super(driver, ACCOUNT_BUTTON_LABEL);
    }
}
