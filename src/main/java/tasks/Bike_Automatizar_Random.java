package tasks;

import interactions.Bike_Random_Click;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.Bike_UI;

public class Bike_Automatizar_Random implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Bike_UI.BTN_CATEGORY_BIKE),
                Bike_Random_Click.on());
    }
    public static Bike_Automatizar_Random on(){
        return Instrumented.instanceOf(Bike_Automatizar_Random.class).withProperties();
    }
}
