package co.com.bancolombia.certification.pruebasbanistmo.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class Components extends PageObject{
	
	public static final Target PRODUCTS_SERVICES = Target.the("productos y servicios").located(By.xpath("//input[@placeholder='Buscar']"));
	public static final Target CARD_CREDIT = Target.the("tarjeta de credito").located(By.xpath("//a[@class='yt-simple-endpoint style-scope ytd-toggle-button-renderer']"));

}
