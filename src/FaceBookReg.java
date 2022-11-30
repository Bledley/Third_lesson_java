import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Random;

public class FaceBookReg {
   static String randomMailGen() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 8;
        for(int y = 0; y < length; y++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        String randomString = sb.toString();
        return randomString;
   }
    public static void main(String[] args) throws InterruptedException {

       String mystring = randomMailGen();
        System.setProperty("webdriver.gecko.driver", "/Users/artem/IdeaProjects/Third_lesson_java/sources/geckodriver");
        WebDriver driver = new FirefoxDriver();
        //myDriver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        //my_testng.HomeWork.RegPage regPage = new my_testng.HomeWork.RegPage();
        String name = "Johny";
        String gmail = mystring+"@gmail.com";
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys(name);
        driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Depp");
        driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys(gmail);
        driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']")).sendKeys(gmail);
        driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("Qweasd123");
        /*WebElement firstName = driver.findElement(By.xpath("//*[@name='firstname']"));
        WebElement emailField = driver.findElement(By.xpath("//*[@name='reg_email__']"));
        Assert.assertEquals(emailField.getText(), gmail);
        Assert.assertEquals(firstName.getText(), name);
        SoftAssert myAssert = new SoftAssert();
        myAssert.assertEquals();
        myAssert.assertAll();*/
        WebElement yearDD = driver.findElement(By.name("birthday_year"));
        Select selectYear = new Select (yearDD);
        selectYear.selectByValue("1997");
        driver.findElement(By.xpath("(//*[@name='sex'])[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@name='websubmit']")).click();
        Thread.sleep(10000);
        driver.quit();//

    }

    public static WebDriver myDriver;
}
