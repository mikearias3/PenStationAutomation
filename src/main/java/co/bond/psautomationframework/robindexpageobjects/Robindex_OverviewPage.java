package co.bond.psautomationframework.robindexpageobjects;

import co.bond.psautomationframework.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mikearias on 4/5/17.
 */
public class Robindex_OverviewPage {
    private WebDriver instance;

    private WebElement overviewPageHeader;

    public Robindex_OverviewPage(WebDriver instance) {
        this.instance = instance;
        PageFactory.initElements(instance, this);
        Driver.wait(1);
    }

    public boolean verifyOverviewPage() {
        Driver.wait(1);

        overviewPageHeader = instance.findElement(By.tagName("h1"));

        String text = overviewPageHeader.getText();

        if(text.matches("Robot Status Overview")){
            return true;
        }else {
            return false;
        }
    }
}
