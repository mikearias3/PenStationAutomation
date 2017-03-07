package co.bond.psautomationframework;

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
        Driver.Navigate("http://stator-testing.ps.bondco.io");

        Stator_NavBar navBar = new Stator_NavBar(Driver.Instance);
        navBar.ClickOnStatorHomeButton();
    }

    @Test
    public void Add_Batch_To_Shipment()
    {
        Driver.Navigate("http://stator-testing.ps.bondco.io");

        Stator_HomePage home = new Stator_HomePage(Driver.Instance);
        home.SelectRowElement("25922");
        home.ClickOnAddToShipmentButton();
        //... Validate Current Shipment Screen
    }

    @Test
    public void Submit_Order_With_1_Batch()
    {
        Driver.Navigate("http://stator-testing.ps.bondco.io");

        Stator_HomePage home = new Stator_HomePage(Driver.Instance);
        home.SelectRowElement("25853");
        home.ClickOnAddToShipmentButton();
        home.ClickOnCurrentShipmentButton();

        Stator_CurrentShipmentPage shipmentPage = new Stator_CurrentShipmentPage(Driver.Instance);
        shipmentPage.submitShipment();

        Stator_ShipmentSummaryPage shipmentSummaryPage = new Stator_ShipmentSummaryPage(Driver.Instance);
        Assert.assertNotNull(shipmentSummaryPage.pageTitle);
    }

    @After
    public void CleanUp()
    {
        Driver.Close();
    }
}
