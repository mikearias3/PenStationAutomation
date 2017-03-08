package co.bond.psautomationframework.statorpageobjects;

import co.bond.psautomationframework.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by mikearias on 3/2/17.
 */
public class Stator_Page {
    @FindBy(how = How.ID, using = "current-order")
    public WebElement currentShipmentButton;
    @FindBy(how = How.ID, using = "add-to-shipment")
    public WebElement addToShipmentButton;
    @FindBy(how = How.CLASS_NAME, using = "description")
    public WebElement descriptionTitle;
    public WebElement tableRowCheckbox;
    public WebElement tableRowLink;
    public WebElement tableRowFavorite;

    public void clickOnCurrentShipmentButton()
    {
        Driver.wait(1);
        currentShipmentButton.click();
    }

    public void clickOnAddToShipmentButton()
    {
        addToShipmentButton.click();
    }
}
