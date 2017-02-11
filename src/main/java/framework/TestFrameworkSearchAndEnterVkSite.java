package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.io.*;

/**
 * Created by MyHome on 28/01/2017.
 */
public class TestFrameworkSearchAndEnterVkSite {
    PageObject pageObject;
    WebDriver webDriver;
    //StaticDataProviders staticDataProviders;

    public static By SEARCH_FIELD = By.xpath("//*[@id='lst-ib']");
    public static By PRINCIPAL_RESULT = By.xpath("//*[@id='ires']/descendant::*[@class='r']/descendant::*[@href='https://vk.com/']");
    public static By VK_LOGO = By.xpath("//*[@class='top_home_logo']");
    public static By VK_LOGIN = By.xpath("//*[@id='index_email']");
    public static By VK_PASSWORD = By.xpath("//*[@id='index_pass']");
    public static By VK_LOGIN_BTN = By.xpath("//*[@id='index_login_button']");
    public static By MY_PROFILE_FIELD = By.xpath("//*[@class='left_label inl_bl' and contains(text, 'My Profile')]");
    public static By VK_PROFILE_ARROW_BTN = By.xpath("//*[@class='top_profile_arrow']");
    public static By VK_LOGOUT_BTN = By.xpath("//*[@id='top_logout_link']");



    public TestFrameworkSearchAndEnterVkSite(WebDriver webDriver) { this.webDriver=webDriver;}


    public void googleSearch(String searchText){
        webDriver.findElement(SEARCH_FIELD).click();
        webDriver.findElement(SEARCH_FIELD).sendKeys(searchText);
        webDriver.findElement(PRINCIPAL_RESULT).click();
    }

    public void validateVkPage(){
        webDriver.findElement(VK_LOGO);
        webDriver.findElement(VK_LOGIN);
        webDriver.findElement(VK_PASSWORD);
    }

    public void joinVk(boolean joinValidation){
        webDriver.findElement(VK_LOGIN).sendKeys(StaticDataProviders.LOGIN_VK);
        webDriver.findElement(VK_PASSWORD).sendKeys(StaticDataProviders.PASSWORD_VK);
        webDriver.findElement(VK_LOGIN_BTN).click();
                if(joinValidation){
                    webDriver.findElement(MY_PROFILE_FIELD);
                }
    }

    public void logOutVk(boolean logoutValidation){
        webDriver.findElement(VK_PROFILE_ARROW_BTN).click();
        webDriver.findElement(VK_LOGOUT_BTN).click();
        if (logoutValidation){
            validateVkPage();
        }

    }
}
