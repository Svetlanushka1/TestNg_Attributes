package ilcarrotests.manager;

import ilcarrotests.datatransferobject.UserDTO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper{
    //constructor form BaseHelper
    public UserHelper(WebDriver driver) {
        super(driver);
    }
    By btnLoginNavigatorMenu = By.xpath("//a[contains(@href, '/login')]") ;//click on login button
    By inputEmailLoginForm = By.xpath("//input[@id='email']");//type email
    By inputPasswordLoginForm = By.xpath("//input[@id='password']"); //type password
    By btnYallaLoginForm = By.xpath("//button[@type='submit']");
    By textSuccessLoginPopUp = By.xpath("//h2[@class='message']");


    public void login(UserDTO userDTO) {
        clickBase(btnLoginNavigatorMenu);
        typeTextBase(inputEmailLoginForm, userDTO.getEmail());
        typeTextBase(inputPasswordLoginForm, userDTO.getPassword());
        clickBase(btnYallaLoginForm);
    }

    public boolean ValidatePopUpMassageSuccessAfterLogin() {
        return isTextEqual(textSuccessLoginPopUp, "Logged in success");
    }
}
