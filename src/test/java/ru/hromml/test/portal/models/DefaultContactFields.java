package ru.hromml.test.portal.models;

public class DefaultContactFields {
    private final String namedefaultcontact;
    private final String numberdefaultcontact;
    private final String maildefaultcontact;

    public DefaultContactFields(String namedefaultcontact, String numberdefaultcontact, String maildefaultcontact) {
        this.namedefaultcontact = namedefaultcontact;
        this.numberdefaultcontact = numberdefaultcontact;
        this.maildefaultcontact = maildefaultcontact;
    }

    public String getNamedefaultcontact() {
        return namedefaultcontact;
    }

    public String getNumberdefaultcontact() {
        return numberdefaultcontact;
    }

    public String getMaildefaultcontact() {
        return maildefaultcontact;
    }
}
