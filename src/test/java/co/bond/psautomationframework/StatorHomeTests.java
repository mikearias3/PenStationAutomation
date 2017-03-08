package co.bond.psautomationframework;

import co.bond.psautomationframework.data.BatchID;
import co.bond.psautomationframework.data.URL;
import co.bond.psautomationframework.statorpageobjects.*;
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
    public void initialize() { Driver.initialize(); }

    @Test
    public void user_Can_Launch_Stator()
    {
        Driver.navigate(URL.statorTesting);

        Stator_NavBar navBar = new Stator_NavBar(Driver.instance);
        navBar.clickOnStatorHomeButton();
    }

    @Test
    public void add_Batch_To_Shipment()
    {
        Driver.navigate(URL.statorTesting);

        Stator_HomePage homePage = new Stator_HomePage(Driver.instance);
        homePage.selectRowElement(BatchID.b25854);
        homePage.clickOnAddToShipmentButton();
        homePage.clickOnCurrentShipmentButton();

        Stator_CurrentShipmentPage currentShipmentPage = new Stator_CurrentShipmentPage(Driver.instance);
        currentShipmentPage.clickBatchLink(BatchID.b25854);
    }

    @Test
    public void add_Batch_To_Favorites()
    {
        Driver.navigate(URL.statorTesting);

        Stator_HomePage homePage = new Stator_HomePage(Driver.instance);
        homePage.addRowElementToFavorites(BatchID.b25855);

        Stator_NavBar navBar = new Stator_NavBar(Driver.instance);
        navBar.clickOnFavoriteBatchesButton();

        Stator_FavoriteBatchesPage favoriteBatchesPage = new Stator_FavoriteBatchesPage(Driver.instance);
        favoriteBatchesPage.clickOnRowLink(BatchID.b25855);
    }

    @Test
    public void submit_Order_With_1_Batch()
    {
        Driver.navigate(URL.statorTesting);

        Stator_HomePage home = new Stator_HomePage(Driver.instance);
        home.selectRowElement(BatchID.b25853);
        home.clickOnAddToShipmentButton();
        home.clickOnCurrentShipmentButton();

        Stator_CurrentShipmentPage shipmentPage = new Stator_CurrentShipmentPage(Driver.instance);
        shipmentPage.submitShipment();

        Stator_ShipmentSummaryPage shipmentSummaryPage = new Stator_ShipmentSummaryPage(Driver.instance);
        Assert.assertNotNull(shipmentSummaryPage.pageTitle);
    }

    @After
    public void cleanUp()
    {
        Driver.close();
    }
}
