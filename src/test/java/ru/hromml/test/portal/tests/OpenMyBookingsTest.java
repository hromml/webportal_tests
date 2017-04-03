package ru.hromml.test.portal.tests;

import org.testng.annotations.Test;
import ru.hromml.test.portal.manager.CorporateLoginData;

/**
 * Created by hramkov on 06.03.2017.
 */
public class OpenMyBookingsTest extends TestBase {
    @Test
    public void testOpenMyBookings(){
        applicationManager.getSessionHelper().chooseCorporateAccountType();
        applicationManager.getSessionHelper().loginCorporate(new CorporateLoginData("060992", "0609", "Sergey"));
        applicationManager.getNavigationHelper().openMyBookings();
    }
}
