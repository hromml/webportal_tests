package ru.hromml.test.portal.tests;

import org.testng.annotations.Test;
import ru.hromml.test.portal.manager.CorporateLoginData;
import ru.hromml.test.portal.models.DefaultContactFields;

/**
 * Created by hramkov on 06.03.2017.
 */
public class ChangeNumberDefaultContactTest extends TestBase{
    @Test
    public void testChangeNumberDefaultContact(){
            applicationManager.getSessionHelper().chooseCorporateAccountType();
            applicationManager.getSessionHelper().loginCorporate(new CorporateLoginData("060992", "0609", "Sergey"));
            applicationManager.getNavigationHelper().openProfile();
            applicationManager.pauseOneSecond();
            applicationManager.getContactHelper().changeNumberDefaultContact(new DefaultContactFields("","79874454161",""));
    };
}
