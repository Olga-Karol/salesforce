package salesforce;


import model.AccountModel;
import model.ContactModel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.modelUtils.AccountModelUtils;
import utils.modelUtils.ContactModelUtils;


public class AddContactTest extends BaseTest{

    ContactModel testContact = ContactModelUtils.getDefaultContactModel();
    AccountModel testAccount = AccountModelUtils.getDefaultAccountModel();

    @BeforeMethod (description = "Create a new account for testing")
    public void addNewAccount() {
        mainSteps
                .openSalesForseLoginPage()
                .validCredentialsLogin()
                .openAccountPage()
                .createNewAccount(testAccount)
                .validateAccountCreated(testAccount);
        new HomePage(driver).openPage();
    }


    @Test(description = "Create a new contact")
     public void addNewContactTest() {
     mainSteps
             .openContactPage()
             .createNewContact(testContact)
             .validateContactCreated(testContact)
             .validatedAccountNameLink();
     postconditionSteps.deleteCreatedContact();
    }
}
