package components.details.tab;

import components.BaseComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DetailsComponent extends BaseComponent {


    public static final String TEXT_DATA_FIELD = "//div[@class='slds-tabs_card']//span[text()='%s']/" +
                                                 "ancestor::div[@records-recordlayoutitem_recordlayoutitem and contains(@class,'label-stacked')]" +
                                                  "//span[@records-recordlayoutitem_recordlayoutitem and contains(@class,'test-id__field-value')]";

    public static final String TEXT_LINK = "//div[@class='slds-tabs_card']//span[text()='%s']/" +
                                           "ancestor::div[@records-recordlayoutitem_recordlayoutitem]" +
                                           "//div[@force-lookup_lookup]//slot//span";
    String label;
    By textFieldLocator;
    By textLinkLocator;

    public DetailsComponent(WebDriver driver, String label) {
        super(driver);
        this.label = label;
        this.textFieldLocator = By.xpath(String.format(TEXT_DATA_FIELD, label));
        this.textLinkLocator = By.xpath(String.format(TEXT_LINK, label));
    }

    @Override
    public boolean isComponentDisplayed() {
        try {
            explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(textFieldLocator));
        } catch (TimeoutException ex) {
            return false;
        }
        return true;
    }


    public String getValue() {
        return driver.findElement(textFieldLocator).getText();
    }

    public String getTextLink() {
        return driver.findElement(textLinkLocator).getText();
    }

}
