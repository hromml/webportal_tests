package ru.hromml.test.portal.tests;

import org.testng.annotations.Test;

/**
 * Created by hramkov on 07.03.2017.
 */
public class OpenCustomerServiceTest extends TestBase{
    @Test
    public void testOpenCustomerService(){
        applicationManager.getCustomerServiceHelper().OpenCustomerService();
    }
}
