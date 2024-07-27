package com.tutorialsninja.qa.Runner_Files;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false, monochrome = true, 
		features = "\\src\\test\\resources\\com.tutorialsninja.qa.Feature_Files", 
		glue = {"Step_Definition","Hooks" }, 
		tags = "@TutorialsNinjaLogin or @TutorialsNinjaRegistration or @TutorialsNinjaSearchProduct", 
		plugin = {"pretty", "html:target/site/cucumber-html", "json:target/cucumber1.json" }
		)

public class Runner_JUNIT {
}
