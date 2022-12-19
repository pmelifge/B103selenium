package day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ClassWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();//browseri acmak icin
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //a.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

//Search(ara) "city bike"

//Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
//Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
    }
}
