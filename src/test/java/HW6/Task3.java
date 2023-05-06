package HW6;

import Homework.HW5.MyWaiters;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.security.Key;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import static org.testng.AssertJUnit.assertTrue;

//Открыть сайт https://uhomki.com.ua/ru/.
// Ввести в строку поиска слово “смесь” и совершить поиск.
// Проверить что слово “смесь” присутствует в сообщении о результатах поиска.
// После ввести в строку поиска слово “спесь” и совершить поиск.
// Проверить что слово “спесь” присутствует в сообщении о результатах поиска.
// После ввести в строку поиска слово “ересь” и совершить поиск.
// Проверить что слово “ересь” присутствует в сообщении о результатах поиска.
public class Task3 {
    @Test
    public void proverkaSlov() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        MyWaiters myWaiters = new MyWaiters(driver);
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/ru/");
        WebElement search = driver.findElement(By.xpath("//input[@class='search__input']"));
        String input = "смесь";
        search.sendKeys("смесь");
        Thread.sleep(3000);
        search.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        String rez = driver.findElement(By.xpath("//h1[@id='j-catalog-header']")).getText();
        String rezUpdate = rez.replace("Результаты поиска ","");
        assertTrue(rezUpdate.equals("«"+input+"»"));

        WebElement search2 = driver.findElement(By.xpath("//input[@class='search__input']"));
        String input2 = "спесь";
        search2.clear();
        search2.sendKeys("спесь");
        Thread.sleep(3000);
        search2.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        String rez2 = driver.findElement(By.xpath("//h1[@id='j-catalog-header']")).getText();
        String rezUpdate2 = rez2.replace("Результаты поиска ","");
        assertTrue(rezUpdate2.equals("«"+input2+"»"));

        WebElement search3 = driver.findElement(By.xpath("//input[@class='search__input']"));
        String input3 = "ересь";
        search3.clear();
        search3.sendKeys("ересь");
        Thread.sleep(3000);
        search3.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        String rez3 = driver.findElement(By.xpath("//h1[@id='j-catalog-header']")).getText();
        String rezUpdate3 = rez3.replace("Результаты поиска ","");
        assertTrue(rezUpdate3.equals("«"+input3+"»"));
        driver.quit();




    }
}
