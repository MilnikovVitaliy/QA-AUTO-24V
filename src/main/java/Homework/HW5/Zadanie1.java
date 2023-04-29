package Homework.HW5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Zadanie1 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://uhomki.com.ua/");
        System.out.println(driver.getTitle());
        WebElement search = driver.findElement(By.xpath("//input[@class='search__input']"));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@class='header-logo-img']")));
        wait.until(ExpectedConditions.textToBePresentInElementValue(search, "h"));
        wait.until(ExpectedConditions.titleContains("Интернет-зоомагазин"));
        driver.findElement(By.xpath("//span[@class='userbar__button-text']")).click();
        wait.until(ExpectedConditions.titleIs("'У Хомки' Интернет-зоомагазин | Днепр, пр. А. Поля, 59. (остановка 'Медтехника')"));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='по названию']")));
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//aside//span[text()='Клетки для грызунов']")));
        driver.findElement(By.xpath("//span[text()='Arterium']"));










    }
}
