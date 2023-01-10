package practice_burakhoca;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C02_iframe extends TestBase {

    @Test
    public void test02() {


        // https://the-internet.herokuapp.com/iframe sayfasina gidiniz

        driver.get("https://the-internet.herokuapp.com/iframe");

        // 'An iFrame containing the TinyMCE WYSIWYG Editor' basliginin erisilebilir oldugunu test edin ve konsolda yazdırın.

WebElement baslik=driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(baslik.isEnabled());
        System.out.println("baslik: "+baslik.getText());

        // TextBox'a 'Merhaba Dunya' yazin.
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);
       WebElement textbox= driver.findElement(By.xpath("//*[@id='tinymce']"));
       textbox.clear();
       textbox.sendKeys("Merhaba Dunya");

       // TextBox'in altinda bulunan 'Elemental Selenium' linkinin gorunur oldugunu test edin ve konsolda yazdirin
        driver.switchTo().parentFrame();
        WebElement elementalSelenium=driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));
        Assert.assertTrue(elementalSelenium.isEnabled());
        System.out.println("elemental selenium yazisi:  "+ elementalSelenium.getText());

    }
}
