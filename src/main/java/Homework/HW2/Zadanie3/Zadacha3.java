package Homework.HW2.Zadanie3;

import org.openqa.selenium.WebElement;

//Написать метод который выводит сообщение об айди элемента,
//значении тэга элемента , значении класса элемента,
//значении атрибута name элемента, текста данного элемента,
//а также о координатах центра контейнера данного элемента.
//Создать свой тип исключений, который будет вызываться если у элемента
//нет определенного атрибута и на экран будет выводиться сообщение об отсутствии данного атрибута.
public class Zadacha3 {
    public static void metodi2(WebElement element1) throws WithoutClass, WithoutName, WithoutID, WithoutTagName, WithoutText {
        int centerW=element1.getSize().width/2;
        int centerH=element1.getSize().height/2;
        System.out.println("Центр координат контейнера = " +  centerW+ " " + centerH);

        try {
            if (element1.getAttribute("id") == null) {
                throw new WithoutID();
            } else {
                System.out.println("Значение Id элемента: \"" + element1.getAttribute("id"));
            }
            if (element1.getTagName() == null) {
                throw new WithoutTagName();
            } else {
                System.out.println("Значение тэга элемента: " + element1.getTagName());
            }
            if (element1.getAttribute("class") == null) {
                throw new WithoutClass();
            } else {
                System.out.println("Значение класса элемента: " + element1.getAttribute("class"));
            }
            if (element1.getAttribute("name") == null) {
                throw new WithoutName();
            } else {
                System.out.println("Значение атрибута name элемента: " + element1.getAttribute("name"));
            }
            if (element1.getText() == null) {
                throw new WithoutText();
            } else {
                System.out.println("Текст данного элемента: " + element1.getText());
            }
        }
        catch(WithoutID a){
                System.out.println(a.getMEssege());
        } catch(WithoutTagName a){
                System.out.println(a.getMEssege());
        } catch(WithoutClass a){
                System.out.println(a.getMEssege());
        } catch(WithoutName a){
                System.out.println(a.getMEssege());
        } catch(WithoutText a){
                System.out.println(a.getMEssege());
        }


    }
}
