package components.modal;


import org.openqa.selenium.WebDriver;

public class DeleteContactModal extends DeleteModal {

    private static final String HEADER_LABEL = "Contact";


    public DeleteContactModal(WebDriver driver) {
        super(driver, HEADER_LABEL);
    }
}
