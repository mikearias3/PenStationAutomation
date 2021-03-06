package co.bond.psautomationframework.statorpageobjects;

import co.bond.psautomationframework.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mikearias on 3/1/17.
 */
public class Stator_HomePage extends Stator_Page{

    private WebDriver instance;

    public Stator_HomePage(WebDriver instance) {
        this.instance = instance;
        PageFactory.initElements(instance, this);
        Driver.wait(1);
    }

    public void selectRowElement(String id)
    {
        tableRowCheckbox = instance.findElement(By.id(id));
        tableRowCheckbox.click();
    }

    public void clickOnRowElement(String id)
    {
        tableRowLink = instance.findElement(By.linkText(id));
        tableRowLink.click();
    }

    public void addRowElementToFavorites(String id)
    {
        tableRowFavorite = instance.findElement(By.id("star-" + id));
        tableRowFavorite.click();
    }

}
