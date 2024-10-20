package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddPlusAndCart {

    private WebDriver driver;
    private WebDriverWait wait;

    public AddPlusAndCart (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='quantity-controls quantity-plus']")
    WebElement AddPlus;

    @FindBy(xpath = "//*[@name='addtocart']")
    WebElement AddToCart;

    @FindBy(xpath = "//*[@href='/index.php?option=com_virtuemart&view=category&virtuemart_category_id=138&lang=ua']")
    WebElement clickBears;

        public void addPlus(){
        AddPlus.click();
        }

        public void addCart(){
        AddToCart.click();
        }

        public void clickBears(){
        clickBears.click();
        }
}
