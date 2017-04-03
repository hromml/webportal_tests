package ru.hromml.test.portal.tests;

import org.testng.annotations.Test;
import ru.hromml.test.portal.manager.CorporateLoginData;

public class OpenAddressBookTest extends TestBase {

    @Test
    public void testOpenAddressBook() {
        applicationManager.getSessionHelper().chooseCorporateAccountType();
        applicationManager.getSessionHelper().loginCorporate(new CorporateLoginData("060992", "0609", "Sergey"));
        applicationManager.getNavigationHelper().openAddressBook();
        applicationManager.pauseOneSecond();
    }
}