package co.bond.psautomationframework;

import co.bond.psautomationframework.statorpageobjects.Stator_HomePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mikearias on 3/1/17.
 */
public class StatorHomeTests
{
    @Before
    public void Initialize() { Driver.Initialize(); }

    @Test
    public void User_Can_Launch_Stator()
    {
        Driver.Navigate("http://stator-testing.ps.bondco.io");

        Stator_HomePage home = new Stator_HomePage(Driver.Instance);
        home.ClickOnStatorHomeButton();
    }

    @After
    public void CleanUp()
    {
        Driver.Close();
    }
}
