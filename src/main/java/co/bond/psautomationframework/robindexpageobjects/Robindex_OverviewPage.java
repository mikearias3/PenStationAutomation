package co.bond.psautomationframework.robindexpageobjects;

import co.bond.psautomationframework.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

/**
 * Created by mikearias on 4/5/17.
 */
public class Robindex_OverviewPage extends Robindex_Page {
    private WebDriver instance;

    private WebElement overviewPageHeader;
    private WebElement robotNameButton;
    private WebElement robotClassification;
    private WebElement robotOperationStatus;
    private WebElement robotHealthStatus;
    private WebElement robotToolOpVersion;
    private WebElement robotLastMaintained;
    private WebElement robotLocation;
    private WebElement robotEditButton;
    @FindBy(how = How.CLASS_NAME, using = "page-link")
    private List<WebElement> pagination;

    public Robindex_OverviewPage(WebDriver instance) {
        this.instance = instance;
        PageFactory.initElements(instance, this);
        Driver.wait(1);
    }

    public boolean verifyOverviewPage() {
        overviewPageHeader = instance.findElement(By.tagName("h1"));

        String text = overviewPageHeader.getText();

        if(text.matches("Robot Status Overview")){
            return true;
        }else {
            return false;
        }
    }

    public void navigatePagination(int page) {
        pagination.get(page - 1).click();
    }

    public void clickOnRobotName(String name) {
        robotNameButton = instance.findElement(By.id(name + "-name"));
        robotNameButton.click();
    }

    public String getRobotClassification(String name) {
        robotClassification = instance.findElement(By.id(name + "-classification"));
        return robotClassification.getText();
    }

    public String getRobotOperationStatus(String name) {
        throw new NotImplementedException();
    }

    public String getRobotHealthStatus(String name) {
        robotHealthStatus = instance.findElement(By.id(name + "-health"));
        return robotHealthStatus.getText();
    }

    public String getRobotToolOpVersion(String name) {
        robotToolOpVersion = instance.findElement(By.id(name + "-toolop"));
        return robotToolOpVersion.getText();
    }

    public String getRobotLastMaintained(String name) {
        robotLastMaintained = instance.findElement(By.id(name + "-lastmaintained"));
        return robotLastMaintained.getText();
    }

    public String getRobotLocation(String name) {
        throw new NotImplementedException();
    }

    public void clickOnRobotEditButton(String name) {
        robotEditButton = instance.findElement(By.id(name + "-edit"));
        robotEditButton.click();
    }
}
