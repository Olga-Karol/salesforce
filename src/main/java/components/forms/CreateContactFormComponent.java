package components.forms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateContactFormComponent extends CreateBaseFormComponent{

    public static final String CONTACT_HEADER_LABEL = "Contact";
    private static final By SAVE_BUTTON = By.xpath("//button[text()='Save']");

    public CreateContactFormComponent(WebDriver driver) {
        super(driver, CONTACT_HEADER_LABEL, SAVE_BUTTON);
    }
}
