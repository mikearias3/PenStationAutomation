package co.bond.psautomationframework.statorpageobjects;

import co.bond.psautomationframework.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mikearias on 3/1/17.
 */
public class Stator_HomePage {

    private WebDriver instance;

    @FindBy(how = How.ID, using = "stator-home")
    private WebElement StatorHomeButton;

    public Stator_HomePage(WebDriver instance) {
        this.instance = instance;
        PageFactory.initElements(instance, this);
    }

    public void ClickOnStatorHomeButton() {
        Driver.Wait(1);
        StatorHomeButton.click();
    }
}
