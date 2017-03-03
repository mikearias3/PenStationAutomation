package co.bond.psautomationframework.statorpageobjects;

import co.bond.psautomationframework.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mikearias on 3/1/17.
 */
public class Stator_HomePage extends Stator_Page{

    private WebDriver instance;

    public Stator_HomePage(WebDriver instance) {
        this.instance = instance;
        PageFactory.initElements(instance, this);
        Driver.Wait(1);
    }

    public void SelectRowElement (String id)
    {
        tableRowCheckbox = instance.findElement(By.id(id));
        tableRowCheckbox.click();
    }

    public void ClickOnRowElement (String id)
    {
        tableRowLink = instance.findElement(By.linkText(id));
        tableRowLink.click();
    }

    public void AddRowElementToFavorites (String id)
    {
        tableRowFavorite = instance.findElement(By.id("star-" + id));
        tableRowFavorite.click();
    }
}
