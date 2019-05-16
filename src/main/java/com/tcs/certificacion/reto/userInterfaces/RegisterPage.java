package com.tcs.certificacion.reto.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {

public static final Target NAME_INPUT = Target.the("Nombre en registro").locatedBy("//input[@id='UserCompany']");
public static final Target EMAIL_INPUT = Target.the("EMAIL en registro").locatedBy("//input[@id='UserEmail']");
public static final Target PASSWORD_INPUT = Target.the("pasword en registro").locatedBy("//input[@id='password']");
public static final Target AGREED_TERMS_INPUT = Target.the("Aceptar terminos").locatedBy("//input[@id='UserEmail']");

	
}
