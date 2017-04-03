package ru.hromml.test.portal.tests;

import org.testng.annotations.Test;
import ru.hromml.test.portal.manager.CorporateLoginData;
import ru.hromml.test.portal.models.DefaultContactFields;

public class ChangeDefaultContactTest extends TestBase{

    @Test
    public void testChangeDefaultContact() {
        applicationManager.getSessionHelper().chooseCorporateAccountType();
        applicationManager.getSessionHelper().loginCorporate(new CorporateLoginData("060992", "0609", "Sergey"));
        applicationManager.getNavigationHelper().openProfile();
        applicationManager.pauseOneSecond();
        applicationManager.getContactHelper().changeDefaultContact(new DefaultContactFields("Sergey 6", "79874454160", "hramkov@haulmont.com"));
    }
}
