package ilcarrotests.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper{
    //constructor form BaseHelper
    public UserHelper(WebDriver driver) {
        super(driver);
    }
    By btnLoginNavigatorMenu = By.xpath("//a[contains(@href, '/login')]") ;//click on login button
    By inputEmailLoginForm = By.xpath("//input[@id='email']");//type email
    By inputPassword = By.xpath("//input[@id='password']"); //type password
    By btnYallaLoginForm = By.xpath("//button[@type='submit']");
    By textSuccessLoginPopUp = By.xpath("//h2[@class='message']");

}
