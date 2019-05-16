package com.tcs.certificacion.reto.runners;

import static cucumber.api.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/createAccount.feature",
		glue = "com.tcs.certificacion.reto.stepDefinitions",
		snippets = CAMELCASE
		)

public class createAccountRunner {

}
