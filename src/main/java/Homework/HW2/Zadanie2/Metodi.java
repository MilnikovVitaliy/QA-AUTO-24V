package Homework.HW2.Zadanie2;

import org.openqa.selenium.WebElement;

//Написать метод в параметры которого принимаются два ВебЭлемента.
//метод выводит в консоль информацию какой из двух элементов располагается  выше на странице,
//какой из элементов располагается левее на странице,
//а также какой из элементов занимает большую площадь.
//Параметры метода могут также включать в себя другие аргументы, если это необходимо.
public class Metodi {
    public static void webelem (WebElement elem1, WebElement elem2) {
        if (elem1.getLocation().getY()<elem2.getLocation().getY()){
            System.out.println("Элемент 1 выше" + elem1.getLocation().getY());
        } else if (elem1.getLocation().getY()>elem2.getLocation().getY()){
            System.out.println("Элемент 2 выше" + elem2.getLocation().getY());
        }
        if (elem1.getLocation().getX()<elem2.getLocation().getX()){
            System.out.println("Элемент 1 левее" + elem1.getLocation().getX());
        } else if (elem1.getLocation().getX()>elem2.getLocation().getX()) {
            System.out.println("Элемент 2 левее" + elem2.getLocation().getX());
        }
        int S = elem1.getSize().height*elem1.getSize().width;
        int S2 = elem2.getSize().height*elem2.getSize().width;
        if (S>S2){
        System.out.println("Площадь элеиента 1 больше и равна " + S);}
        else {System.out.println("Площадь элеиента 2 больше и равна " + S2);}


    }
}
