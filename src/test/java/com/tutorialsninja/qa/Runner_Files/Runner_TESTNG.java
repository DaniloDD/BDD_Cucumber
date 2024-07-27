package com.tutorialsninja.qa.Runner_Files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		dryRun = false,
		monochrome = true,
		features = {"src\\test\\resources\\com.tutorialsninja.qa.Feature_Files"},
		glue = {"com.tutorialsninja.qa.Step_Definition", "com.tutorialsninja.qa.Hooks"},
		tags= "@TutorialsNinjaLogin or @TutorialsNinjaRegister",
		plugin = {"pretty", "html:target/site/cucumber-html", "json:target/cucumber1.json"}
		)

public class Runner_TESTNG extends AbstractTestNGCucumberTests {

}