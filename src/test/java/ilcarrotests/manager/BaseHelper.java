package ilcarrotests.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;

public class BaseHelper {
    WebDriver driver;
    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }
    private WebElement findElementBase(By locator){
        return driver.findElement(locator);
    }
    private List<WebElement> findElementsBase(By locator){
        return driver.findElements(locator);
    }
    public void clickBase(By locator){
        //wait.until().ExpectedCondition.isVisibleOf(locator);
        WebElement el = findElementBase(locator);
        el.click();
    }
    public String getTextBase(By locator){
        WebElement el = findElementBase(locator);
        return el.getText().trim().toUpperCase();
    }
    public void typeTextBase(By locator, String text){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        WebElement el = findElementBase(locator);
        el.click();
        el.clear();
        el.sendKeys(text);
    }
    public boolean isTextEqual(By locator, String expectedResult){//== Assert.assert.equal
        String actualResult = getTextBase(locator);//all letters are UPPERCASE
        expectedResult = expectedResult.toUpperCase();
        if(expectedResult.equals(actualResult)){
            return true;
        }else{
            System.out.println("expected result" + expectedResult + "actual result" + actualResult);
            return false;
        }

    }
}
