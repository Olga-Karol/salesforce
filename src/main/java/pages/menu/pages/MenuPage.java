package pages.menu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public abstract class MenuPage extends BasePage {


    public static final String HEADER_PATTERN = "//h1[contains(.,'%s')]";
    private static final By DETAILS_BUTTON = By.xpath("//a[@data-label='Details']");
    private static final By DETAILS_TAB_PANEL = By.xpath("//div[@records-recordlayoutitem_recordlayoutitem and contains(@class,'label-stacked')]");

    private String title;
    private String baseUrl;
    private By pageLocator;

    public MenuPage(WebDriver driver, String baseUrl, String title) {
        super(driver);
        this.title = title;
        this.baseUrl = baseUrl;
        this.pageLocator = By.xpath(String.format(HEADER_PATTERN, title));
    }

    @Override
    public void waitPageLoaded() {
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(pageLocator));
    }

    @Override
    public BasePage openPage() {
        driver.get(baseUrl);
        return this;
    }

    public void openDetails() {
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(DETAILS_BUTTON));
        By by = DETAILS_BUTTON;
        driver.findElement(by).click();
        explicitlyWait.until(ExpectedConditions.attributeContains(DETAILS_BUTTON, "aria-selected", "true"));
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(DETAILS_TAB_PANEL));
    }

}
