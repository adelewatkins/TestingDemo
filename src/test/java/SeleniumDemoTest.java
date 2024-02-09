import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumDemoTest {

	private RemoteWebDriver driver;

	@BeforeEach
	void init() {
		// creates a new chrome window
		this.driver = new ChromeDriver();
		// sets it to full screen
		this.driver.manage().window().maximize();
	}

//	@Test
//	void seleniumTest() {
//		// opens bing.com
//		this.driver.get("http://www.bing.com");
//	}

//	@Test
//	void textBoxTest() {
//		this.driver.get("https://demoqa.com/text-box");
//		WebElement consent = this.driver.findElement(By.cssSelector(
//				"body > div.fc-consent-root > div.fc-dialog-container > div.fc-dialog.fc-choice-dialog > div.fc-footer-buttons-container > div.fc-footer-buttons > button.fc-button.fc-cta-consent.fc-primary-button > p"));
//		consent.click();
//
//		WebElement fullName = this.driver.findElement(By.id("userName"));
//		fullName.sendKeys("Adele");
//
//		WebElement email = this.driver.findElement(By.id("userEmail"));
//		email.sendKeys("adele@adele.com");
//
//		WebElement currentAddress = this.driver.findElement(By.id("currentAddress"));
//		currentAddress.sendKeys("123 Street");
//
//		WebElement permAddress = this.driver.findElement(By.id("permanentAddress"));
//		permAddress.sendKeys("456 Road");
//
//		WebElement submit = this.driver.findElement(By.id("submit"));
//		this.driver.executeScript("arguments[0].scrollIntoView(true);", submit);
//		submit.click();
//
//		WebElement display = this.driver.findElement(By.id("name"));
//
//		Assertions.assertEquals(true, display.getText().contains("Adele"));
//
//	}

	@Test
	void checkBoxTest() {
		this.driver.get("https://demoqa.com/text-box");
		WebElement consent = this.driver.findElement(By.cssSelector(
				"body > div.fc-consent-root > div.fc-dialog-container > div.fc-dialog.fc-choice-dialog > div.fc-footer-buttons-container > div.fc-footer-buttons > button.fc-button.fc-cta-consent.fc-primary-button > p"));
		consent.click();

		WebElement checkBox = this.driver.findElement(By.cssSelector("#item-1 > span"));
		this.driver.executeScript("arguments[0].scrollIntoView(true);", checkBox);
		checkBox.click();

		WebElement homeDrop = this.driver.findElement(By.cssSelector("#tree-node > ol > li > span > button > svg"));
		this.driver.executeScript("arguments[0].scrollIntoView(true);", homeDrop);
		homeDrop.click();

		WebElement docDrop = this.driver
				.findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > span > button > svg"));
		this.driver.executeScript("arguments[0].scrollIntoView(true);", docDrop);
		docDrop.click();

		WebElement workDrop = this.driver.findElement(By.cssSelector(
				"#tree-node > ol > li > ol > li.rct-node.rct-node-parent.rct-node-expanded > ol > li:nth-child(1) > span > button > svg"));
		this.driver.executeScript("arguments[0].scrollIntoView(true);", workDrop);
		workDrop.click();

		WebElement reactBox = this.driver.findElement(By.cssSelector(
				"#tree-node > ol > li > ol > li.rct-node.rct-node-parent.rct-node-expanded > ol > li.rct-node.rct-node-parent.rct-node-expanded > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg"));
		this.driver.executeScript("arguments[0].scrollIntoView(true);", reactBox);
		reactBox.click();

		WebElement output = this.driver.findElement(By.cssSelector("#result"));

		Assertions.assertTrue(output.getText().contains("react"));

	}

//	@AfterEach
//	void tearDown() {
//		this.driver.quit();
//	}

}
