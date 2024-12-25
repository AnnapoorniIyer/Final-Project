package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;



public class ArticlePage {
	@FindBy(xpath="//i[contains(@class,'ion-compose')]")
	WebElement newArticleLink;
	
	@FindBy(css="input[name='title']")
	WebElement titleField;
	
	@FindBy(css="input[name='description']")
	WebElement descField;
	
	@FindBy(css="textarea[name='body']")
	WebElement bodyField;
	
	@FindBy(css="input[name='tags']")
	WebElement tagField;
	
	@FindBy(css="")
	
	
  @Test
  public void f() {
  }
}
