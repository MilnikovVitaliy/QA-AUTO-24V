package HW6;
//Открыть сайт https://www.guinnessworldrecords.com/Account/Login.
// Написать тест, проверяющий что изначально чек-бокс “RememberMe” не выбран.
// Потом кликнуть на него и реализовать проверку того, что он выбран.
// После снова нажать на чек-бокс и проверить что он снова не выбран.

import Homework.HW5.MyWaiters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class Task4 {
    @Test
    public void checkboxchoice(){
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.guinnessworldrecords.com/Account/Login");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        MyWaiters met = new MyWaiters(driver);
        Actions actions = new Actions(driver);
        WebElement checkbox= driver.findElement(By.xpath("//input[@id='RememberMe']"));
        met.elementSelectionStateToBe(checkbox,false);
        assertTrue(checkbox.isSelected()==false,"Чекбокс выбран");
        WebElement box = driver.findElement(By.xpath("//input[@id='RememberMe']"));
        box.click();
        met.elementSelectionStateToBe(checkbox,true);
        assertTrue(checkbox.isSelected()==true,"Чекбокс не выбран");
        box.click();
        met.elementSelectionStateToBe(checkbox,false);
        assertTrue(checkbox.isSelected()==false,"Чекбокс выбран");



    }

}
