package ru.hromml.test.portal.tests;

import org.testng.annotations.Test;
import ru.hromml.test.portal.manager.RetailLoginData;

/**
 * Created by hramkov on 10.03.2017.
 */
public class LoginByRetailTest extends TestBase {
    @Test
    public void testLoginByRetail(){
        applicationManager.getSessionHelper().chooseRetailAccountType();
        applicationManager.getSessionHelper().loginByRetail(new RetailLoginData("79874454160", "qwertyui", ""));
        applicationManager.pauseOneSecond();
        applicationManager.getNavigationHelper().openNewBooking();
    }
}
