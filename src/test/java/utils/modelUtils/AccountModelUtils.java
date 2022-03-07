package utils.modelUtils;

import model.AccountModel;
import static utils.Constants.ACCOUNT_NAME;

public class AccountModelUtils {




    public static AccountModel getDefaultAccountModel() {
        AccountModel accountModel = new AccountModel();
        accountModel.setAccountName(ACCOUNT_NAME);
        accountModel.setPhone("+37529555");
        accountModel.setFax("+37529555");
        accountModel.setWebsite("test.com");
        accountModel.setEmployees(10);
        accountModel.setType("Customer");
        accountModel.setIndustry("Banking");
        accountModel.setAnnualRevenue("5,000,000");
        accountModel.setBillingCity("Billing City");
        accountModel.setBillingCountry("Billing Country");
        accountModel.setBillingStateProvince("Billing State");
        accountModel.setBillingZipPostalCode("Billing Zip");
        accountModel.setDescription("Description");
        accountModel.setBillingStreet("Billing street");
        accountModel.setShippingStreet("Shipping street");
        accountModel.setShippingCity("Shipping City");
        accountModel.setShippingCountry("Shipping Country");
        accountModel.setShippingStateProvince("Shipping State");
        accountModel.setShippingZipPostalCode("Shipping Zip");
        accountModel.setBillingAddress(accountModel.configureBillingAddress());
        accountModel.setShippingAddress(accountModel.configureShippingAddress());
        return accountModel;
    }
}
