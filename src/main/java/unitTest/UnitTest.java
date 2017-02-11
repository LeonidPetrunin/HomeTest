package unitTest;

import framework.TestFrameworkSearchAndEnterVkSite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by MyHome on 28/01/2017.
 */
public class UnitTest {
    public static void main(String[] args) {
        System.setProperty("C:\\Users\\MyHome\\IdeaProjects\\TestSearch", "chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        TestFrameworkSearchAndEnterVkSite testFrameworkSearchAndEnterVkSite = new TestFrameworkSearchAndEnterVkSite(webDriver);
        webDriver.get("https://google.co.il");
        testFrameworkSearchAndEnterVkSite.googleSearch("vk.com");
        testFrameworkSearchAndEnterVkSite.validateVkPage();
        testFrameworkSearchAndEnterVkSite.joinVk(true);
        testFrameworkSearchAndEnterVkSite.logOutVk(true);
        webDriver.close();
    }


}
