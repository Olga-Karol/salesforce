package utils.modelUtils;


import model.ContactModel;

public class ContactModelUtils {


    public static ContactModel getDefaultContactModel() {
        ContactModel contactModel = new ContactModel();
        contactModel.setSalutation("Mr.");
        contactModel.setPhone("+37529555");
        contactModel.setFirstName("FName");
        contactModel.setLastName("LName");
        contactModel.setMobile("+37529555");
        contactModel.setTitle("Test title");
        contactModel.setEmail("example@ex.com");
        contactModel.setMailingCity("Mailing City");
        contactModel.setMailingCountry("Mailing Country");
        contactModel.setMailingStateProvince("Mailing State");
        contactModel.setMailingZipPostalCode("Mailing Zip");
        contactModel.setMailingStreet("Mailing street");
        contactModel.setOtherStreet("Other street");
        contactModel.setOtherCity("Other City");
        contactModel.setOtherCountry("Other Country");
        contactModel.setOtherStateProvince("Other State");
        contactModel.setOtherZipPostalCode("Other Zip");
        contactModel.setMailingAddress(contactModel.configureMailingAddress());
        contactModel.setOtherAddress(contactModel.configureOtherAddress());
        contactModel.setFax("4564564");
        contactModel.setHomePhone("4545646");
        contactModel.setOtherPhone("4564646");
        contactModel.setAsstPhone("a-4564564");
        contactModel.setAssistant("545646");
        contactModel.setDepartment("Test department");
        contactModel.setLeadSource("Web");
        contactModel.setBirthdate("2/15/2022");
        contactModel.setDescription("Description");
        contactModel.setName(contactModel.configureName());
        return contactModel;
    }
}
