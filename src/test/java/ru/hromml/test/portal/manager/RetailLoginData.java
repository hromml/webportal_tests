package ru.hromml.test.portal.manager;

public class RetailLoginData {
    private final String retailphone;
    private final String retailpassword;
    private final String retailemail;

    public RetailLoginData(String retailphone, String retailpassword, String retailemail) {
        this.retailphone = retailphone;
        this.retailpassword = retailpassword;
        this.retailemail = retailemail;
    }

    public String getRetailphone() {
        return retailphone;
    }

    public String getRetailpassword() {
        return retailpassword;
    }

    public String getRetailemail() { return retailemail;
    }
}
