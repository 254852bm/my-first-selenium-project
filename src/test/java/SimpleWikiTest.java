import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleWikiTest {
    @Test
    void test01() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ru.wikipedia.org/wiki/Selenium");

        WebElement body = driver.findElement(By.tagName("body"));
        assertTrue(body.getText().contains("WebDriver"));

        driver.quit();
    }

    @Test
    void test02() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ru.wikipedia.org/wiki/Selenium");

        WebElement body = driver.findElement(By.tagName("body"));
        // Тест упадет здесь, и driver.quit() ниже не выполнится
        assertTrue(body.getText().contains("Selenide"));

        driver.quit();
    }
}