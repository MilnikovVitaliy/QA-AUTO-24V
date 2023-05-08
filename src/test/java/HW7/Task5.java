package HW7;

import Homework.HW5.MyWaiters;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class Task5 {
    WebDriver driver;
    @Test
    @Parameters({"params"})
    public void searchTest(String searchParams) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(17));
        driver.get("https://www.foxtrot.com.ua/");
        driver.manage().window().maximize();
        MyWaiters waiters = new MyWaiters(driver);

        WebElement element = waiters.presenceOfElementLocatedReturn(By.xpath("//a[@class='button user-confirm-location-button']"));
        element.click();
        WebElement element1 =waiters.visibilityOfElementLocatedReturn(By.xpath("//input[@type='search']"));
        String slovo = searchParams;
        element1.sendKeys(slovo);
        element1.sendKeys(Keys.ENTER);

        WebElement resultLine = waiters.presenceOfElementLocatedReturn(By.xpath("//h1[text()]"));

        if (resultLine.getText().contains("Знайдено по запиту")){
            String resultSearch=resultLine.getText().replace("Знайдено по запиту «","").replace("»","");
            assertEquals(resultSearch,slovo);
        }else if (resultLine.getText().contains("Результати пошуку")){
            String resultSearch= driver.findElement
                    (By.xpath("//div[@class='search-page__box-title']/label")).getText().replace("«","").replace("»","");
            assertEquals(resultSearch,slovo);
        }
    }

}
