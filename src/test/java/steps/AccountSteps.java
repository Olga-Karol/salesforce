package steps;

import components.details.tab.DetailsComponent;
import components.forms.*;
import components.forms.AccountForm.Dropdown;
import components.forms.AccountForm.Input;
import components.forms.AccountForm.TextArea;
import io.qameta.allure.Step;
import model.AccountModel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.menu.pages.AccountPage;

public class AccountSteps extends BaseStep {

    private AccountPage accountPage;
    private NewButton newButton;


    public AccountSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Open 'New account' form -> fill in form -> save")
    public AccountSteps createNewAccount(AccountModel accountModel) {
        accountPage = new AccountPage(driver);
        newButton = new NewButton(driver);
        newButton.openCreationForm();
        CreateAccountFormComponent form = new CreateAccountFormComponent(driver);
        Assert.assertTrue(
                form.isComponentDisplayed(),
                form.getClass().getSimpleName().concat(" not displayed")
        );
        fillAccountForm(accountModel);
        form.save();
        validatePageIsLoaded(accountPage);
        return this;
    }

    private void fillAccountForm(AccountModel accountModel) {
        new Input(driver, "Account Name").insert(accountModel.getAccountName());
        new Input(driver, "Phone").insert(accountModel.getPhone());
        new Input(driver, "Fax").insert(accountModel.getFax());
        new Input(driver, "Website").insert(accountModel.getWebsite());
        new Input(driver, "Employees").insert(String.valueOf(accountModel.getEmployees()));
        new Input(driver, "Annual Revenue").insert(String.valueOf(accountModel.getAnnualRevenue()));
        new TextArea(driver, "Description").insert(accountModel.getDescription());
        new TextArea(driver, "Billing Street").insert(accountModel.getBillingStreet());
        new Input(driver, "Billing City").insert(accountModel.getBillingCity());
        new Input(driver, "Billing State/Province").insert(accountModel.getBillingStateProvince());
        new Input(driver, "Billing Zip/Postal Code").insert(accountModel.getBillingZipPostalCode());
        new Input(driver, "Billing Country").insert(accountModel.getBillingCountry());
        new TextArea(driver, "Shipping Street").insert(accountModel.getShippingStreet());
        new Input(driver, "Shipping City").insert(accountModel.getShippingCity());
        new Input(driver, "Shipping State/Province").insert(accountModel.getShippingStateProvince());
        new Input(driver, "Shipping Zip/Postal Code").insert(accountModel.getShippingZipPostalCode());
        new Input(driver, "Shipping Country").insert(accountModel.getShippingCountry());
        new Dropdown(driver, "Type").selectOption(accountModel.getType());
        new Dropdown(driver, "Industry").selectOption(accountModel.getIndustry());
    }

    @Step("Make sure filled account's data matches to data on Account details tab")
    public void validateAccountCreated(AccountModel expectedModel) {
        accountPage.openDetails();
        AccountModel actualModel = getActualAccount();
        Assert.assertEquals(
                actualModel,
                expectedModel,
                String.format("Account is not valid: %s", actualModel)
        );
    }

    public AccountModel getActualAccount() {
        AccountModel actualModel = new AccountModel();
        actualModel.setAccountName(new DetailsComponent(driver, "Account Name").getValue());
        actualModel.setPhone(new DetailsComponent(driver, "Phone").getValue());
        actualModel.setFax(new DetailsComponent(driver, "Fax").getValue());
        actualModel.setWebsite(new DetailsComponent(driver, "Website").getValue());
        actualModel.setEmployees(Integer.parseInt(new DetailsComponent(driver, "Employees").getValue()));
        actualModel.setType(new DetailsComponent(driver, "Type").getValue());
        actualModel.setIndustry(new DetailsComponent(driver, "Industry").getValue());
        actualModel.setAnnualRevenue(new DetailsComponent(driver, "Annual Revenue").getValue().replace("$", ""));
        actualModel.setDescription(new DetailsComponent(driver, "Description").getValue());
        actualModel.setBillingAddress(new DetailsComponent(driver, "Billing Address").getValue());
        actualModel.setShippingAddress(new DetailsComponent(driver, "Shipping Address").getValue());
        return actualModel;
    }

}
