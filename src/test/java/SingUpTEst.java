import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SingUpTEst {
     /*
    1. Открыть браузер chrome
    2. в браузере открыть страницу https://www.sharelane.com/cgi-bin/register.py
    3. Ввести в поле ZipCode 5 цифры 12345
    4. Нажать кнопку
    5. Заполнить форму регистрации
    6. Нажать кнопку Regist
    7. проверить, что на странице есть сообщение Account s Created
    8. Pfrhsnm ,hfepth
     */


    @Test
    public void checkSingUpValidUserData() {
        WebDriver browser = new ChromeDriver(); // указываем что хотим работать с Chrome
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        browser.get("https://www.sharelane.com/cgi-bin/register.py");// перешли на ZipCode
        browser.findElement(By.name("zip_code")).sendKeys("12345");// Ввели значение в ZipCode
        browser.findElement(By.cssSelector("[value=Continue")).click();// нажимаем Continue
        browser.findElement(By.name("first_name")).sendKeys("test");// После перехода на другую страницу мы просим найти элемент first_name и ввести значение
        browser.findElement(By.name("last_name")).sendKeys("test");// тоже самое
        browser.findElement(By.name("email")).sendKeys("test@test.test");
        browser.findElement(By.name("password1")).sendKeys("12345678");
        browser.findElement(By.name("password2")).sendKeys("12345678");
        browser.findElement(By.cssSelector("[value=Register]")).click();// после ввода всех данных нажимаем на Register
        String message = browser.findElement(By.className("confirmation_message")).getText();
        Assert.assertEquals(message, "Account is created!");// тут мы получаем сообщение что аккаунт создан
        browser.quit();

    }
}
