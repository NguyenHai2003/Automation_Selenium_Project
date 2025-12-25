package com.company.test.pages;

import com.company.framework.drivers.DriverManager;
import com.company.framework.helpers.browser.BrowserHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * BasePage cho Web Browser
 * Sử dụng cho Web pages
 *
 * Ví dụ:
 * <pre>
 * public class LoginPage extends BasePage {
 *     @FindBy(id = "username")
 *     private WebElement usernameField;
 *
 *     @FindBy(id = "password")
 *     private WebElement passwordField;
 *
 *     @FindBy(id = "loginButton")
 *     private WebElement loginButton;
 *
 *     public void login(String username, String password) {
 *         usernameField.sendKeys(username);
 *         passwordField.sendKeys(password);
 *         loginButton.click();
 *     }
 * }
 * </pre>
 */
public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        this.driver = DriverManager.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    /**
     * Lấy URL hiện tại
     */
    protected String getCurrentUrl() {
        return BrowserHelper.getCurrentUrl();
    }

    /**
     * Lấy title của trang
     */
    protected String getPageTitle() {
        return BrowserHelper.getPageTitle();
    }

    /**
     * Điều hướng đến URL
     */
    protected void navigateTo(String url) {
        BrowserHelper.navigateToUrl(url);
    }

    /**
     * Quay lại trang trước
     */
    protected void goBack() {
        BrowserHelper.goBack();
    }

    /**
     * Refresh trang
     */
    protected void refresh() {
        BrowserHelper.refresh();
    }
}

