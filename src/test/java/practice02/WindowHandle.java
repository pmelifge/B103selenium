package practice02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class WindowHandle extends TestBase {
    @Test
    public void test01() {
        //Amazon anasayfa adresine gidin.
        driver.get("https://amazon.com");
        //Sayfa’nin window handle degerini String bir degiskene atayin
        String window1Handle = driver.getWindowHandle();
        //Sayfa title’nin “Amazon” icerdigini test edin
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains("Amazon"));
        //Yeni bir tab olusturup, acilan tab’da techproeducation.com adresine gidin
        driver.switchTo().newWindow(WindowType.TAB); // Yeni bir sekme acmis olduk
        driver.get("https://techproeducation.com");
        //Sayfa title’nin “TECHPROEDUCATION” icermedigini test edin
        String techProTitle = driver.getTitle();
        Assert.assertFalse(techProTitle.contains("TECHPROEDUCATION"));
        //Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
        driver.switchTo().newWindow(WindowType.WINDOW); // Yeni bir pencere acmis olduk
        driver.get("https://www.walmart.com");
        //Sayfa title’nin “Walmart” icerdigini test edin
        String walmartTitle = driver.getTitle();
        Assert.assertTrue(walmartTitle.contains("Walmart"));
        //Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin
        driver.switchTo().window(window1Handle);
        String amazonUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";
        Assert.assertEquals(expectedUrl,amazonUrl);
    }
}
