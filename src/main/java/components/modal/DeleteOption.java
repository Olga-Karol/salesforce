package components.modal;

import components.BaseComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DeleteOption extends BaseComponent {

    private static final By DROPDOWN_OPTIONS = By.xpath("//div[@class='slds-dropdown slds-dropdown_right']//div[@role='menu']");
            //div[@records-highlights2_highlights2]//div[@class='slds-dropdown slds-dropdown_right']");
    private static final By DROPDOWN_BUTTON = By.xpath("//li[contains(@class,'slds-dropdown')]//button[contains(@class,'icon-border-filled')]");
    private static final By DELETE_OPTION = By.xpath("//a[@runtime_platform_actions-ribbonmenuitem_ribbonmenuitem and contains (@name,'Delete')]");


    public DeleteOption(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isComponentDisplayed() {
        try {
            explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated((DROPDOWN_OPTIONS)));
        } catch (TimeoutException ex) {
            return false;
        }
        return true;
    }

    public void expandDropdown() {
        driver.findElement(DROPDOWN_BUTTON).click();
        explicitlyWait.until(ExpectedConditions.attributeContains(DROPDOWN_BUTTON, "aria-haspopup", "true"));
    }

    public void selectDeleteOption() {
        driver.findElement(DELETE_OPTION).click();
    }
}
