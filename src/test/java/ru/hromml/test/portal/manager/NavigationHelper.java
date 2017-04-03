package ru.hromml.test.portal.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Created by hramkov on 03.03.2017.
 */
public class NavigationHelper extends HelperClass{

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void openProfile() {
        click(By.xpath("//div[1]/nav/div/div[2]/ul/li[5]/a"));
    }

    public void openAddressBook() {
        click(By.xpath("//div[1]/nav/div/div[2]/ul/li[4]/a"));
    }

    public void openMyBookings() {
        click(By.xpath("//div[1]/nav/div/div[2]/ul/li[2]/a"));
    }

    public void openNewBooking() {
        click(By.xpath("//div[1]/nav/div/div[2]/ul/li[1]/a"));
    }

    public void openWebSite() {
        click(By.xpath("//div[1]/nav/div/div[1]/company-logo"));
    }
}
