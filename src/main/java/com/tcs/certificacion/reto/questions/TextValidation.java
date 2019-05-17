package com.tcs.certificacion.reto.questions;

import com.tcs.certificacion.reto.userInterfaces.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TextValidation implements Question<String>{

	private Target target;
	
	public TextValidation(Target target) {
		this.target = target;
	}
	@Override
	public String answeredBy(Actor actor) {
		return Text.of(target).viewedBy(actor).asString();
		
	}

	public static TextValidation title(Target target) {
		return new TextValidation(target);
	}
}
