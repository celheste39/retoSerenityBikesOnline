package interactions;

import globalVar.Bike_global;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.*;
import userInterface.Bike_UI;
import java.util.List;
import java.util.Random;

public class Bike_Random_Click implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            Thread.sleep(15000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        Random ra = new Random();
        List<WebElementFacade> listaBtnModelos = Bike_UI.BTN_PRODUCTO_RANDOM.resolveAllFor(actor);
        List<WebElementFacade> listaLblModelos = Bike_UI.BTN_PRODUCTO_RANDOM.resolveAllFor(actor);
        int nRandom = ra.nextInt(listaBtnModelos.size() + 1);
        Bike_global.modeloAleatorio = listaLblModelos.get(nRandom).getText();
        listaBtnModelos.get(nRandom).click();
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static Performable on(){
        return Instrumented.instanceOf(Bike_Random_Click.class).withProperties();
    }
}