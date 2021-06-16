package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import globalVar.Bike_global;
import models.Modelos;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.Bike_Automatizar;
import userInterface.Bike_UI;
import java.io.IOException;
import java.util.List;

public class BikeBackgroundStepDefinitions {
    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("^busco varios modelos de ciclas en el buscador$")
    public void buscoVariosModelosDeCiclasEnElBuscador(List<Modelos> mod) {
        OnStage.theActorInTheSpotlight().attemptsTo(Bike_Automatizar.on(mod.get(0).getNombreModelos()));
    }
    @Then("^podre ver unos modelos buscados con su precio respectivo$")
    public void podreVerUnosModelosBuscadosConSuPrecioRespectivo() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(Bike_UI.LBL_PRODUCTO_BIKE.of(Bike_global.modeloAleatorio)), WebElementStateMatchers.containsText(Bike_global.modeloAleatorio)));
    }
}
