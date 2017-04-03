package ru.hromml.test.portal.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by hramkov on 07.03.2017.
 */
public class CustomerServiceHelper extends HelperClass {

    public CustomerServiceHelper(WebDriver wd) {
        super(wd);
    }

    public void OpenCustomerService(){
        click(By.xpath("//div[2]/div/div/div[2]/a"));
    }
}
