package ru.hromml.test.portal.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by hramkov on 03.03.2017.
 */
public class SessionHelper extends HelperClass {

    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void loginCorporate(CorporateLoginData corporateLoginData) {                                                  // method for login by corporate
        type(By.name("auth[ACCOUNT]"), corporateLoginData.getAccountnumber());
        click(By.xpath("//form[@id='authForm']/div[3]/button"));
        if (isSelectedPresent(By.name("auth[PIN]"))){                                 // searching the pin field, if true - fills pin and caller
            type(By.name("auth[PIN]"), corporateLoginData.getPin());
            click(By.xpath("//form[@id='authForm']/div[3]/button"));
            if (isSelectedPresent(By.name("auth[CALLER]"))) {
                type(By.name("auth[CALLER]"), corporateLoginData.getCaller());
                click(By.xpath("//form[@id='authForm']/div[3]/button"));
            }
        } else if (isSelectedPresent(By.name("auth[PASSWORD]"))){                     // searching the password field, if true - fills password and caller
            type(By.name("auth[PASSWORD]"), corporateLoginData.getPin());
            click(By.xpath("//form[@id='authForm']/div[3]/button"));
            if (isSelectedPresent(By.name("auth[CALLER]"))) {
                type(By.name("auth[CALLER]"), corporateLoginData.getCaller());
                click(By.xpath("//form[@id='authForm']/div[3]/button"));
            }
        } else if (isSelectedPresent(By.name("auth[CALLER]"))){                       // searching the caller field, if true - fills caller
            type(By.name("auth[CALLER]"), corporateLoginData.getCaller());
            click(By.xpath("//form[@id='authForm']/div[3]/button"));
        }
    }

    public void chooseCorporateAccountType() {
        click(By.id("LoginAsCorporate"));
    }                                                                           // method for choosing login by corporate

    public void chooseRetailAccountType() {
        click(By.id("LoginAsRetail"));
    }                                                                              // method for choosing login by retail

    public void loginByRetail(RetailLoginData retailLoginData){                           // method for login by retail
        if (isSelectedPresent(By.name("auth[PHONE]"))) {
            type(By.name("auth[PHONE]"), retailLoginData.getRetailphone());
        } else if (isSelectedPresent(By.name("auth[EMAIL]"))){
            type(By.name("auth[EMAIL]"), retailLoginData.getRetailemail());
        }
            type(By.name("auth[PASSWORD]"), retailLoginData.getRetailpassword());
            click(By.xpath("//form[@id='authForm']/div[3]/button"));

    }

    public void loginCorporateByCaller(CorporateLoginData corporateLoginData){                       //method for login without pin or password (not used)
        type(By.name("auth[ACCOUNT]"),corporateLoginData.getAccountnumber());
        click(By.xpath("//form[@id='authForm']/div[3]/button"));
        type(By.name("auth[CALLER]"),corporateLoginData.getAccountnumber());
        click(By.xpath("//form[@id='authForm']/div[3]/button"));
    }

}
