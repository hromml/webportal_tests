package ru.hromml.test.portal.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

/**
 * Created by hramkov on 03.03.2017.
 */
public class ApplicationManager {

    WebDriver wd;


    private PassengerHelper passengerHelper;
    private NavigationHelper navigationHelper;
    private SessionHelper sessionHelper;
    private ContactHelper contactHelper;
    private CustomerServiceHelper customerServiceHelper;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        if (browser == BrowserType.FIREFOX ) {
            System.setProperty("webdriver.gecko.driver", "C:\\from D\\geckodriver.exe");
            wd = new FirefoxDriver();
        } else if (browser == BrowserType.CHROME) {
            System.setProperty("webdriver.chrome.driver", "C:\\from D\\chromedriver.exe");
            wd = new ChromeDriver();
        } else if (browser == BrowserType.IE) {
            System.setProperty("webdriver.ie.driver", "C:\\from D\\IEDriverServer.exe");
            wd = new InternetExplorerDriver();
            pauseOneSecond();
        }
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        contactHelper = new ContactHelper(wd);
        sessionHelper = new SessionHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        passengerHelper = new PassengerHelper(wd);
        customerServiceHelper = new CustomerServiceHelper(wd);
        openPortal("http://192.168.44.154:8083/portal/");
    }


    public void openPortal(String serverurl) {
        wd.get(serverurl);
    }

    public void pauseOneSecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public PassengerHelper getPassengerHelper() {
        return passengerHelper;
    }

    public CustomerServiceHelper getCustomerServiceHelper() {
        return customerServiceHelper;
    }

    public void stop() {
        wd.quit();
    }
}
