package salesforce;


import model.AccountModel;
import org.testng.annotations.Test;
import utils.modelUtils.AccountModelUtils;

public class AddAccountTest extends BaseTest{

    AccountModel testAccount = AccountModelUtils.getDefaultAccountModel();


    @Test(description = "Create a new account")
    public void addNewAccountTest() {
        mainSteps
                .openSalesForseLoginPage()
                .validCredentialsLogin()
                .openAccountPage()
                .createNewAccount(testAccount)
                .validateAccountCreated(testAccount);
        postconditionSteps.deleteCreatedAccount();
    }

}
