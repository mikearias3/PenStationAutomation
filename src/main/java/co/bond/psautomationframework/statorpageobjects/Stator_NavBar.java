package co.bond.psautomationframework.statorpageobjects;

import co.bond.psautomationframework.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mikearias on 3/2/17.
 */
public class Stator_NavBar {

    private WebDriver instance;

    @FindBy(how = How.ID, using = "stator-home")
    public WebElement statorHomeButton;
    @FindBy(how = How.ID, using = "closed-batches")
    public WebElement closedBatchesButton;
    @FindBy(how = How.ID, using = "favorite-batches")
    public WebElement favoriteBatchesButton;
    @FindBy(how = How.ID, using = "shipment-history")
    public WebElement shipmentHistory;
    @FindBy(how = How.ID, using = "batch-search")
    public WebElement searchBar;

    public Stator_NavBar(WebDriver instance) {
        this.instance = instance;
        PageFactory.initElements(instance, this);
    }

    public void ClickOnStatorHomeButton() {
        Driver.Wait(1);
        statorHomeButton.click();
    }
}


