package Homework.HW5;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.function.Function;

public class MyWaiters {

    private final WebDriver driver;

    public MyWaiters(WebDriver driver) {
        this.driver = driver;

    }

    private static final long EXPLICITY_WAIT = 20L; //значение нашего ожидания

    private FluentWait<WebDriver> fluentWait(Long duration) {
        return new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(duration))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(InvalidElementStateException.class)
                .ignoring(StaleElementReferenceException.class);
    }

    private void waitForFunction(Function function, Long timeout) {
        FluentWait<WebDriver> wait = fluentWait(timeout);
        wait.until(function);
    }


    public void presenceOfElementLocated(By by){
        waitForFunction(ExpectedConditions.presenceOfElementLocated(by), EXPLICITY_WAIT);
    }
    public WebElement presenceOfElementLocatedReturn(By by){
        return  fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.presenceOfElementLocated(by));
    }




    public void textToBePresentInElementValue(WebElement element,String text){
        waitForFunction(ExpectedConditions.textToBePresentInElementValue(element,text), EXPLICITY_WAIT);
    }
    public void textToBePresentInElementValue(By by,String text){
        waitForFunction(ExpectedConditions.textToBePresentInElementLocated(by,text),EXPLICITY_WAIT);
    }





    public void invisibilityOf(WebElement element){
        waitForFunction(ExpectedConditions.invisibilityOf(element),EXPLICITY_WAIT);
    }





    public void titleContaince(String text){
        waitForFunction(ExpectedConditions.titleContains(text),EXPLICITY_WAIT);
    }





    public void titleIs(String text){
        waitForFunction(ExpectedConditions.titleIs(text), EXPLICITY_WAIT);
    }





    public void elementToBeClickable(By by){
        waitForFunction(ExpectedConditions.elementToBeClickable(by),EXPLICITY_WAIT);
    }
    public void elementToBeClickable(WebElement element){
        waitForFunction(ExpectedConditions.elementToBeClickable(element),EXPLICITY_WAIT);
    }
    public WebElement elementToBeClickableReturn(By by){
        return fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.elementToBeClickable(by));
    }
    public WebElement elementToBeClickableReturn(WebElement element){
        return fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.elementToBeClickable(element));
    }




    public void elementToBeSelected(By by){
        waitForFunction(ExpectedConditions.elementToBeSelected(by),EXPLICITY_WAIT);
    }
    public void elementToBeSelected(WebElement element){
        waitForFunction(ExpectedConditions.elementToBeSelected(element),EXPLICITY_WAIT);
    }







    public void elementSelectionStateToBe(By by, Boolean boo){
        waitForFunction(ExpectedConditions.elementSelectionStateToBe(by, boo),EXPLICITY_WAIT);
    }
    public void elementSelectionStateToBe(WebElement element, Boolean boo){
        waitForFunction(ExpectedConditions.elementSelectionStateToBe(element, boo),EXPLICITY_WAIT);
    }






    public void visibilityOfElementLocated(By by){
        waitForFunction(ExpectedConditions.visibilityOfElementLocated(by),EXPLICITY_WAIT);
    }
    public WebElement visibilityOfElementLocatedReturn (By by){
        return fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.visibilityOfElementLocated(by));
    }




    public void frameToBeAvailableAndSwitchToIt(By by){
        waitForFunction(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by),EXPLICITY_WAIT);
    }
    public void frameToBeAvailableAndSwitchToIt(String loc){
        waitForFunction(ExpectedConditions.frameToBeAvailableAndSwitchToIt(loc),EXPLICITY_WAIT);
    }
    public void frameToBeAvailableAndSwitchToIt(int loc1){
        waitForFunction(ExpectedConditions.frameToBeAvailableAndSwitchToIt(loc1),EXPLICITY_WAIT);
    }
    public void frameToBeAvailableAndSwitchToIt(WebElement element){
        waitForFunction(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element),EXPLICITY_WAIT);
    }

    public void alertIsPresent(){
        waitForFunction(ExpectedConditions.alertIsPresent(),EXPLICITY_WAIT);
    }








}

