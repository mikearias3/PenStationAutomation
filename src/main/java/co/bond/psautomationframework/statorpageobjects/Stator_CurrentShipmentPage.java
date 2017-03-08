package co.bond.psautomationframework.statorpageobjects;

import co.bond.psautomationframework.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by mikearias on 3/7/17.
 */
public class Stator_CurrentShipmentPage {

    private WebDriver instance;

    @FindBy(how = How.ID, using = "submit-shipment")
    private WebElement submitShipmentButton;
    private WebElement batchRowLink;
    private WebElement batchQuantity;
    private WebElement batchFavoriteButton;
    private WebElement batchRemoveButton;

    public Stator_CurrentShipmentPage(WebDriver instance) {
        this.instance = instance;
        PageFactory.initElements(instance, this);
        Driver.wait(1);
    }

    public void modifyBatchQuantity(String id, int quantity)
    {
        throw new NotImplementedException();
//        batchQuantity = instance.findElement(By.id(id));
//        batchQuantity.sendKeys(Integer.toString(quantity));
    }

    public void addBatchToFavorites(String id)
    {
        batchFavoriteButton = instance.findElement(By.id("star-" + id));
        batchFavoriteButton.click();
    }

    public void removeBatchFromShipment(String id)
    {
        batchRemoveButton = instance.findElement(By.id("25852"));
        batchRemoveButton.click();
    }

    public void clickBatchLink(String id)
    {
        batchRowLink = instance.findElement(By.partialLinkText(id));
        batchRowLink.click();
    }

    public void submitShipment() {
        submitShipmentButton.click();
    }
}
