package QA.Pages;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public static WebDriver driver;
    public static Properties prop;


    public BasePage() {
        prop=new Properties();
        try{FileInputStream file=new FileInputStream("src/config.properties"); prop.load(file);}
        catch (IOException e) {e.printStackTrace();}

    }


    public static WebDriver initializeBrowser(){
        String browser=prop.getProperty("browser");
        if(browser.equalsIgnoreCase("chrome")) {
            System.out.println(browser);
            System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/version_95/chromedriver");
            ChromeOptions opts=new ChromeOptions();
            opts.addArguments("--start-maximized");
            opts.addArguments("--disable-geolocation");
            opts.addArguments("--incognito");
            opts.addArguments("--enable-strict-powerful-feature-restrictions");
            driver=new ChromeDriver(opts);
        }
        if(browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver");
            driver=new FirefoxDriver();
        }
        if(browser.equalsIgnoreCase("internetExplorer")) {
            System.setProperty("webdriver.InternetExplorer.driver","src/test/resources/drivers/IEDriverServer");
            driver=new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
        return driver;
    }

    public static void tearDown(){
        if(!(driver==null))
        driver.quit();
    }

    @BeforeEach
    public void OpenBrowser(){
        initializeBrowser();
    }
    @AfterEach
    public void closeBrowser(){
        tearDown();
    }

}


