package ilcarrotests.tests;

import ilcarrotests.manager.ApplicationManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    static ApplicationManager app = new ApplicationManager();
    @BeforeSuite
    public void setUp(){
        app.init();
    }
    @AfterSuite
    public void tearDown(){
        app.tearDown();
    }

}
