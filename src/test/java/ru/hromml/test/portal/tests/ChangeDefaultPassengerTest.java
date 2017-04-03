package ru.hromml.test.portal.tests;

import org.testng.annotations.Test;
import ru.hromml.test.portal.manager.CorporateLoginData;
import ru.hromml.test.portal.models.DefaultPassengerFields;

public class ChangeDefaultPassengerTest extends TestBase{

    @Test
    public void testChangeDefaultPassenger() {
        applicationManager.getSessionHelper().chooseCorporateAccountType();
        applicationManager.getSessionHelper().loginCorporate(new CorporateLoginData("060992", "0609", "Sergey"));
        applicationManager.getNavigationHelper().openProfile();
        applicationManager.pauseOneSecond();
        applicationManager.getPassengerHelper().changeDefaultPassenger(new DefaultPassengerFields("Sergey 9", "79874454160", "hramkov@haulmont.com"));
    }

}
