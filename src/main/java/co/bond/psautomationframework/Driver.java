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
    public static WebDriver instance;

    public static void initialize()
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver.mac");
        instance = new ChromeDriver();
        instance.manage().window().setSize(new Dimension(1280,730));
        instance.manage().window().setPosition(new Point(0,0));
        instance.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static void wait(int seconds)
    {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void close()
    {
        instance.close();
    }

    public static void navigate(String url)
    {
        instance.navigate().to(url);
    }
}
