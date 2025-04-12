package intervueio;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;
import java.io.File;
import java.util.ArrayList;

public class IntervueLoginTest {
    public static void main(String[] args) throws Exception {
        // Set up ChromeDriver
        System.setProperty("webdriver.chrome.driver", "./softwaress/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       
        Thread.sleep(1000);
        driver.get("https://www.intervue.io");

        
        // Click on Login
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='iv-homepage-login']/div/a[2]")).click();
       

        // Switch to new tab
        Thread.sleep(1000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class='AccessAccount-ColoredButton-Text'])[1]")).click();
        
        
        //login
        WebElement emailField = driver.findElement(By.name("email"));
        WebElement passwordField = driver.findElement(By.name("password"));
        
        Thread.sleep(1000);
        emailField.sendKeys("neha@intervue.io");
        Thread.sleep(1000);
        passwordField.sendKeys("Ps@neha@123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        //Screenshot
        try {
        	Thread.sleep(5000);
            WebElement fail = driver.findElement(By.xpath("//span[@class='ant-alert-message']"));
            if (fail.isDisplayed()) {
                TakesScreenshot ts = (TakesScreenshot) driver;
                File src = ts.getScreenshotAs(OutputType.FILE);
                File dest = new File(".\\Screenshot\\ss2.png");

                // Make sure folder exists
                dest.getParentFile().mkdirs();
                Files.copy(src, dest);
                System.out.println("Login failed. Screenshot saved.");
            }
       
        } catch (NoSuchElementException e) {
            System.out.println("No login error message found. Login may have succeeded.");
    }
        
       Thread.sleep(8000); 
       driver.findElement(By.xpath("//div[contains(@class,'HeaderSearch__Wrapper')]/span")).click();
       Thread.sleep(1000); 
       WebElement search = driver.findElement(By.xpath("//input[contains(@class,'SearchBox__StyledInput')]"));
       search.sendKeys("hello");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//div[contains(@class,'SearchThrough__PlaceholderText')]")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("//div[@class='ant-dropdown-link ProfileHeader__StyedDropdownHoverLink-sc-1gwp6c1-3 cwhrSp']")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("(//a[@class='Dropdown__DropdownItemLink-k60emx-2 hHnuKn'])[5]")).click();
       Thread.sleep(5000);  
   }
}