import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilkclass {
    /*
   En temel haliyle otomasyon yapmak icin Class'imiza otomasyon icin gerekli olan
webdriver'in yerini gostermemiz gerekir. Bunun icin Java kutuphanesinden System.setProperty()
method'unun icine ilk olarak driver'i yazariz. Ikinci olarak driver'in fiziki yolunu kopyalariz.
 */
    public static void main(String[] args) {
        System.setProperty("web driver.chrome.driver", "C:\\Users\\Lenonvo\\IdeaProjects\\SeleniumNewProject\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//List oluştururken sonunda ArrayList yazmamız gibi..interface lerin constructor i yok
        driver.get("https://www.amazon.com");



    }
}
