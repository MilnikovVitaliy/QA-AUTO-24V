package Homework.HW2.Zadanie4;

import org.openqa.selenium.WebElement;

import java.util.List;

public class Image {

    public static void img (WebElement element1, List<WebElement> element2) {
        System.out.println("Рисунок 4 " + element1.getText());
        for (int i = 0; i < element2.size(); i++) {
            System.out.println("Рисунок 5 " + element2.get(i).getText());

        }

    }
}
