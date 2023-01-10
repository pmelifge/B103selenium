package practice02;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.TestBase;
public class P04 extends TestBase {
    @Test
    public void test() throws InterruptedException {
        //https://html.com/tags/iframe/ adresine gidiniz
        driver.get("https://html.com/tags/iframe/");
        String window1Handle = driver.getWindowHandle();
        //youtube videosunu çalıştırınız
        WebElement iframe =driver.findElement(By.xpath("//*[@frameborder='0']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//*[@aria-label='Play']")).click();
        //üç saniye çalıştıktan sonra sayfayı yenileyiniz
        Thread.sleep(3000);
        driver.navigate().refresh();
        //yeni sekmede amazon adresine gidiniz
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com");
        //iphone aratınız
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("iphone", Keys.ENTER);
        //arama sonucu olarak sadece sonuc sayısını yazdırınız
        String[] sonuc = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]")).getText().split(" ");
        System.out.println(sonuc[2]);
        //ilk sekmeye geri dönüp url'ini konsola yazdıralım
        driver.switchTo().window(window1Handle);
        System.out.println("Ilk window url: " +driver.getCurrentUrl());
        //ilk sekmeyi kapatalım
        driver.close();
        //Sonra diğer sekmeyide kapatalım
        //testbase'den after methoduyla zaten kapatacak
    }
}