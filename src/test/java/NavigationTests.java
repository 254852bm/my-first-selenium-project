import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTests {
    @Test
    void testNavigation() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://ya.ru/");
        driver.get("https://ru.wikipedia.org");
        driver.get("https://ru.wikipedia.org/wiki/Selenium");

        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().forward();

        driver.quit();
    }
}