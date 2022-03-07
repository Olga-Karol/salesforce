package model;

import java.util.Objects;

public class AccountModel {

    String AccountName;
    String Phone;
    String Fax;
    String Website;
    String Type;
    String Industry;
    int Employees;
    String AnnualRevenue;
    String Description;
    String BillingStreet;
    String BillingCity;
    String BillingZipPostalCode;
    String BillingCountry;
    String BillingStateProvince;
    String ShippingStreet;
    String ShippingCity;
    String ShippingZipPostalCode;
    String ShippingCountry;
    String ShippingStateProvince;
    String BillingAddress;
    String ShippingAddress;


    public AccountModel() {
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String website) {
        Website = website;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getIndustry() {
        return Industry;
    }

    public void setIndustry(String industry) {
        Industry = industry;
    }

    public int getEmployees() {
        return Employees;
    }

    public void setEmployees(int employees) {
        Employees = employees;
    }

    public String getAnnualRevenue() {
        return AnnualRevenue;
    }

    public void setAnnualRevenue(String annualRevenue) {
        AnnualRevenue = annualRevenue;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getBillingStreet() {
        return BillingStreet;
    }

    public void setBillingStreet(String billingStreet) {
        BillingStreet = billingStreet;
    }

    public String getBillingCity() {
        return BillingCity;
    }

    public void setBillingCity(String billingCity) {
        BillingCity = billingCity;
    }

    public String getBillingZipPostalCode() {
        return BillingZipPostalCode;
    }

    public void setBillingZipPostalCode(String billingZipPostalCode) {
        BillingZipPostalCode = billingZipPostalCode;
    }

    public String getBillingCountry() {
        return BillingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        BillingCountry = billingCountry;
    }

    public String getBillingStateProvince() {
        return BillingStateProvince;
    }

    public void setBillingStateProvince(String billingStateProvince) {
        BillingStateProvince = billingStateProvince;
    }

    public String getShippingStreet() {
        return ShippingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        ShippingStreet = shippingStreet;
    }

    public String getShippingCity() {
        return ShippingCity;
    }

    public void setShippingCity(String shippingCity) {
        ShippingCity = shippingCity;
    }

    public String getShippingZipPostalCode() {
        return ShippingZipPostalCode;
    }

    public void setShippingZipPostalCode(String shippingZipPostalCode) {
        ShippingZipPostalCode = shippingZipPostalCode;
    }

    public String getShippingCountry() {
        return ShippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        ShippingCountry = shippingCountry;
    }

    public String getShippingStateProvince() {
        return ShippingStateProvince;
    }

    public void setShippingStateProvince(String shippingStateProvince) {
        ShippingStateProvince = shippingStateProvince;
    }

    public String getBillingAddress() {
        return BillingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        BillingAddress = billingAddress;
    }

    public String getShippingAddress() {
        return ShippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        ShippingAddress = shippingAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountModel that = (AccountModel) o;
        return Employees == that.Employees && Objects.equals(AccountName, that.AccountName) && Objects.equals(Phone, that.Phone) && Objects.equals(Fax, that.Fax) && Objects.equals(Website, that.Website) && Objects.equals(Type, that.Type) && Objects.equals(Industry, that.Industry) && Objects.equals(AnnualRevenue, that.AnnualRevenue) && Objects.equals(Description, that.Description) && Objects.equals(BillingAddress, that.BillingAddress) && Objects.equals(ShippingAddress, that.ShippingAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(AccountName, Phone, Fax, Website, Type, Industry, Employees, AnnualRevenue, Description, BillingAddress, ShippingAddress);
    }

    @Override
    public String toString() {
        return "AccountModel{" +
                "AccountName='" + AccountName + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Fax='" + Fax + '\'' +
                ", Website='" + Website + '\'' +
                ", Type='" + Type + '\'' +
                ", Industry='" + Industry + '\'' +
                ", Employees=" + Employees +
                ", AnnualRevenue='" + AnnualRevenue + '\'' +
                ", Description='" + Description + '\'' +
                ", BillingAddress='" + BillingAddress + '\'' +
                ", ShippingAddress='" + ShippingAddress + '\'' +
                '}';
    }

    public String configureBillingAddress(){
        String billingAddress = BillingStreet + "\n" + BillingCity + ", " + BillingStateProvince + " " + BillingZipPostalCode + "\n" + BillingCountry;
        return billingAddress;
    }

    public String configureShippingAddress(){
        String shippingAddress = ShippingStreet + "\n" + ShippingCity + ", " + ShippingStateProvince + " " + ShippingZipPostalCode + "\n" + ShippingCountry;
        return shippingAddress;
    }
}

