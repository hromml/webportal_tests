package ru.hromml.test.portal.tests;

import org.testng.annotations.Test;
import ru.hromml.test.portal.manager.CorporateLoginData;
import ru.hromml.test.portal.models.DefaultPassengerFields;

/**
 * Created by hramkov on 23.03.2017.
 */
public class ChangeMailDefaultPassengerTest extends TestBase{
    @Test
    public void testChangeMailDefaultPassenger(){
        applicationManager.getSessionHelper().chooseCorporateAccountType();
        applicationManager.getSessionHelper().loginCorporate(new CorporateLoginData("060992", "0609", "Sergey"));
        applicationManager.getNavigationHelper().openProfile();
        applicationManager.pauseOneSecond();
        applicationManager.getPassengerHelper().changeMailDefaultContact(new DefaultPassengerFields("","","hramkov@haulmont.com"));
    }

}
