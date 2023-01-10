package day04_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Tekrar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();//browseri acmak icin
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasina gidiniz
        driver.get("https://www.amazon.com");

        //arama kutusunu locate ediniz
        WebElement searchTextBox = driver.findElement(By.id("twotabsearchtextbox"));

        //arama kutusunun tagName'inin input oldugunu test ediniz
        String actualTagName = searchTextBox.getTagName();
        String expectedTagname = "input";
        if(actualTagName.equals(expectedTagname)){
            System.out.println("tagName test PASSED");
        }else System.out.println("tagName test FAILED!!! actualTagName = "+actualTagName);

        //arama kutusunun name atribute'unun degerinin field-keywords oldugunu test ediniz
        String actualNameAtribute = searchTextBox.getAttribute("name");
        String expectedNameAtribute = "field-keywords";
        if(actualNameAtribute.equals(expectedNameAtribute)){
            System.out.println("nameAtribute test PASSED");
        }else System.out.println("nameAtribute test FAILED!!! actualNameAtribute = "+actualNameAtribute);

        //sayfayi kapatiniz
        driver.close();
    }
    }

