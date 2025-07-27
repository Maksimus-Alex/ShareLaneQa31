import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class ShoppingCard_test{

    @Test
    public void checkDiscount(){
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = new ChromeDriver(); // указываем что хотим работать с Chrome
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=11111&first_name" +
                "=Max&last_name=&email=Maxxx%40Gmail.com&password1=111111&password2=111111");
        String email = driver.findElement(By.xpath
                ("/html/body/center/table/tbody/tr[6]/td/table/tbody" +
                        "/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=1");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("19");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountDollar = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalDollar = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        softAssert.assertEquals(discountPercent, "0");
        softAssert.assertEquals(discountDollar, "0.0");
        softAssert.assertEquals(totalDollar, "190");
        driver.quit();
        softAssert.assertAll();
    }
    @Test
    public void checkDiscounttable2Precent(){

        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = new ChromeDriver(); // указываем что хотим работать с Chrome
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=11111&first_name" +
                "=Max&last_name=&email=Maxxx%40Gmail.com&password1=111111&password2=111111");
        String email = driver.findElement(By.xpath
                ("/html/body/center/table/tbody/tr[6]/td/table/tbody" +
                        "/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=1");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("25");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountDollar = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalDollar = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();
        softAssert.assertEquals(discountPercent, "2");
        softAssert.assertEquals(discountDollar, "5.0");
        softAssert.assertEquals(totalDollar, "250");
        driver.quit();
        softAssert.assertAll();
    }
    @Test
    public void checkDiscounttable3Precent(){

        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = new ChromeDriver(); // указываем что хотим работать с Chrome
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=11111&first_name" +
                "=Max&last_name=&email=Maxxx%40Gmail.com&password1=111111&password2=111111");
        String email = driver.findElement(By.xpath
                ("/html/body/center/table/tbody/tr[6]/td/table/tbody" +
                        "/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=1");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("51");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountDollar = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalDollar = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        softAssert.assertEquals(discountPercent, "3");
        softAssert.assertEquals(discountDollar, "15.3");
        softAssert.assertEquals(totalDollar, "510");
        driver.quit();
        softAssert.assertAll();
    }
    @Test
    public void checkDiscounttable4Precent() {

        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = new ChromeDriver(); // указываем что хотим работать с Chrome
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=11111&first_name" +
                "=Max&last_name=&email=Maxxx%40Gmail.com&password1=111111&password2=111111");
        String email = driver.findElement(By.xpath
                ("/html/body/center/table/tbody/tr[6]/td/table/tbody" +
                        "/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=1");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("101");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountDollar = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalDollar = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        softAssert.assertEquals(discountPercent, "4");
        softAssert.assertEquals(discountDollar, "40.4");
        softAssert.assertEquals(totalDollar, "1010");
        driver.quit();
        softAssert.assertAll();
    }
}
