package co.bond.psautomationframework.robindexpageobjects;

import co.bond.psautomationframework.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by mikearias on 4/6/17.
 */
public class Robindex_Page {
    @FindBy(how = How.LINK_TEXT, using = "List")
    private WebElement listButton;
    @FindBy(how = How.LINK_TEXT, using = "Add")
    private WebElement addButton;
    private WebElement searchBox;

    public void clickOnListButton() {
        Driver.wait(1);
        listButton.click();
        listButton.click();
        Driver.wait(2);
    }

    public void clickOnAddButton() {
        Driver.wait(1);
        addButton.click();
        addButton.click();
        Driver.wait(2);
    }
}
