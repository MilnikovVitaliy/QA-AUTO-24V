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
            //запуск 1,2,3,4 задач. 5я отдельным доком идет
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
            driver.manage().window().maximize(); //вызов большого окна

            // 1 ЗАДАЧА


            driver.get(Url.uhomki); //открываем окно у хомки
            Thread.sleep(3000);//замедляем действие
            Set<String> setFirst = driver.getWindowHandles(); //получаем идент.номер первого окна из множества открытых окон

            ((JavascriptExecutor) driver).executeScript("window.open()"); //открываем новое пустое окно
            Set<String> setSecond = driver.getWindowHandles(); //получаем идент.номер второго окна из множества открытых окон
            setSecond.removeAll(setFirst);//убираем дубликаты
            String secondDesc = setSecond.iterator().next(); //получаем дискриптор нужного нам окна
            driver.switchTo().window(secondDesc); //переключаемся на нужный дискриптор
            driver.get(Url.zoo); //грузим в полученный дискриптор нужную ссылку
            Thread.sleep(2000);//замедляем действие

            ((JavascriptExecutor) driver).executeScript("window.open()"); //открываем новое пустое окно
            Set<String> setThird = driver.getWindowHandles(); //получаем идент.номер третьего окна из множества открытых окон
            setThird.removeAll(setFirst);//убираем дубликаты
            setThird.removeAll(setSecond);//убираем дубликаты
            String thirdDesc = setThird.iterator().next(); //получаем дискриптор нужного нам окна
            driver.switchTo().window(thirdDesc); //переключаемся на нужный дискриптор
            driver.get(Url.w3school);//грузим в полученный дискриптор нужную ссылку
            Thread.sleep(2000);//замедляем действие

            ((JavascriptExecutor) driver).executeScript("window.open()"); //открываем новое пустое окно
            Set<String> setFourth = driver.getWindowHandles(); //получаем идент.номер четвертого окна из множества открытых окон
            setFourth.removeAll(setFirst);//убираем дубликаты
            setFourth.removeAll(setSecond);//убираем дубликаты
            setFourth.removeAll(setThird);//убираем дубликаты
            String fourthDesc = setFourth.iterator().next(); //получаем дискриптор нужного нам окна
            driver.switchTo().window(fourthDesc); //переключаемся на нужный дискриптор
            driver.get(Url.taxi);//грузим в полученный дискриптор нужную ссылку
            Thread.sleep(2000);//замедляем действие

            ((JavascriptExecutor) driver).executeScript("window.open()"); //открываем новое пустое окно
            Set<String> setFifth = driver.getWindowHandles(); //получаем идент.номер пятого окна из множества открытых окон
            setFifth.removeAll(setFirst);//убираем дубликаты
            setFifth.removeAll(setSecond);//убираем дубликаты
            setFifth.removeAll(setThird);//убираем дубликаты
            setFifth.removeAll(setFourth);//убираем дубликаты
            String fifthDesc = setFifth.iterator().next(); //получаем дискриптор нужного нам окна
            driver.switchTo().window(fifthDesc); //переключаемся на нужный дискриптор
            driver.get(Url.klopotenko);//грузим в полученный дискриптор нужную ссылку
            Thread.sleep(2000);//замедляем действие

            Set<String> count = driver.getWindowHandles(); //сделали массив из дискрипторов
            Iterator<String> i = count.iterator(); //разделили их

            for (int k = 0; k < count.size(); k++) {
                i.hasNext();
                String childWindow = i.next();
                driver.switchTo().window(childWindow);
                System.out.println(driver.getCurrentUrl()); //получение текущей ссылки
                System.out.println(driver.getTitle()); //получение названия страницы
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
