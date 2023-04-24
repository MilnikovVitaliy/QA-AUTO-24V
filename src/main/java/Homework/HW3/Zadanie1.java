package Homework.HW3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.Keys.DOWN;

//http://only-testing-blog.blogspot.com/2014/01/textbox.html?
//Написать программу реализующую действие показанное на "видео1.mp4".
//После выполнения программы на консоли должна выводится информация в следующем виде:
//
//Автомобили доступные для выбора:
//Volvo, BMW, Opel, Audi, Toyota, Renault, Maruti Car.
//Страны из первой таблицы:
//USA, Russia, Japan, Mexico, India, Malaysia, Greece.
//Страны из второй таблицы:
//France, Germany, Italy, Spain.
public class Zadanie1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");

        WebElement carElement = driver.findElement(By.id("Carlist"));
        carElement.click();
        //Thread.sleep(1000);

        carElement.sendKeys(DOWN);
        //Thread.sleep(1000);
        carElement.sendKeys(DOWN);
        //Thread.sleep(1000);
        carElement.sendKeys(DOWN);
        //Thread.sleep(1000);
        carElement.sendKeys(DOWN);
        //Thread.sleep(1000);
        carElement.sendKeys(DOWN);
        //Thread.sleep(1000);

        WebElement carElement2 = driver.findElement(By.id("car6"));
        carElement2.click();


        WebElement countryElement = driver.findElement(By.xpath("//select[@name='FromLB']"));
        Select countySelect = new Select(countryElement);
        countySelect.selectByIndex(2);
        countySelect.selectByValue("India");
        countySelect.deselectByValue("India");
        countySelect.selectByValue("Germany");
        countySelect.selectByValue("Italy");
        countySelect.selectByValue("Malaysia");
        countySelect.deselectByValue("Malaysia");
        countySelect.selectByValue("Spain");
        WebElement addElement = driver.findElement(By.xpath("//input[@value='->']"));
        addElement.click();

        System.out.println("авто доступные к заказу:");
        Select carSelect = new Select(carElement);
        List<WebElement> cars = carSelect.getOptions();
        for (WebElement car : cars) {
            System.out.print(car.getText() + " ");
        }

        System.out.println("\nСтраны из первой таблицы:");
        List<WebElement> countries = countySelect.getOptions();
        for (WebElement cont : countries) {
            System.out.print(cont.getText() + " ");
        }

        System.out.println("\nСтраны из второй таблицы:");
        WebElement coutryElem2 = driver.findElement(By.xpath("//select[@name='ToLB']"));
        Select elemSelect = new Select(coutryElem2);
        List<WebElement> coutries2 = elemSelect.getOptions();
        for (WebElement cont2 : coutries2) {
            System.out.print(cont2.getText() + " ");
        }


    }
}
