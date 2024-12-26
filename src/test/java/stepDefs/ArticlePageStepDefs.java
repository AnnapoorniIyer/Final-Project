package stepDefs;

import org.openqa.selenium.WebDriver;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArticlePage;

import java.util.List;
import java.util.Map;

public class ArticlePageStepDefs {
    WebDriver driver = TestBase.getDriver();
    ArticlePage articlePage;

    // Method to initialize the ArticlePage object
    private void initializeArticlePage() {
        articlePage = new ArticlePage(driver);
    }

    @Given("User should be on New Article Page")
    public void user_should_be_on_new_article_page() {
        TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/");
        initializeArticlePage(); // Initialize articlePage here
    }

    @When("User enters Article details")
    public void user_enters_article_details(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps();

        // Ensure articlePage is initialized before calling createArticle
        if (articlePage == null) {
            initializeArticlePage();
        }

        // Call the createArticle method
        articlePage.createArticle(data.get(0).get("title"), data.get(0).get("Desc"), data.get(0).get("Content"), data.get(0).get("tags"));
    }

    @Then("Article must be created")
    public void article_must_be_created() {
        // Add assertions or checks to verify that the article was created
    }
}
