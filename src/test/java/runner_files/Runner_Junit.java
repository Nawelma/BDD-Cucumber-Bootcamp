package runner_files;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		dryRun = false,
		monochrome = true,
		features = {"src/test/resources/features_files"},
		glue = {"src/test/java/step_definitios_files"},
		tags = "@TutorialsNinjalogin or @TutorialsNinjaRegister or @TutotrialsNinjaLogout or @TutorialsNinjaSearchProduct or @TutorialsNinjaAddToCart",
	    plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)


public class Runner_Junit {

}
