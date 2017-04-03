package ru.hromml.test.portal.models;

public class DefaultPassengerFields {
    private final String namedefaultpassenger;
    private final String numberdefaultpassenger;
    private final String maildefaultpassenger;

    public DefaultPassengerFields(String namedefaultpassenger, String numberdefaultpassenger, String maildefaultpassenger) {
        this.namedefaultpassenger = namedefaultpassenger;
        this.numberdefaultpassenger = numberdefaultpassenger;
        this.maildefaultpassenger = maildefaultpassenger;
    }

    public String getNamedefaultpassenger() {
        return namedefaultpassenger;
    }

    public String getNumberdefaultpassenger() {
        return numberdefaultpassenger;
    }

    public String getMaildefaultpassenger() {
        return maildefaultpassenger;
    }
}
