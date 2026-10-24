import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchDemoTest {
    @Test
    public void testElementSearchMethods() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://slqamsk.github.io/demo/search-demo/");

        WebElement submitBtn = driver.findElement(By.id("submit-button"));
        assertTrue(submitBtn.isDisplayed());

        WebElement interestsField = driver.findElement(By.name("interests"));
        assertTrue(interestsField.isDisplayed());

        WebElement navLink = driver.findElement(By.className("nav-link"));
        assertTrue(navLink.isDisplayed());

        WebElement inputField = driver.findElement(By.tagName("input"));
        assertTrue(inputField.isDisplayed());

        WebElement contactLink = driver.findElement(By.linkText("Контакты и обратная связь"));
        assertTrue(contactLink.isDisplayed());

        WebElement longLink = driver.findElement(By.partialLinkText("длинный"));
        assertTrue(longLink.isDisplayed());

        //driver.quit();
    }
}