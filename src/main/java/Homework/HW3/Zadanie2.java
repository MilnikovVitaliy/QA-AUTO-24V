package Homework.HW3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.time.Duration;

//http://www.ashortjourney.com/
//Написать программу, которая будет автоматизировать сценарий показанный на видео "Сценарий для автоматизии.mp4".
public class Zadanie2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));

        Actions actions = new Actions(driver);

        driver.get("http://www.ashortjourney.com/");
        Thread.sleep(10000);

        WebElement baseElement = driver.findElement(By.cssSelector("[stroke-width='4']"));
        WebElement targetElement = driver.findElement(By.cssSelector("[r='8']"));
        Thread.sleep(5000);

        int x=baseElement.getLocation().x+(baseElement.getSize().width/2);
        int y=baseElement.getLocation().y+(baseElement.getSize().height/2);
        int x2=targetElement.getLocation().x+(targetElement.getSize().width/2);
        int y2=targetElement.getLocation().y+(targetElement.getSize().height/2);

        actions.moveByOffset(x,y).clickAndHold().moveByOffset(x2,y2).release().build().perform();
        Thread.sleep(5000);

        WebElement baseElement2 = driver.findElement(By.cssSelector("[stroke-width='4']"));
        WebElement targetElement2 = driver.findElement(By.cssSelector("[r='8']"));
        actions.dragAndDrop(baseElement2,targetElement2).perform();
        Thread.sleep(7000);

        WebElement baseElement3 = driver.findElement(By.cssSelector("[stroke-width='4']"));
        WebElement targetElement3 = driver.findElement(By.cssSelector("[r='8']"));
        Thread.sleep(7000);

        //actions.moveToElement(baseElement3).clickAndHold().moveToElement(targetElement3).release().build().perform();
        actions.dragAndDrop(baseElement3,targetElement3).perform();
        Thread.sleep(7000);

        WebElement baseElement4 = driver.findElement(By.cssSelector("[stroke-width='4']"));
        WebElement targetElement4 = driver.findElement(By.cssSelector("[r='8']"));
        Thread.sleep(7000);

        actions.moveToElement(baseElement4).clickAndHold().moveToElement(targetElement4).release().build().perform();

        WebElement baseElement5 = driver.findElement(By.cssSelector("[stroke-width='4']"));
        WebElement targetElement5 = driver.findElement(By.cssSelector("[r='8']"));
        Thread.sleep(7000);

        actions.moveToElement(baseElement5).clickAndHold().moveToElement(targetElement5).release().build().perform();

        WebElement baseElement6 = driver.findElement(By.cssSelector("[stroke-width='4']"));
        WebElement targetElement6 = driver.findElement(By.cssSelector("[r='8']"));
        Thread.sleep(7000);

        actions.moveToElement(baseElement6).clickAndHold().moveToElement(targetElement6).release().build().perform();

        WebElement baseElement7 = driver.findElement(By.cssSelector("[stroke-width='4']"));
        WebElement targetElement7 = driver.findElement(By.cssSelector("[r='8']"));
        Thread.sleep(7000);

        actions.moveToElement(baseElement7).clickAndHold().moveToElement(targetElement7).release().build().perform();

        WebElement cart = driver.findElement(By.xpath("//div[@id='postcard-back-content']/textarea"));
        cart.sendKeys("ГОТОВО");
        Thread.sleep(7000);







        //ЭТО ВСЕ ДЛЯ ПРОБЫ БЫЛО:
        //[stroke-width='4']
        //[r='8']
        //By.xpath("//*[local-name() = 'circle'][2]")
        //By.xpath("//*[local-name() = 'circle'][1")

        //WebElement baseElement = driver.findElement(By.xpath("//*[local-name() = 'circle'][2]"));
        //WebElement targetElement = driver.findElement(By.xpath("//*[local-name() = 'circle'][1]"));
        //actions.dragAndDrop(baseElement,targetElement).perform();

        //WebElement baseElement2 = driver.findElement(By.xpath("//*[local-name() = 'circle'][2]"));
        //WebElement targetElement2 = driver.findElement(By.xpath("//*[local-name() = 'circle'][1]"));

        //WebElement baseElement3 = driver.findElement(By.xpath("//*[local-name() = 'circle'][2]"));
        //WebElement targetElement3 = driver.findElement(By.xpath("//*[local-name() = 'circle'][1]"));
        //int x3=baseElement3.getLocation().x+(baseElement3.getSize().width/2);
        //int y3=baseElement3.getLocation().y+(baseElement3.getSize().height/2);
        //int x32=targetElement3.getLocation().x+(targetElement3.getSize().width/2);
        //int y32=targetElement3.getLocation().y+(targetElement3.getSize().height/2);
        //actions.moveByOffset(x3,y3).clickAndHold().moveByOffset(x32,y32).release().build().perform();




    }



}
