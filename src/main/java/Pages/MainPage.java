package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public MainPage (WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='mod_virtuemart_search']")
    WebElement searchField;

    @FindBy(xpath = "//*[@class='searchbtn']")
    WebElement searchButton;

    @FindBy(xpath = "//*[@class='orderby-displaynumber']")
    WebElement text;


        public void setSearchField(){
        searchField.sendKeys("Орхідея");
        }

        public void setSearchButton(){
        searchButton.click();
        }

        public void waiter(){
        wait.until(ExpectedConditions.visibilityOf(text));
        }
}
