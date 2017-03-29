package co.bond.psautomationframework.statorpageobjects;

import co.bond.psautomationframework.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

    public boolean verifyRowExistance(String id) {
        Driver.wait(1);
        tableRowLink = null;

        try {
            tableRowLink = Driver.instance.findElement(By.linkText(id));
        } catch (Exception e) {}


        if (tableRowLink != null)
        {
            return true;
        }
        return false;
    }

    public boolean verifyBatchesCounter(int quantityTotal) {
        Driver.wait(1);
        String linkText = currentShipmentButton.getText();
        if (linkText.contains(Integer.toString(quantityTotal)))
        {
            return true;
        }

        return false;
    }
}
