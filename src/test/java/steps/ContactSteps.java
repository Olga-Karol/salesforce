package steps;

import components.details.tab.DetailsComponent;
import components.forms.ContactForm.*;
import components.forms.CreateContactFormComponent;
import components.forms.NewButton;
import io.qameta.allure.Step;
import model.ContactModel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.menu.pages.ContactPage;

import static utils.Constants.ACCOUNT_NAME;

public class ContactSteps extends BaseStep{

    private ContactPage contactPage;
    private NewButton newButton;


    public ContactSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Open 'New contact' form -> fill in form -> save")
    public ContactSteps createNewContact(ContactModel contactModel) {
        contactPage = new ContactPage(driver);
        newButton = new NewButton(driver);
        newButton.openCreationForm();
        CreateContactFormComponent form = new CreateContactFormComponent(driver);
        Assert.assertTrue(
                form.isComponentDisplayed(),
                form.getClass().getSimpleName().concat(" not displayed")
        );
        selectAccountName(ACCOUNT_NAME);
        fillContactForm(contactModel);
        form.save();
        validatePageIsLoaded(contactPage);
        return this;
    }

    private void fillContactForm(ContactModel contactModel) {

        new Input(driver, "Phone").insert(contactModel.getPhone());
        new Input(driver, "First Name").insert(contactModel.getFirstName());
        new Input(driver, "Last Name").insert(contactModel.getLastName());
        new Input(driver, "Title").insert(contactModel.getTitle());
        new Input(driver, "Mobile").insert(contactModel.getMobile());
        new Input(driver, "Email").insert(contactModel.getEmail());
        new TextArea(driver, "Description").insert(contactModel.getDescription());
        new TextArea(driver, "Mailing Street").insert(contactModel.getMailingStreet());
        new Input(driver, "Mailing City").insert(contactModel.getMailingCity());
        new Input(driver, "Mailing State/Province").insert(contactModel.getMailingStateProvince());
        new Input(driver, "Mailing Zip/Postal Code").insert(contactModel.getMailingZipPostalCode());
        new Input(driver, "Mailing Country").insert(contactModel.getMailingCountry());
        new TextArea(driver, "Other Street").insert(contactModel.getOtherStreet());
        new Input(driver, "Other City").insert(contactModel.getOtherCity());
        new Input(driver, "Other State/Province").insert(contactModel.getOtherStateProvince());
        new Input(driver, "Other Zip/Postal Code").insert(contactModel.getOtherZipPostalCode());
        new Input(driver, "Other Country").insert(contactModel.getOtherCountry());
        new Dropdown(driver, "Salutation").selectOption(contactModel.getSalutation());
        new Dropdown(driver, "Lead Source").selectOption(contactModel.getLeadSource());
        new Input(driver, "Fax").insert(contactModel.getFax());
        new Input(driver, "Home Phone").insert(contactModel.getHomePhone());
        new Input(driver, "Other Phone").insert(contactModel.getOtherPhone());
        new Input(driver, "Asst. Phone").insert(contactModel.getAsstPhone());
        new Input(driver, "Assistant").insert(contactModel.getAssistant());
        new Input(driver, "Department").insert(contactModel.getDepartment());
        new Input(driver, "Birthdate").insert(contactModel.getBirthdate());
    }

    @Step("Make sure filled contact's data matches to data on Contact details tab")
    public ContactSteps validateContactCreated(ContactModel expectedModel) {
        contactPage.openDetails();
        ContactModel actualModel = getActualContact();
        Assert.assertEquals(
                actualModel,
                expectedModel,
                String.format("Contact is not valid: %s", actualModel)
        );
        return this;
    }

    @Step("Make sure filled Account name is the same on Contact details tab")
    public void validatedAccountNameLink(){
        contactPage.openDetails();
        String actualAccountName = new DetailsComponent(driver, "Account Name").getTextLink();
        Assert.assertEquals(
                actualAccountName,
                ACCOUNT_NAME,
                "Account Name does not correspond"
        );
    }

    private ContactModel getActualContact()  {
        ContactModel contactModel = new ContactModel();
        contactModel.setPhone(new DetailsComponent(driver, "Phone").getValue());
        contactModel.setName(new DetailsComponent(driver, "Name").getValue());
        contactModel.setTitle(new DetailsComponent(driver, "Title").getValue());
        contactModel.setMobile(new DetailsComponent(driver, "Mobile").getValue());
        contactModel.setEmail(new DetailsComponent(driver, "Email").getValue());
        contactModel.setMailingAddress(new DetailsComponent(driver, "Mailing Address").getValue());
        contactModel.setOtherAddress(new DetailsComponent(driver, "Other Address").getValue());
        contactModel.setFax(new DetailsComponent(driver, "Fax").getValue());
        contactModel.setHomePhone(new DetailsComponent(driver, "Home Phone").getValue());
        contactModel.setOtherPhone(new DetailsComponent(driver, "Other Phone").getValue());
        contactModel.setAsstPhone(new DetailsComponent(driver, "Asst. Phone").getValue());
        contactModel.setAssistant(new DetailsComponent(driver, "Assistant").getValue());
        contactModel.setDepartment(new DetailsComponent(driver, "Department").getValue());
        contactModel.setLeadSource(new DetailsComponent(driver, "Lead Source").getValue());
        contactModel.setBirthdate(new DetailsComponent(driver, "Birthdate").getValue());
        contactModel.setDescription(new DetailsComponent(driver, "Description").getValue());
        return contactModel;
    }

    private void selectAccountName (String accountName) {
        new SearchField(driver, "Account Name").selectOption(accountName);
    }
}
