package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "C:\\Users\\Lenonvo\\IdeaProjects\\SeleniumNewProject\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Amazon sayfasına gidelim
        driver.navigate().to("https://amazon.com");
        //driver.get("https://amazon.com"); bu sekilde de yapabilirz
        //techproeducation sayfasına gidelim
        Thread.sleep(3000);
        driver.navigate().to("https://techproeducation.com");
        //Tekrar amazon sayfasına dönelim
        Thread.sleep(3000);
        driver.navigate().back(); // Amazon sayfasına geri döner
        //Tekrar techproeducation sayfasına gidelim
        Thread.sleep(3000);
        driver.navigate().forward(); // Techproya gider
        //Son sayfada sayfayı yenileyelim(refresh)
        Thread.sleep(3000);
        driver.navigate().refresh();
        //Ve sayfayı kapatalım
        driver.close();

        /*
        odev
        Youtube ana sayfasina gidelim . https://www.youtube.com/
Amazon soyfasina gidelim. https://www.amazon.com/
Tekrar YouTube’sayfasina donelim
Yeniden Amazon sayfasina gidelim
Sayfayi Refresh(yenile) yapalim
Sayfayi kapatalim / Tum sayfalari kapatalim
        */

    }
}
