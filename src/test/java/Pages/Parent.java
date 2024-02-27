package Pages;

import Utilities.GWDD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {
    WebDriverWait wait=new WebDriverWait(GWDD.getDriver(),Duration.ofSeconds(30));

    public  void sendkeysFunction(WebElement element, String yazi){
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(yazi);

    }
    public  void clickFunction(WebElement element){
       waituntilclickable(element);
        scrollToElement(element);
        element.click();

    }
    public void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) GWDD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));

    }
    public void waituntilclickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void verifyContainsTextFunction(WebElement element ,String value){

        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()),"no such text");
        new Actions(GWDD.getDriver()).sendKeys(Keys.ESCAPE).perform();//acik bir dialog kutusu var ise onu kapatir
    }
}
