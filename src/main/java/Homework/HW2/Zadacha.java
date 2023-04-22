package Homework.HW2;


import Homework.HW2.Zadanie2.Metodi;
import Homework.HW2.Zadanie3.*;
import Homework.HW2.Zadanie4.Image;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Zadacha {
            //Заданя 1,2,3,4 задач.
        private static class Url {
            private static final String uhomki = "https://uhomki.com.ua/";
            private static final String zoo = "https://zoo.kiev.ua/";
            private static final String w3school = "https://www.w3schools.com/";
            private static final String taxi = "https://taxi838.ua/ru/dnepr/";
            private static final String klopotenko = "https://klopotenko.com/";


        }

        public static void main(String[] args) throws InterruptedException, WithoutText, WithoutID, WithoutName, WithoutTagName, WithoutClass {
            System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            // 1 ЗАДАЧА


            driver.get(Url.uhomki);
            Thread.sleep(3000);
            Set<String> setFirst = driver.getWindowHandles();

            ((JavascriptExecutor) driver).executeScript("window.open()");
            Set<String> setSecond = driver.getWindowHandles();
            setSecond.removeAll(setFirst);//убираем дубликаты
            String secondDesc = setSecond.iterator().next();
            driver.switchTo().window(secondDesc);
            driver.get(Url.zoo);
            Thread.sleep(2000);

            ((JavascriptExecutor) driver).executeScript("window.open()");
            Set<String> setThird = driver.getWindowHandles();
            setThird.removeAll(setFirst);
            setThird.removeAll(setSecond);
            String thirdDesc = setThird.iterator().next();
            driver.switchTo().window(thirdDesc);
            driver.get(Url.w3school);
            Thread.sleep(2000);

            ((JavascriptExecutor) driver).executeScript("window.open()");
            Set<String> setFourth = driver.getWindowHandles();
            setFourth.removeAll(setFirst);
            setFourth.removeAll(setSecond);
            setFourth.removeAll(setThird);
            String fourthDesc = setFourth.iterator().next();
            driver.switchTo().window(fourthDesc);
            driver.get(Url.taxi);
            Thread.sleep(2000);

            ((JavascriptExecutor) driver).executeScript("window.open()");
            Set<String> setFifth = driver.getWindowHandles();
            setFifth.removeAll(setFirst);
            setFifth.removeAll(setSecond);
            setFifth.removeAll(setThird);
            setFifth.removeAll(setFourth);
            String fifthDesc = setFifth.iterator().next();
            driver.switchTo().window(fifthDesc);
            driver.get(Url.klopotenko);
            Thread.sleep(2000);

            Set<String> count = driver.getWindowHandles();
            Iterator<String> i = count.iterator();

            for (int k = 0; k < count.size(); k++) {
                i.hasNext();
                String childWindow = i.next();
                driver.switchTo().window(childWindow);
                System.out.println(driver.getCurrentUrl());
                System.out.println(driver.getTitle());
                {
                    if (driver.getTitle().toLowerCase().contains("зоопарк")) {
                        driver.close();
                    }
                }
            }

            // 2 ЗАДАЧА

            driver.get(Url.uhomki);
            Thread.sleep(3000);
            Metodi obj = new Metodi();
            WebElement element1 = driver.findElement(By.xpath("//div [@class='basket__items']"));
            WebElement element2 = driver.findElement(By.xpath("//img [@class='header-logo-img']"));
            obj.webelem(element1,element2);


            // 3 ЗАДАЧА
            driver.get(Url.uhomki);
            Zadacha3 obj2 = new Zadacha3();
            WebElement element3 = driver.findElement(By.xpath("//div [@class='basket__items']"));
            try {
                obj2.metodi2(element3);
            }
            catch (WithoutText | WithoutID | WithoutName | WithoutTagName | WithoutClass b){
                System.out.println(b.getMessage());

            }

            // 4 ЗАДАЧА

            driver.get(Url.uhomki);
            Image obj3 = new Image();
            WebElement stroka = driver.findElement(By.xpath("//ul[contains(@class,'products-menu__container')]"));
            List<WebElement> podval = driver.findElements(By.xpath("//ul[@class='footer__menu']"));
            obj3.img(stroka, podval);









        }
    }
