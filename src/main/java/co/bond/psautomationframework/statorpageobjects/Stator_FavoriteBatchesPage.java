package co.bond.psautomationframework.statorpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mikearias on 3/8/17.
 */
public class Stator_FavoriteBatchesPage extends Stator_Page {

    private WebDriver instance;

    public Stator_FavoriteBatchesPage(WebDriver instance) {
        this.instance = instance;
        PageFactory.initElements(instance, this);
    }

    public void clickOnRowLink(String id) {
        tableRowLink = instance.findElement(By.linkText(id));
    }
}
