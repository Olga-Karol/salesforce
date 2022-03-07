package components.modal;


import org.openqa.selenium.WebDriver;

public class DeleteAccountModal extends DeleteModal {

    private static final String HEADER_LABEL = "Account";


    public DeleteAccountModal(WebDriver driver) {
        super(driver, HEADER_LABEL);
    }
}
