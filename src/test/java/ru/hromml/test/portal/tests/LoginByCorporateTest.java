package ru.hromml.test.portal.tests;

import org.testng.annotations.Test;
import ru.hromml.test.portal.manager.CorporateLoginData;

/**
 * Created by hramkov on 10.03.2017.
 */
public class LoginByCorporateTest extends TestBase{
    @Test
    public void testLoginByCorporate(){
        applicationManager.getSessionHelper().chooseCorporateAccountType();
        applicationManager.getSessionHelper().loginCorporate(new CorporateLoginData("060992", "0609", "Sergey"));
        applicationManager.pauseOneSecond();
        applicationManager.getNavigationHelper().openMyBookings();
    }
}
