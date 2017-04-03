package ru.hromml.test.portal.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.hromml.test.portal.models.DefaultPassengerFields;

/**
 * Created by hramkov on 03.03.2017.
 */
public class PassengerHelper extends HelperClass{

    public PassengerHelper(WebDriver wd) {
        super(wd);
    }

    public void changeDefaultPassenger(DefaultPassengerFields defaultPassengerFields) {
        type(By.cssSelector("input.form-control.input-lg"),defaultPassengerFields.getNamedefaultpassenger());
        click(By.cssSelector("h3.ng-scope"));
        type(By.xpath("//div[@class='row']/corporate-default-passenger/div/div/form/div[2]/div/input"),defaultPassengerFields.getNumberdefaultpassenger());
        click(By.cssSelector("h3.ng-scope"));
        type(By.xpath("//div[@class='row']/corporate-default-passenger/div/div/form/div[3]/div/input"),defaultPassengerFields.getMaildefaultpassenger());
        click(By.cssSelector("h3.ng-scope"));
        click(By.xpath("//div[@class='row']/corporate-default-passenger/div/div/form/div[4]/div/button"));
    }

    public void changeMailDefaultContact(DefaultPassengerFields defaultPassengerFields) {
        type(By.xpath("//div[@class='row']/corporate-default-passenger/div/div/form/div[3]/div/input"),defaultPassengerFields.getMaildefaultpassenger());
        click(By.xpath("//div[@class='row']/corporate-default-passenger/div/div/form/div[4]/div/button"));
    }

    public void changeNumberDefaultContact(DefaultPassengerFields defaultPassengerFields) {
        type(By.xpath("//div[@class='row']/corporate-default-passenger/div/div/form/div[2]/div/input"),defaultPassengerFields.getNumberdefaultpassenger());
        click(By.xpath("//div[@class='row']/corporate-default-passenger/div/div/form/div[4]/div/button"));
    }
}
