package ilcarrotests.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.AuthProvider;
import java.time.Duration;

public class ApplicationManager {
    WebDriver driver;
    UserHelper userHelper;//objavit helper
    //open selenium
    public void init(){
        driver = new ChromeDriver();//initialisation of web driver
        driver.navigate().to("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        userHelper = new UserHelper(driver);//initialisation with driver

    }
    public void tearDown(){//close selenium
        //driver.close();
        driver.quit();
    }
    public UserHelper getUserHelper(){//call userHelper
        return userHelper;
    }

}
