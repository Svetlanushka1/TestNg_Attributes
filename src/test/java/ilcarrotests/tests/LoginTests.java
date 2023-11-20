package ilcarrotests.tests;

import ilcarrotests.datatransferobject.UserDTO;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test
    public void positiveLoginUserDTO(){
        UserDTO userDTO = new UserDTO("haifa@gmail.com","Haifa082022$");
        app.getUserHelper().login(userDTO);//
        Assert.assertTrue(app.getUserHelper().ValidatePopUpMassageSuccessAfterLogin());
    }
}
