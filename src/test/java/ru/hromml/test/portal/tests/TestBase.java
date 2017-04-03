package ru.hromml.test.portal.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.hromml.test.portal.manager.ApplicationManager;

/**
 * Created by hramkov on 02.03.2017.
 */
public class TestBase {

    protected final ApplicationManager applicationManager= new ApplicationManager(BrowserType.CHROME);;

   @BeforeMethod
   public void setUp() throws Exception {
               applicationManager.init();
    }

    @AfterMethod
    public void tearDown() {
        applicationManager.stop();
    }

    public ApplicationManager getApplicationManager() {
        return applicationManager;
    }
}
