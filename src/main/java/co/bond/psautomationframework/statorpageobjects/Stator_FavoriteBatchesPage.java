package co.bond.psautomationframework.statorpageobjects;

import jdk.nashorn.internal.runtime.ECMAException;
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

    public void removeRowElementToFavorites(String id) {
        tableRowFavorite = instance.findElement(By.id("star-" + id));
        tableRowFavorite.click();
    }

    public boolean verifyRowExistance(String id) {
        tableRowLink = null;

        try {
            tableRowLink = instance.findElement(By.linkText(id));
        } catch (Exception e) {}


        if (tableRowLink != null)
        {
            return true;
        }
        return false;
    }
}
