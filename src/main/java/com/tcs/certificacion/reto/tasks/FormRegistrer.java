package com.tcs.certificacion.reto.tasks;

import com.tcs.certificacion.reto.model.enums.DataRegister;
import com.tcs.certificacion.reto.userInterfaces.RegisterPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FormRegistrer implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(DataRegister.NAME.getValue()).into(RegisterPage.NAME_INPUT),
				Enter.theValue(DataRegister.EMAIL.getValue()).into(RegisterPage.EMAIL_INPUT),
				Enter.theValue(DataRegister.PASSWORD.getValue()).into(RegisterPage.PASSWORD_INPUT),
				Click.on(RegisterPage.AGREED_TERMS_INPUT)
				);
		
	}

	
	
}
