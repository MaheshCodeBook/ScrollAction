import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

// Scroll down to the page’s bottom using Selenium
public class ScrollAction1 {
    public static void main(String[] args){

        // Set the ChromeDriver location
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win32\\chromedriver.exe");

        // Create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://qadraganddrop.ccbp.tech/");

        // Maximize the browser window
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        // Close the browser
        driver.quit();

    }
}