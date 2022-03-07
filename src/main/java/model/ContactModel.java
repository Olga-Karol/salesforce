package model;

import java.util.Objects;

public class ContactModel {

    String Salutation;
    String FirstName;
    String LastName;
    String Title;
    String Phone;
    String Mobile;
    String Email;
    String MailingStreet;
    String MailingCity;
    String MailingZipPostalCode;
    String MailingCountry;
    String MailingStateProvince;
    String OtherStreet;
    String OtherCity;
    String OtherZipPostalCode;
    String OtherCountry;
    String OtherStateProvince;
    String Fax;
    String HomePhone;
    String OtherPhone;
    String AsstPhone;
    String Assistant;
    String Department;
    String LeadSource;
    String Birthdate;
    String Description;
    String MailingAddress;
    String OtherAddress;
    String Name;


    public ContactModel() {
    }

    public String getSalutation() {
        return Salutation;
    }

    public void setSalutation(String salutation) {
        Salutation = salutation;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMailingStreet() {
        return MailingStreet;
    }

    public void setMailingStreet(String mailingStreet) {
        MailingStreet = mailingStreet;
    }

    public String getMailingCity() {
        return MailingCity;
    }

    public void setMailingCity(String mailingCity) {
        MailingCity = mailingCity;
    }

    public String getMailingZipPostalCode() {
        return MailingZipPostalCode;
    }

    public void setMailingZipPostalCode(String mailingZipPostalCode) {
        MailingZipPostalCode = mailingZipPostalCode;
    }

    public String getMailingCountry() {
        return MailingCountry;
    }

    public void setMailingCountry(String mailingCountry) {
        MailingCountry = mailingCountry;
    }

    public String getMailingStateProvince() {
        return MailingStateProvince;
    }

    public void setMailingStateProvince(String mailingStateProvince) {
        MailingStateProvince = mailingStateProvince;
    }

    public String getOtherStreet() {
        return OtherStreet;
    }

    public void setOtherStreet(String otherStreet) {
        OtherStreet = otherStreet;
    }

    public String getOtherCity() {
        return OtherCity;
    }

    public void setOtherCity(String otherCity) {
        OtherCity = otherCity;
    }

    public String getOtherZipPostalCode() {
        return OtherZipPostalCode;
    }

    public void setOtherZipPostalCode(String otherZipPostalCode) {
        OtherZipPostalCode = otherZipPostalCode;
    }

    public String getOtherCountry() {
        return OtherCountry;
    }

    public void setOtherCountry(String otherCountry) {
        OtherCountry = otherCountry;
    }

    public String getOtherStateProvince() {
        return OtherStateProvince;
    }

    public void setOtherStateProvince(String otherStateProvince) {
        OtherStateProvince = otherStateProvince;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getHomePhone() {
        return HomePhone;
    }

    public void setHomePhone(String homePhone) {
        HomePhone = homePhone;
    }

    public String getOtherPhone() {
        return OtherPhone;
    }

    public void setOtherPhone(String otherPhone) {
        OtherPhone = otherPhone;
    }

    public String getAsstPhone() {
        return AsstPhone;
    }

    public void setAsstPhone(String asstPhone) {
        AsstPhone = asstPhone;
    }

    public String getAssistant() {
        return Assistant;
    }

    public void setAssistant(String assistant) {
        Assistant = assistant;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getLeadSource() {
        return LeadSource;
    }

    public void setLeadSource(String leadSource) {
        LeadSource = leadSource;
    }

    public String getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(String birthdate) {
        Birthdate = birthdate;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getMailingAddress() {
        return MailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        MailingAddress = mailingAddress;
    }

    public String getOtherAddress() {
        return OtherAddress;
    }

    public void setOtherAddress(String otherAddress) {
        OtherAddress = otherAddress;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    @Override
    public String toString() {
        return "ContactModel{" +
                "Title='" + Title + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Mobile='" + Mobile + '\'' +
                ", Email='" + Email + '\'' +
                ", Fax='" + Fax + '\'' +
                ", HomePhone='" + HomePhone + '\'' +
                ", OtherPhone='" + OtherPhone + '\'' +
                ", AsstPhone='" + AsstPhone + '\'' +
                ", Assistant='" + Assistant + '\'' +
                ", Department='" + Department + '\'' +
                ", LeadSource='" + LeadSource + '\'' +
                ", Birthdate='" + Birthdate + '\'' +
                ", Description='" + Description + '\'' +
                ", MailingAddress='" + MailingAddress + '\'' +
                ", OtherAddress='" + OtherAddress + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactModel that = (ContactModel) o;
        return Objects.equals(Title, that.Title) && Objects.equals(Phone, that.Phone) && Objects.equals(Mobile, that.Mobile) && Objects.equals(Email, that.Email) && Objects.equals(Fax, that.Fax) && Objects.equals(HomePhone, that.HomePhone) && Objects.equals(OtherPhone, that.OtherPhone) && Objects.equals(AsstPhone, that.AsstPhone) && Objects.equals(Assistant, that.Assistant) && Objects.equals(Department, that.Department) && Objects.equals(LeadSource, that.LeadSource) && Objects.equals(Birthdate, that.Birthdate) && Objects.equals(Description, that.Description) && Objects.equals(MailingAddress, that.MailingAddress) && Objects.equals(OtherAddress, that.OtherAddress) && Objects.equals(Name, that.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Title, Phone, Mobile, Email, Fax, HomePhone, OtherPhone, AsstPhone, Assistant, Department, LeadSource, Birthdate, Description, MailingAddress, OtherAddress, Name);
    }

    public String configureMailingAddress(){
        String mailingAddress = MailingStreet + "\n" + MailingCity + ", " + MailingStateProvince + " " + MailingZipPostalCode + "\n" + MailingCountry;
        return mailingAddress;
    }

    public String configureOtherAddress(){
        String otherAddress = OtherStreet + "\n" + OtherCity + ", " + OtherStateProvince + " " + OtherZipPostalCode + "\n" + OtherCountry;
        return otherAddress;
    }

    public String configureName(){
        String name = Salutation + " " + FirstName +  " " + LastName;
        return name;
    }
}

