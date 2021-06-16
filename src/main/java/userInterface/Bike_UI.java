package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class Bike_UI {
	public static final Target TXT_BARRA_BUSCAR = Target.the("").locatedBy("//input[@class='form-control ajax_search findify-autocomplete-search-selector']");
	public static final Target BTN_BUSCADOR_LUPA = Target.the("").locatedBy("//button[@class='btn btn-info']");
	public static final Target BTN_PRODUCTO_SELEC = Target.the("").locatedBy("/html/body/div[7]/div/div/div[1]/div[2]/div/div[2]/div[2]/div[1]/div/div/a");
	public static final Target LBL_PRODUCTO_BIKE = Target.the("").locatedBy("//h1[@id='p_title']");
	public static final Target BTN_PRODUCTO_RANDOM = Target.the("").locatedBy("//div[@class='findify-components-common--grid']//a//span[contains(@class,'title')]");
	public static final Target BTN_CATEGORY_BIKE = Target.the("").locatedBy("//div[@id='navbar-responsive-collapse1']//a[@href='https://www.bikesonline.com/cycling-apparel/']");
}