package steps;

import components.modal.DeleteAccountModal;
import components.modal.DeleteContactModal;
import components.modal.DeleteOption;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PostconditionSteps extends BaseStep{

    private DeleteAccountModal deleteAccountModal;
    private DeleteContactModal deleteContactModal;
    private DeleteOption deleteOption;


    public PostconditionSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Remove created account")
    public void deleteCreatedAccount(){
        deleteAccountModal = new DeleteAccountModal(driver);
        deleteOption = new DeleteOption(driver);
        deleteOption.expandDropdown();
        Assert.assertTrue(
                deleteOption.isComponentDisplayed(),
                "Options are not shown"
        );
        deleteOption.isComponentDisplayed();
        deleteOption.selectDeleteOption();
        Assert.assertTrue(
                deleteAccountModal.isComponentDisplayed(),
                "Modal is not opened"
        );
        deleteAccountModal.delete();
    }

    @Step("Remove created contact")
    public void deleteCreatedContact(){
        deleteContactModal = new DeleteContactModal(driver);
        deleteOption = new DeleteOption(driver);
        deleteOption.expandDropdown();
        Assert.assertTrue(
                deleteOption.isComponentDisplayed(),
                "Options are not shown"
        );
        deleteOption.isComponentDisplayed();
        deleteOption.selectDeleteOption();
        Assert.assertTrue(
                deleteContactModal.isComponentDisplayed(),
                "Modal is not opened"
        );
        deleteContactModal.delete();
    }
}
