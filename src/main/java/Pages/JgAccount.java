package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class JgAccount {

    private WebDriver driver;
    private WebDriverWait wait;

   public JgAccount (WebDriver driver){
       this.driver = driver;
       PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='pt-mytalk']")
    WebElement comWiki;

    @FindBy(xpath = "//*[@title='Українська мова']")
    WebElement link;

        public void comWiki(){
        comWiki.click();
        }

        public void link(){
         link.click();
        }
}
