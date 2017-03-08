package co.bond.psautomationframework;

import co.bond.psautomationframework.data.BatchID;
import co.bond.psautomationframework.data.URL;
import co.bond.psautomationframework.statorpageobjects.Stator_CurrentShipmentPage;
import co.bond.psautomationframework.statorpageobjects.Stator_NavBar;
import co.bond.psautomationframework.statorpageobjects.Stator_HomePage;
import co.bond.psautomationframework.statorpageobjects.Stator_ShipmentSummaryPage;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mikearias on 3/1/17.
 */
public class StatorHomeTests
{
    @Before
    public void initialize() { Driver.Initialize(); }

    @Test
    public void user_Can_Launch_Stator()
    {
        Driver.Navigate(URL.statorTesting);

        Stator_NavBar navBar = new Stator_NavBar(Driver.Instance);
        navBar.clickOnStatorHomeButton();
    }

    @Test
    public void add_Batch_To_Shipment()
    {
        Driver.Navigate(URL.statorTesting);

        Stator_HomePage home = new Stator_HomePage(Driver.Instance);
        home.selectRowElement(BatchID.b25854);
        home.clickOnAddToShipmentButton();
        home.clickOnCurrentShipmentButton();

        Stator_CurrentShipmentPage currentShipmentPage = new Stator_CurrentShipmentPage(Driver.Instance);
        currentShipmentPage.clickBatchLink(BatchID.b25854);
    }

    @Test
    public void submit_Order_With_1_Batch()
    {
        Driver.Navigate(URL.statorTesting);

        Stator_HomePage home = new Stator_HomePage(Driver.Instance);
        home.selectRowElement(BatchID.b25853);
        home.clickOnAddToShipmentButton();
        home.clickOnCurrentShipmentButton();

        Stator_CurrentShipmentPage shipmentPage = new Stator_CurrentShipmentPage(Driver.Instance);
        shipmentPage.submitShipment();

        Stator_ShipmentSummaryPage shipmentSummaryPage = new Stator_ShipmentSummaryPage(Driver.Instance);
        Assert.assertNotNull(shipmentSummaryPage.pageTitle);
    }

    @After
    public void cleanUp()
    {
        Driver.Close();
    }
}
