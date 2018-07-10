package utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by laxmikant on 18/05/2017.
 */
public class LoginFunction {
   // static WebDriver driver;
   WebDriver driver;
    public  void LogFunction(WebDriver driver) throws InterruptedException {

        Thread.sleep(1000);
      driver.findElement(By.xpath(".//*[@id='txtLN']")).sendKeys("Bheensen");
      driver.findElement(By.xpath(".//*[@id='txtPW']")).sendKeys("a");
      driver.findElement(By.xpath(".//*[@id='Button1']")).click();



        /*

        LoginConsole loginConsole =new LoginConsole(driver);
        loginConsole.setUsername("aditi@midc.com");
        loginConsole.setPassword("Admin@123");
        loginConsole.ClickLoginBtn();
*/


    }

}
