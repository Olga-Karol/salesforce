package components.forms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountFormComponent extends CreateBaseFormComponent{

    public static final String ACCOUNT_HEADER_LABEL = "Account";
    private static final By SAVE_BUTTON =
            By.xpath("//div[contains(@class,'forceRecordEditActions')]//button[contains(@class,'uiButton')]/span[text()='Save']");

    public CreateAccountFormComponent(WebDriver driver) {
        super(driver, ACCOUNT_HEADER_LABEL, SAVE_BUTTON);
    }
}
