package stepDefs;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.ArticlePage;
import java.util.Map;

public class ArticlePageStepDefs {
    WebDriver driver;
    ArticlePage articlePage;

    @Given("User should be on New Article Page")
    public void user_should_be_on_new_article_page() {
        
        articlePage = new ArticlePage(driver);
       
    }

    @When("User enters Article details")
    public void user_enters_article_details(io.cucumber.datatable.DataTable dataTable) {
        
        Map<String, String> data = dataTable.asMap(String.class, String.class);
        
        articlePage.createArticle(data.get("title"), data.get("desc"), data.get("Content"), data.get("tag"));
    }
}
