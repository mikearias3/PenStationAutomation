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
public class Stator_CurrentShipmentPage extends Stator_Page {

    private WebDriver instance;

    @FindBy(how = How.ID, using = "submit-shipment")
    private WebElement submitShipmentButton;
    private WebElement batchRowLink;
    private WebElement batchQuantity;
    private WebElement batchFavoriteButton;
    private WebElement batchRemoveButton;
    private WebElement tableRowLink;
    private WebElement quantityCounter;

    public Stator_CurrentShipmentPage(WebDriver instance) {
        this.instance = instance;
        PageFactory.initElements(instance, this);
        Driver.wait(1);
    }

    public void modifyBatchQuantity(String id, int quantity)
    {
        Driver.wait(1);
        batchQuantity = instance.findElement(By.id("quantity-" + id));
        batchQuantity.clear();
        batchQuantity.sendKeys(Integer.toString(quantity));
    }

    public void addBatchToFavorites(String id)
    {
        batchFavoriteButton = instance.findElement(By.id("star-" + id));
        batchFavoriteButton.click();
    }

    public void removeBatchFromShipment(String id)
    {
        Driver.wait(1);
        batchRemoveButton = instance.findElement(By.id(id));
        batchRemoveButton.click();
        Driver.wait(3);
    }

    public void clickBatchLink(String id)
    {
        batchRowLink = instance.findElement(By.partialLinkText(id));
        batchRowLink.click();
    }

    public void submitShipment() {
        submitShipmentButton.click();
    }

    public boolean verifySubmitShipmentButtonState() {
        if (submitShipmentButton.isEnabled())
        {
            return true;
        }
        return false;
    }
}
