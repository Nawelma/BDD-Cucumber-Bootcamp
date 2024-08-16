package runner_files;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		
		dryRun = false,
		monochrome = true,
		features = {"src/test/resources/features_files"},
		glue = {"src/test/java/step_definitios_files"},
		tags = "@TutorialsNinjalogin or @TutorialsNinjaRegister or @TutotrialsNinjaLogout or @TutorialsNinjaSearchProduct or @TutorialsNinjaAddToCart",
		plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)


public class Runner_TestNG extends AbstractTestNGCucumberTests {

}
