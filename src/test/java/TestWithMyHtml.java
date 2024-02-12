import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestWithMyHtml {

	private RemoteWebDriver driver;
	private WebDriverWait wait;

	@BeforeEach
	void init() {
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@Test
	void test() {
		this.driver.get("http://127.0.0.1:5500/Selenium.html");

		WebElement title = this.driver.findElement(By.tagName("p"));
		Assertions.assertEquals("Wait 2 seconds for the greeting:", title.getText());

		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h2"), "Hello html!"));
		WebElement greeting = this.driver.findElement(By.tagName("h2"));

		Assertions.assertEquals("Hello html!", greeting.getText());
	}

}
