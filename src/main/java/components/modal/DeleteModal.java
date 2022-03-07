package components.modal;

import components.BaseComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public abstract class DeleteModal extends BaseComponent {


    private static final String HEADER_MODAL_LOCATOR = "//h2[contains(.,'Delete %s')]";
    private static final By DELETE_BUTTON = By.xpath("//div[contains(@class,'modal-footer slds-modal__footer')]//button[contains(@title,'Delete')]");
    private static final By EMPTY_LIST_LOCATOR = By.xpath("//div[@class='emptyContentInner slds-text-align_center']//span[text()='Try switching list views.']");
    private String label;
    private By modalLocator;

    public DeleteModal(WebDriver driver, String label) {
        super(driver);
        this.label = label;
        this.modalLocator = By.xpath(String.format(HEADER_MODAL_LOCATOR, label));
    }

    @Override
    public boolean isComponentDisplayed() {
        try {
            explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(modalLocator));
        } catch (TimeoutException ex) {
            return false;
        }
        return true;
    }

    public void delete(){
        driver.findElement(DELETE_BUTTON).click();
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(EMPTY_LIST_LOCATOR));
    }
}
