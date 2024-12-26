package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class ArticlePage {
	@FindBy(css="ul.nav.navbar-nav.pull-xs-right> li.nav-item:nth-child(2)")
	public
	WebElement newArticleLink;
	
	@FindBy(css="input[name='title']")
	WebElement titleField;
	
	@FindBy(css="input[name='description']")
	WebElement descField;
	
	@FindBy(css="textarea[name='body']")
	WebElement bodyField;
	
	@FindBy(css="input[name='tags']")
	WebElement tagField;
	
	@FindBy(css=".btn.btn-lg.pull-xs-right.btn-primary")
	WebElement publishBtn;
	
	public ArticlePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
		
	}
	
	public void createArticle(String title, String description, String content,String tag ) {
		newArticleLink.click();
		titleField.sendKeys(title);
		descField.sendKeys(description);
		bodyField.sendKeys(content);
		tagField.sendKeys(tag);
		publishBtn.click();
		
	}
	
 
}