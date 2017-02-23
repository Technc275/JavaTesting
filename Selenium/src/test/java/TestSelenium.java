import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;

import java.io.File;

/**
 * Created by Hamster on 2/23/2017.
 */
public class TestSelenium {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Create a new instance of the Firefox driver

        File pathToBinary = new File("C:\\Users\\Hamster\\Desktop\\FirefoxPortable\\FirefoxPortable.exe");
        FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        driver = new FirefoxDriver(ffBinary,firefoxProfile);

    }

    //https://sourceforge.net/projects/portableapps/files/Mozilla%20Firefox%2C%20Portable%20Ed./Mozilla%20Firefox%2C%20Portable%20Edition%2046.0.1/

    @Test // Marking this method as part of the test
    public void gotoSeleniumWikiPage() {
        // Go to the Wikipedia home page
        driver.get("https://en.wikipedia.org/");
        // Find the text input element by its id and type "Selenium"
        driver.findElement(By.id("searchInput")).sendKeys("Selenium");
        // Click search button
        driver.findElement(By.id("searchButton")).click();
        // Get text from header of the Selenium page
        String header = driver.findElement(By.id("firstHeading")).getText();
        // Verify that header equals "Selenium"
        Assert.assertEquals(header, "Selenium");
    }

    @After
    public void tearDown() {
        // Close all browser windows and safely end the session
        driver.quit();
    }


}
