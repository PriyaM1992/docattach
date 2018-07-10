package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static utilities.OpenBrowser.GetUrl;
import static utilities.OpenBrowser.openBrowser;

public class Demo {

    static  WebDriver driver;
    @Test
    public void Deme1() throws InterruptedException

    { driver= openBrowser("chrome");
        GetUrl("url");
        //LogFunction(driver);

        driver.findElement(By.xpath(".//*[@id='txtLN']")).sendKeys("Bheensen");

/*

        driver.findElement(By.xpath(".//*[@id='txtPW']")).sendKeys("a");
        driver.findElement(By.xpath(".//*[@id='Button1']")).click();

*/


    }
}
