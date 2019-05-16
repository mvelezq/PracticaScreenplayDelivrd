package com.tcs.certificacion.reto.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://delivrdapp.com/app/users/login")
public class HomePage extends PageObject {

	public static final Target REGISTER_BUTTON = Target.the("Boton de registrar").locatedBy("//a[@id='register-btn']");
	public static final Target EMAIL_INPUT = Target.the("Email de login").locatedBy("//input[@id='UserEmail']");
	public static final Target PASSWORD_INPUT = Target.the("Password").locatedBy("//input[@id='UserPassword']");
	public static final Target LOGIN_BUTTON = Target.the("Boton de login").locatedBy("//button[@type='submit']");
	
	
}
