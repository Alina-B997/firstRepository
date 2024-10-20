package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageAllForCats {

    private WebDriver driver;

    public PageAllForCats(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='search_term']")
    WebElement searchField;

    @FindBy(xpath = "//*[@aria-label='Шукати']")
     WebElement searchButton;


    public void selectLocation() {
        searchField.sendKeys("мишка");
    }

    public void clickSearch() {
        searchButton.click();
    }

}
