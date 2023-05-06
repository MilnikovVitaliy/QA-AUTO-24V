package HW6;

import Homework.HW5.MyWaiters;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

//Открыть сайт http://only-testing-blog.blogspot.com/2014/01/textbox.html?.
// Написать тест, проверяющий содержит ли модальное окно,
// которое появляется после нажатия на кнопку “Show Me Alert”необходимый текст.
public class Task5 {
    @Test
    public void showAlert(){
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        MyWaiters met = new MyWaiters(driver);
        Actions actions = new Actions(driver);
        WebElement showAlert= driver.findElement(By.xpath("//input[@onclick='myFunction1()']"));
        actions.moveToElement(showAlert).click().perform();
        met.alertIsPresent();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        assertEquals(alert.getText(),"Hi.. This is alert message!");
        alert.accept();
    }
}
