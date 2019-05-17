package com.tcs.certificacion.reto.stepDefinitions;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import com.tcs.certificacion.reto.questions.TextValidation;
import com.tcs.certificacion.reto.tasks.FormRegistrer;
import com.tcs.certificacion.reto.tasks.OpenCreateAnAccount;
import com.tcs.certificacion.reto.tasks.OpenTheBrowser;
import com.tcs.certificacion.reto.userInterfaces.HomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

public class createAccountStepDefinition {


	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	private HomePage homePage;
	
	@Before
	public void setStage() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("^the '(.*)' open de navegator$")
	public void theUserOpenDeNavegator(String user) {
	   OnStage.theActorCalled(user).can(BrowseTheWeb.with(hisBrowser));
	}

	@When("^the user enter url page$")
	public void theUserEnterUrlPage() {
	   OnStage.theActorInTheSpotlight().attemptsTo(OpenTheBrowser.on(homePage));
	}

	@Then("^the should see the principal page '(.*)'$")
	public void theShouldSeeThePrincipalPage(String tittle) {
	   OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextValidation.title(HomePage.TITTLE_HOME_PAGE),
			   Matchers.containsString(tittle)));
	}

	
	
	
	@Given("^the user is in the register page$")
	public void theUserIsInTheRegisterPage() {
	    OnStage.theActorInTheSpotlight().wasAbleTo(OpenCreateAnAccount.inPage());
	}

	@When("^the user enter de necesary information$")
	public void theUserEnterDeNecesaryInformation() {
	    OnStage.theActorInTheSpotlight().attemptsTo(FormRegistrer.complete());
	}

	@Then("^the user will be registered in the page$")
	public void theUserWillBeRegisteredInThePage() {
	   
	}


	
}
