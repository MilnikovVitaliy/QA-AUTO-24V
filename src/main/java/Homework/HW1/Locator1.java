package Homework.HW1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //1.Найти как можно кликнуть на кнопку "Вход" элемент используя 4
        //различных локатора https://uhomki.com.ua/ru/koshki/1074/

       //driver.get("https://uhomki.com.ua/ru/koshki/1074/"); // работате
       //driver.findElement(By.className("userbar__button-text")).click();

       //driver.get("https://uhomki.com.ua/ru/koshki/1074/"); // работает
       //driver.findElement(By.xpath("//span[@class='userbar__button-text']")).click();

       //driver.get("https://uhomki.com.ua/ru/koshki/1074/"); // работает
       //driver.findElement(By.xpath("//a[@class='userbar__button __active']")).click();

       //driver.get("https://uhomki.com.ua/ru/koshki/1074/"); // работает
       //driver.findElements(By.tagName("span")).get(10).click();

      //driver.get("https://uhomki.com.ua/ru/koshki/1074/"); // работает
      //driver.findElements(By.partialLinkText("Вход")).get(0).click();

      //driver.get("https://uhomki.com.ua/ru/koshki/1074/"); // работает
      //driver.findElements(By.linkText("Вход")).get(0).click();





      //2.Найти элемент "Каталог", а при помощи него найти путь к элементу
      //"Собаки/кошки общее" используя xpath. https://uhomki.com.ua/ru/koshki/1074/

     //driver.get("https://uhomki.com.ua/ru/koshki/1074/"); // работает
     //driver.findElements(By.xpath("//div [@class='footer__heading']")).get(0);
     //driver.findElements(By.xpath("//a [@href='/ru/sobaki-koshki-obshchee/']")).get(1).click();




      //3. Найти данный элемент по тексту "IT специальностям" https://itstep.dp.ua/ru

      //driver.get("https://itstep.dp.ua/ru"); //работает
      //System.out.println(driver.findElement(By.xpath("//h2 [contains(text(),'IT специальностям')]")).getText());
      //driver.quit();

      //4. Найти путь к данному элементу. https://uhomki.com.ua/koshki/1074/

     //driver.get("https://uhomki.com.ua/ru/koshki/1074/"); //работает
     driver.findElement(By.xpath("//span[contains(text(),'Аквариумы')]"));

      //5. Найти путь к данному элементу не используя текст.
        // https://itstep.dp.ua/ru
      //driver.get("https://itstep.dp.ua/ru"); //работает
      //driver.findElement(By.xpath("//div[contains(@class, 'dropbtn-phones')]/span")).click();


      //6. https://itstep.dp.ua/ru
        //Найти локатор данного элемента не используя текст
        //driver.get("https://itstep.dp.ua/ru"); //работает
        //driver.findElement(By.xpath("h2 [@class='re-section-title re-home-children__title']"));

      //7. https://www.w3schools.com/
        //найти 10 элементов на странице, для нахождения которых можно использовать
        //только айди и с которыми можно взаимодействовать. (Кликнуть, ввести текст и т.д.)

       //driver.get("https://www.w3schools.com/");
       //driver.findElement(By.xpath("//input[@id='search2']")).sendKeys("HELLO");
       //driver.findElement(By.xpath("//i [@id='learntocode_searchicon']")).click();
       //driver.findElement(By.xpath("//a [@id='navbtn_tutorials']")).click();
       //driver.findElement(By.xpath("//a [@id='navbtn_references']")).click();
       //driver.findElement(By.xpath("//a [@id='navbtn_exercises']")).click();
       //driver.findElement(By.xpath("//a [@id='cert_navbtn']")).click();
       //driver.findElement(By.xpath("//a [@id='signupbtn_topnav']")).click();
       //driver.findElement(By.xpath("//a [@id='w3loginbtn']")).click();
       //driver.findElement(By.xpath("//a [@id='w3loginbtn']")).click();
       //driver.findElement(By.xpath("//a [@id='proFromDefault']")).click();

       //8. https://itstep.dp.ua/ru
        //Отыскать один элемент на основе другого.
        //Для нахождения первого элемента можете использовать любые методы и локаторы,
        //для прописывания дальнейшего поиска второго элемента не использовать текст.

        //driver.get("https://itstep.dp.ua/ru");
        //driver.findElement(By.xpath("//h3[text()='Университет']/../../../div[1]/a/h3"));

        //9. https://www.jetbrains.com/idea/
        //Найти данный элемент не используя текст. Используя только имя класса.

        //driver.get("https://www.jetbrains.com/idea/");
        //Thread.sleep(3000);
        //driver.findElement(By.xpath("//a [@class='wt-col-inline menu-second__download-button wt-button wt-button_size_s wt-button_mode_primary']")).click();

        //10. найти локаторы к двум данным кнопкам.
        //Пользоваться любыми локаторами и методами.
        //https://www.jetbrains.com/idea/download/#section=windows

        driver.get("https://www.jetbrains.com/idea/download/#section=windows");
        //driver.findElement(By.xpath("//a[@class='_main_12yxkch_17 _modeClassic_12yxkch_135 _sizeM_12yxkch_99 _alignIconLeft_12yxkch_77 _light_12yxkch_59 _flatRight_12yxkch_125 _wtDownloadButton__left_3gbaqk _wtDownloadButton__left_2sbscl _wtDownloadButton__left_45alcl']")).click();
        //driver.findElement(By.xpath("//a[@class='_main_12yxkch_17 _modeRock_12yxkch_208 _sizeM_12yxkch_99 _alignIconLeft_12yxkch_77 _light_12yxkch_59 _flatRight_12yxkch_125 _wtDownloadButton__left_3gbaqk _wtDownloadButton__left_2sbscl _wtDownloadButton__left_45alcl']")).click();
































    }
}
