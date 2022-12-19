package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElementsVeLocator {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();//browseri acmak icin
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Amazon sayfasina gidelim
        driver.navigate().to("https://www.amazon.com/");
        // Search bolumunu locate edelim
        //WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        WebElement searchBox = driver.findElement(By.name("field-keywords"));
        //WebElement searchBox = driver.findElement(By.linkText("Careers"));
        searchBox.click();
        searchBox.sendKeys("iPhone", Keys.ENTER);
        /*
        Eger bir webelementi (Web sayfasindaki her bir buton ya da text/yazi) locate (konumunu belirleme)
        etmek istersek once manual olarak web sayfasini acip sayfa uzerinde sag click yapip incele/inspect butonuna tiklariz.
        Karsimiza cikan HTML code'larindan locator'lardan (konum belirleyiciler) unique (essiz) olani seceriz.
        Genellikle id Attribute'u kullanilir. Sectigimiz attribute degerini findElement() method'u icine
        findElement(BY.id("attribute degeri")) seklinde yazariz.
         */
        // Amazon sayfasındaki <input> ve <a> tag'larının sayısını yazdırınız
        List<WebElement> inputTags = driver.findElements(By.tagName("input"));
        System.out.println("Input Tag Sayısı = "+inputTags.size());
        List<WebElement> linklerList = driver.findElements(By.tagName("a"));
        System.out.println("Link Sayısı = "+linklerList.size());

    }
}
