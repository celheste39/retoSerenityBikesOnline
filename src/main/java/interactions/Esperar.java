package interactions;

import driver.SeleniumWebDriver;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import java.util.concurrent.TimeUnit;

public class Esperar implements Interaction {
    private int sec;
    public Esperar(int sec){
        this.sec = sec;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        SeleniumWebDriver.driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
    }
    public static Performable tiempo(int sec){
        return Instrumented.instanceOf(Esperar.class).withProperties(sec);
    }
}
