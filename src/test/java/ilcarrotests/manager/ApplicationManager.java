package ilcarrotests.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {
    WebDriver driver;
    //open selenium
    public void init(){
        driver = new ChromeDriver();//initialisation of web driver
        driver.navigate().to("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

    }
    public void tearDown(){//close selenium
        //driver.close();
        driver.quit();
    }
}
