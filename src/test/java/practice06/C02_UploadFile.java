package practice06;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C02_UploadFile extends TestBase {
    @Test
    public void name() throws InterruptedException {
//https://demo.guru99.com/test/upload/ adresine gidiniz

        driver.get("https://demo.guru99.com/test/upload/");
        WebElement iframe = driver.findElement(By.id("gdpr-consent-notice"));
        driver.switchTo().frame(iframe);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Accept All']")).click();
        driver.switchTo().defaultContent();

        //Bilgisayarınızdan herhangi bir dosyayı upload ediniz
        // I accept terms of service bölümünü tikleyin
        // Submit File buttonuna basınız
        // "1 file has been successfully uploaded" görünür olduğunu test edin

        //"C:\Users\Lenonvo\Desktop\image (3).png"
        //String anaYol= System.getProperty("user.home");
        //String ortakYol="\\Desktop\\image (3).png";
        String dosyaYolu="C:\\Users\\Lenonvo\\Desktop\\logo.jpeg";
        //"C:\Users\Lenonvo\Desktop\image (3).png"";
        WebElement dosyaSec = driver.findElement(By.xpath("//*[@id='uploadfile_0']"));
        Thread.sleep(2000);
        dosyaSec.sendKeys(dosyaYolu);
        // I accept terms of service bölümünü tikleyin
        WebElement checkBox =  driver.findElement(By.xpath("//*[@id='terms']"));
        checkBox.click();
        checkBox.sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER);
        // Submit File buttonuna basınız
        // "1 file has been successfully uploaded" görünür olduğunu test edin
    }
}
