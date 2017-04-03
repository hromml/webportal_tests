package ru.hromml.test.portal.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.hromml.test.portal.models.DefaultContactFields;

/**
 * Created by hramkov on 03.03.2017.
 */
public class ContactHelper extends HelperClass{

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void changeDefaultContact(DefaultContactFields defaultContactFields) {
        type(By.xpath("//div[@class='row']/corporate-default-contact/div/div/form/div[1]/div/div/input"), defaultContactFields.getNamedefaultcontact());
        type(By.xpath("//div[@class='row']/corporate-default-contact/div/div/form/div[2]/div/input"),defaultContactFields.getNumberdefaultcontact());
        type(By.xpath("//div[@class='row']/corporate-default-contact/div/div/form/div[3]/div/input"),defaultContactFields.getMaildefaultcontact());
        click(By.xpath("//div[@class='row']/corporate-default-contact/div/div/form/div[4]/div/button"));
    }

    public void changeNumberDefaultContact(DefaultContactFields defaultContactFields) {
        type(By.xpath("//div[@class='row']/corporate-default-contact/div/div/form/div[2]/div/input"),defaultContactFields.getNumberdefaultcontact());
        click(By.xpath("//div[@class='row']/corporate-default-contact/div/div/form/div[4]/div/button"));
    }

    public void changeMailDefaultContact(DefaultContactFields defaultContactFields) {
        type(By.xpath("//div[@class='row']/corporate-default-contact/div/div/form/div[3]/div/input"),defaultContactFields.getMaildefaultcontact());
        click(By.xpath("//div[@class='row']/corporate-default-contact/div/div/form/div[4]/div/button"));
    }

}
