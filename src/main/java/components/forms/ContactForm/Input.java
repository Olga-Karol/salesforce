package components.forms.ContactForm;

import components.BaseComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input extends BaseComponent {

    private static final String INPUT_LOCATOR_PATTERN = "//label[text() = '%s']/ancestor::lightning-input//input";



    private String label;
    private By inputLocator;

    public Input(WebDriver driver, String label) {
        super(driver);
        this.label = label;
        this.inputLocator = By.xpath(String.format(INPUT_LOCATOR_PATTERN, label));
    }

    @Override
    public boolean isComponentDisplayed() {
        return driver.findElement(inputLocator).isDisplayed();
    }

    public void insert(String text) {
        driver.findElement(inputLocator).sendKeys(text);
    }

}
