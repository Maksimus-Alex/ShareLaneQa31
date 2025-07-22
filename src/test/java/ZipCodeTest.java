import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ZipCodeTest {

    /*
    1. Открыть браузер chrome
    2. в браузере открыть страницу https://www.sharelane.com/cgi-bin/register.py
    3. Ввести в поле ZipCode 4 цифры 1234
    4. Нажать кнопку
    5. проверить что на экране появилась ошибка с текстом Oops, error on page. ZIP code should have 5 digits
    6. Закрыть браузер
     */

@Test
    public void test() {
    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    WebDriver browser = new ChromeDriver(); // указываем что хотим работать с Chrome
    browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    browser.get("https://www.sharelane.com/cgi-bin/register.py");
    browser.findElement(By.name("zip_code")).sendKeys("1234");
    browser.findElement(By.cssSelector("[value=Continue")).click();
    String errorMessage =  browser.findElement(By.className("error_message")).getText();
    Assert.assertEquals(errorMessage, "Oops, error on page. ZIP code should have 5 digits");

    browser.quit();
    }
}
