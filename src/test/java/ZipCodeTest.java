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
    public void checkZipCode4Digits() {

    WebDriver browser = new ChromeDriver(); // указываем что хотим работать с Chrome
    browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    browser.get("https://www.sharelane.com/cgi-bin/register.py");
    browser.findElement(By.name("zip_code")).sendKeys("1234");
    browser.findElement(By.cssSelector("[value=Continue")).click();
    String errorMessage =  browser.findElement(By.className("error_message")).getText();
    Assert.assertEquals(errorMessage, "Oops, error on page. ZIP code should have 5 digits");

    browser.quit();
    }
@Test
    public void checkURLZipCode() {

        WebDriver browser = new ChromeDriver(); // указываем что хотим работать с Chrome
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value=Continue")).click();
        // формально при правильно вводе мы знаем на какой URL нам надо пепейти
    // соответвенно нам надо просто сравнить что наше оиждание совпадает с реальностью
        String expURL = "https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=11111"; // Ожидание
        /*
        Функция getCurrentUrl() используется для получения текущего URL страницы в браузере.
        В зависимости от контекста, она может возвращать полный URL, включая протокол, домен, путь и параметры,
        либо относительный URL, который начинается после домена.
         */
        String actURL = browser.getCurrentUrl();// реальность
        Assert.assertEquals(expURL,actURL);
        /*
        assertEquals используется для сравнения двух значений или объектов.
         Если они не равны, это означает, что в коде есть ошибка, которую нужно исправить.
         */
    // не знаю как закончить


        browser.quit();
    }
}
