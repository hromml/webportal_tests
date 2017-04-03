package ru.hromml.test.portal.manager;

import com.sun.corba.se.spi.orbutil.fsm.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * Created by hramkov on 06.03.2017.
 */
public class HelperClass {
    protected WebDriver wd;
    public void pauseOneSecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public HelperClass(WebDriver wd) {
        this.wd=wd;
    }

    protected void click(By locate) {                                                           // method, that clicks on something (using locate)
        wd.findElement(locate).click();
    }

    protected void type(By locate, String text) {                                               // method, that fills needed field (using locate and text)
            if (text != null) {
                String existingtext = wd.findElement(locate).getAttribute("value");
                if (!Objects.equals(text, existingtext)) {
                    wd.findElement(locate).clear();
                    wd.findElement(locate).sendKeys(text);

                    if(isSelectedPresent(By.xpath(".//*[@id='AutoCompleteDropdownItem_0']/a[text()='"+text+"']"))){
                        wd.findElement(By.xpath(".//*[@id='AutoCompleteDropdownItem_0']/a[text()='"+text+"']")).click();
                        pauseOneSecond();
                    }


//                    if (isSelectedPresent(By.xpath(".//*[@class='autocomplete-dropdown dropdown-menu ng-scope']"))){
//                        new Select(wd.findElement(locate)).selectByVisibleText(text);    // not use, because it is not select field, it's input field
//                    }
                }
            }

    }

    public boolean isSelectedPresent(By locator) {                                                  // method, that checks element's availablity
        try {
            wd.findElement(locator);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }

    public boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }


}
