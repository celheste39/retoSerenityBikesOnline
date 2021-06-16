package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import driver.SeleniumWebDriver;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.Bike_Automatizar;
import userInterface.Bike_UI;
import java.io.IOException;

public class BikeStepDefinitions
{
    //Before: define las variables, el usuario e instancia al actor
    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^que me encuentro en la pagina de bikesonline (.*)$")
    public void queMeEncuentroEnLaPaginaDeBikesonlineHttpsWwwBikesonlineCom(String url) {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(SeleniumWebDriver.firefoxDriver().on("https://www.bikesonline.com/")));
    }
    @When("^busco diferentes modelos de ciclas (.*) en el buscador$")
    public void buscoDiferentesModelosDeCiclasPolygonSiskiuDDualSuspensionMountainBikeEnElBuscador(String modelo) {
        OnStage.theActorInTheSpotlight().attemptsTo(Bike_Automatizar.on(modelo));
    }
    @Then("^podre ver los modelos (.*) buscados con su precio respectivo$")
    public void podreVerLosModelosPolygonSiskiuDDualSuspensionMountainBikeBuscadosConSuPrecioRespectivo(String modelo) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(Bike_UI.LBL_PRODUCTO_BIKE.of(modelo)), WebElementStateMatchers.containsText(modelo)));
    }
}
