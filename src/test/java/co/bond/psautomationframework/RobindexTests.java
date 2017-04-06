package co.bond.psautomationframework;

import co.bond.psautomationframework.data.*;
import co.bond.psautomationframework.robindexpageobjects.Robindex_OverviewPage;
import co.bond.psautomationframework.statorpageobjects.*;
import junit.framework.Assert;
import org.apache.commons.lang3.concurrent.BasicThreadFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mikearias on 4/5/17.
 */
public class RobindexTests
{
    @Before
    public void initialize() { Driver.initialize(); }

    @Test
    public void user_Can_Launch_Robindex()
    {
        Driver.navigate(URL.robindexTesting);

        Robindex_OverviewPage overviewPage = new Robindex_OverviewPage(Driver.instance);
        Assert.assertTrue("Page failed to load", overviewPage.verifyOverviewPage());
    }

    @Test
    public void verify_Robot_Data_On_List_View()
    {
        Driver.navigate(URL.robindexTesting);

        Robindex_OverviewPage overviewPage = new Robindex_OverviewPage(Driver.instance);
        overviewPage.clickOnRobotName(RobotName.sara);
        overviewPage.clickOnListButton();
        Assert.assertEquals("staging", overviewPage.getRobotClassification(RobotName.sara));
        Assert.assertEquals("healthy", overviewPage.getRobotHealthStatus(RobotName.sara));
        Assert.assertEquals("1.1.0", overviewPage.getRobotToolOpVersion(RobotName.sara));
        Assert.assertEquals("January 9th, 2017", overviewPage.getRobotLastMaintained(RobotName.sara));
        overviewPage.clickOnRobotEditButton(RobotName.sara);
    }

    @After
    public void cleanUp()
    {
        Driver.close();
    }
}
