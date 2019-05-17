package com.tcs.certificacion.reto.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tcs.certificacion.reto.userInterfaces.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class OpenCreateAnAccount implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HomePage.REGISTER_BUTTON));
		
	}
	
	public static OpenCreateAnAccount inPage() {
		return instrumented(OpenCreateAnAccount.class);
	}

}
