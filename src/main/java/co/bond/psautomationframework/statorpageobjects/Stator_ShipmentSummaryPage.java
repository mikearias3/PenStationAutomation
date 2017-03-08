package co.bond.psautomationframework.statorpageobjects;

import co.bond.psautomationframework.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mikearias on 3/7/17.
 */
public class Stator_ShipmentSummaryPage {

    private WebDriver instance;

    @FindBy(how = How.XPATH, using = "h1[contains(text(), 'Shipment Summary')]")
    public WebElement pageTitle;
    private WebElement batchRowLink;

    public Stator_ShipmentSummaryPage(WebDriver instance) {
        this.instance = instance;
        PageFactory.initElements(instance, this);
        Driver.wait(1);
    }
}
