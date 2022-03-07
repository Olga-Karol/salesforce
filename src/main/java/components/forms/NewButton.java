package components.forms;

import components.BaseComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewButton extends BaseComponent {

    private static final By NEW_BUTTON = By.cssSelector("[title='New']");

    public NewButton(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isComponentDisplayed() {
        try {
            explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(NEW_BUTTON));
        } catch (TimeoutException ex) {
            return false;
        }
        return true;
    }

    public void openCreationForm() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(NEW_BUTTON));
    }
}
