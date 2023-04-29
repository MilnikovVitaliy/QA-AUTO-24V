package Homework.HW4;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class Zadanie1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        driver.get("https://www.google.com/search");
        String descrFirst = driver.getWindowHandle();
        Set<String> firstDescription = driver.getWindowHandles();
        WebElement search = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        search.sendKeys("https://www.guinnessworldrecords.com/account/register?");
        search.sendKeys(Keys.ENTER);
        actions.moveToElement(driver.findElement(By.xpath("//h3[text()='Create account | Guinness World Records']")))
                .keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
        Set<String > secondDescription = driver.getWindowHandles();
        secondDescription.removeAll(firstDescription);
        String descSecond = secondDescription.iterator().next();
        Thread.sleep(3000);
        WebElement search2 = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        search2.clear();
        search2.sendKeys("https://www.hyrtutorials.com/p/alertsdemo.html");
        search2.sendKeys(Keys.ENTER);
        actions.moveToElement(driver.findElement(By.xpath("//h3[text()='AlertsDemo - H Y R Tutorials']")))
                .keyDown((Keys.CONTROL)).click().keyUp(Keys.CONTROL).build().perform();
        Set<String > thirdDescription = driver.getWindowHandles();
        thirdDescription.removeAll(firstDescription);
        thirdDescription.removeAll(secondDescription);
        String descThree = thirdDescription.iterator().next();
        Thread.sleep(3000);


        driver.navigate().to("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(frame);

        WebElement fName = driver.findElement(By.xpath("//input[@id='fname']"));
        fName.clear();
        fName.sendKeys("Vitaliy");

        WebElement lName = driver.findElement(By.xpath("//input[@id='lname']"));
        lName.clear();
        lName.sendKeys("Melnikov");

        WebElement submitKnob = driver.findElement(By.xpath("//input[@type='submit']"));
        submitKnob.click();
        Thread.sleep(3000);

        WebElement note = driver.findElement(By.xpath("//div[@class='w3-panel w3-pale-yellow w3-leftbar w3-border-yellow']"));
        Thread.sleep(3000);
        System.out.println("Текст элемента Notes: " + note.getText());

        driver.switchTo().window(descSecond);
        WebElement usLastN = driver.findElement(By.xpath("//input[@id='LastName']"));
        usLastN.sendKeys("Melnikov");
        WebElement usFirstN = driver.findElement(By.xpath("//input[@id='FirstName']"));
        usFirstN.sendKeys("Vitaliy");
        WebElement dateOfB = driver.findElement(By.xpath("//input[@id='DateOfBirthDay']"));
        dateOfB.sendKeys("26");
        dateOfB.sendKeys(Keys.ENTER);
        WebElement dateOfB2 = driver.findElement(By.xpath("//input[@id='DateOfBirthMonth']"));
        dateOfB2.sendKeys("05");
        dateOfB2.sendKeys(Keys.ENTER);
        WebElement dateOfB3 = driver.findElement(By.xpath("//input[@id='DateOfBirthYear']"));
        dateOfB3.sendKeys("1983");
        dateOfB3.sendKeys(Keys.ENTER);

        WebElement coutryElem = driver.findElement(By.xpath("//select[@id='Country']"));
        Select countrySelect = new Select(coutryElem);
        countrySelect.selectByVisibleText("Ukraine");
        Thread.sleep(4000);

        WebElement state = driver.findElement(By.xpath("//input[@id='State']"));
        state.click();
        state.sendKeys("Dnipro");

        WebElement email = driver.findElement(By.xpath("//input[@id='EmailAddress']"));
        email.sendKeys("mailgmail@mails.com");

        WebElement confEmail = driver.findElement(By.xpath("//input[@id='ConfirmEmailAddress']"));
        confEmail.sendKeys("mailgmail@mails.com");

        WebElement pass = driver.findElement(By.xpath("//input[@id='Password']"));
        pass.sendKeys("123456");

        WebElement passConf = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        passConf.sendKeys("1234567");

        WebElement messeg2 = driver.findElement(By.xpath("//div[@class='controls']/span[@class='field-validation-error']"));
        System.out.println("Текст ошибки: " + messeg2.getText());

        driver.switchTo().window(descThree);
        //button[@id='alertBox']
        //button[@id="confirmBox"]
        //button[@id="promptBox"]


        WebElement knob1 = driver.findElement(By.xpath("//button[@id='alertBox']"));
        knob1.click();
        Thread.sleep(3000);
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
        System.out.println("1 алерт на странице: "+driver.findElement(By.xpath("//div[@id='output']"))
                .getText());
        WebElement knob2 = driver.findElement(By.xpath("//button[@id='confirmBox']"));
        knob2.click();
        Thread.sleep(3000);
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();
        System.out.println("2 алерт на странице: "+driver.findElement(By.xpath("//div[@id='output']"))
                .getText());
        WebElement knob3 = driver.findElement(By.xpath("//button[@id='promptBox']"));
        knob3.click();
        Thread.sleep(3000);
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("Final step of this task");
        alert3.accept();
        System.out.println("3 алерт на странице: "+driver.findElement(By.xpath("//div[@id='output']"))
                .getText());

























    }
}
