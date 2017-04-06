package co.bond.psautomationframework;

import co.bond.psautomationframework.data.ApiMockerHandler;
import co.bond.psautomationframework.data.BatchID;
import co.bond.psautomationframework.data.BatchSet;
import co.bond.psautomationframework.data.URL;
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

    @After
    public void cleanUp()
    {
        Driver.close();
    }
}
