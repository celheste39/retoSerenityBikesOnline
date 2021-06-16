package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import globalVar.Bike_global;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.Bike_Automatizar_Random;
import userInterface.Bike_UI;

import java.io.IOException;

public class BikeRandomStepDefinitions {
    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("^busco un modelo aleatorio de cicla en el buscador$")
    public void buscoUnModeloAleatorioDeCiclaEnElBuscador() {
        OnStage.theActorInTheSpotlight().attemptsTo(Bike_Automatizar_Random.on());
    }
    @Then("^podre ver un modelo aleatorio buscado con su precio respectivo$")
    public void podreVerUnModeloAleatorioBuscadoConSuPrecioRespectivo() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(Bike_UI.LBL_PRODUCTO_BIKE.of(Bike_global.modeloAleatorio))));
    }
}
