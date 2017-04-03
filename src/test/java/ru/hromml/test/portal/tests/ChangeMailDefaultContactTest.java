package ru.hromml.test.portal.tests;

import org.testng.annotations.Test;
import ru.hromml.test.portal.manager.CorporateLoginData;
import ru.hromml.test.portal.models.DefaultContactFields;

/**
 * Created by hramkov on 06.03.2017.
 */
public class ChangeMailDefaultContactTest extends TestBase{
    @Test
    public void testChangeMailDefaultContact(){
        applicationManager.getSessionHelper().chooseCorporateAccountType();
        applicationManager.getSessionHelper().loginCorporate(new CorporateLoginData("060992", "0609", "Sergey"));
        applicationManager.getNavigationHelper().openProfile();
        applicationManager.pauseOneSecond();
        applicationManager.getContactHelper().changeMailDefaultContact(new DefaultContactFields("","","hramkov@haulmont.com"));
    }
}
