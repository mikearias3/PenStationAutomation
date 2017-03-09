package co.bond.psautomationframework.statorpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mikearias on 3/9/17.
 */
public class Stator_ShipmentHistoryPage extends Stator_Page {

    private WebDriver instance;

    public Stator_ShipmentHistoryPage(WebDriver instance) {
        this.instance = instance;
        PageFactory.initElements(instance, this);
    }

    public void clickOnRowLink(String id) {
        tableRowLink = instance.findElement(By.linkText(id));
        tableRowLink.click();
    }

    public void selectRowElement(String id) {
        tableRowCheckbox = instance.findElement(By.xpath("//tr/td/ul/li/div/a[contains(text(), '" + id + "')]/../../../../../td/div/input"));
        tableRowCheckbox.click();
    }
}
