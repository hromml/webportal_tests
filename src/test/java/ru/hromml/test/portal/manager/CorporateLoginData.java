package ru.hromml.test.portal.manager;

public class CorporateLoginData {
    private final String accountnumber;
    private final String pin;
    private final String caller;

    public CorporateLoginData(String accountnumber, String pin, String caller) {
        this.accountnumber = accountnumber;
        this.pin = pin;
        this.caller = caller;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public String getPin() {
        return pin;
    }

    public String getCaller() {
        return caller;
    }
}
