package components.forms;

import components.BaseComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public abstract class CreateBaseFormComponent extends BaseComponent {

    private static final String HEADER_FORM_LOCATOR = "//h2[contains(.,'New %s')]";


    private String label;
    private By headerFormLocator;
    private By saveButtonLocator;

    public CreateBaseFormComponent(WebDriver driver, String label, By saveButtonLocator) {
        super(driver);
        this.label = label;
        this.headerFormLocator = By.xpath(String.format(HEADER_FORM_LOCATOR, label));
        this.saveButtonLocator = saveButtonLocator;
    }

    @Override
    public boolean isComponentDisplayed() {
        try {
            explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(headerFormLocator));
        } catch (TimeoutException ex) {
            return false;
        }
        return true;
    }

    public void save() {
        WebElement button = driver.findElement(saveButtonLocator);
        button.click();
    }
}
