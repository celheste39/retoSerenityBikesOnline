package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userInterface.Bike_UI;

public class Bike_Automatizar implements Task{
	
	private String producto;

	public Bike_Automatizar(String producto) {
		this.producto = producto;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(producto).into(Bike_UI.TXT_BARRA_BUSCAR),
				Click.on(Bike_UI.BTN_BUSCADOR_LUPA),
				Click.on(Bike_UI.BTN_PRODUCTO_SELEC.of(producto)));
	}

	public static Bike_Automatizar on(String producto) {
		return Instrumented.instanceOf(Bike_Automatizar.class).withProperties(producto);
	}
}
