import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ViktoryiaKudrautsavaHW11 {

//    TC_11_01
//    1.  Открыть базовую ссылку
//    2.  Нажать на пункт меню Guide
//    3.  Подтвердить, что вы перешли на страницу со ссылкой https://openweathermap.org/guide
//    и что title этой страницы OpenWeatherMap API guide - OpenWeatherMap

    @Test
    public void testOpenAndClickToGuide() throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\usaku\\OneDrive\\Desktop\\УЧЕБА\\Chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://openweathermap.org/";
        String buttonGuide = "Guide";
        String expectedResult1 = "https://openweathermap.org/guide";
        String expectedResult2 = "OpenWeatherMap API guide - OpenWeatherMap";

        driver.get(url);
        Thread.sleep(5000);

        WebElement ButtonGuide = driver.findElement(
                By.xpath("//a[@href = '/guide']")
        );
        ButtonGuide.click();

        String actualResult1 = driver.getCurrentUrl();
        String actualResult2 = driver.getTitle();

        Assert.assertEquals(actualResult1, expectedResult1);
        Assert.assertEquals(actualResult2, expectedResult2);

        driver.quit();

    }
}
