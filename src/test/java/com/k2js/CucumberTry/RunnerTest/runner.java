package com.k2js.CucumberTry.RunnerTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/java/com/k2js/CucumberTry/feature/Register1.feature",
		glue = {"classpath:com.k2js.CucumberTry.step"},
		snippets = SnippetType.CAMELCASE,
		junit = "--step-notifications",
		dryRun = true,
		tags = {"@tag-2"}
		
		
		
		)


public class runner {

}
