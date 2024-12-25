package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src//test//resources//features//conduit.feature",
		glue= {"stepDefs"},
	    monochrome=true,
	    plugin= {"pretty",
	    		"html:target/reports/HTMLReport.html"
		}
	   )

public class loginRunner extends AbstractTestNGCucumberTests {

  @Test
  public void f() {
  }
}
