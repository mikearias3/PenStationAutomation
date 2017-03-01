package co.bond.psautomationframework;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by mikearias on 3/1/17.
 */
public class Driver
{
    public static WebDriver Instance;

    public static void Initialize()
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver.mac");
        Instance = new ChromeDriver();
        Instance.manage().window().setSize(new Dimension(1280,730));
        Instance.manage().window().setPosition(new Point(0,0));
        Instance.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static void Wait(int seconds)
    {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void Close()
    {
        Instance.close();
    }

    public static void Navigate(String url)
    {
        Instance.navigate().to(url);
    }
}
