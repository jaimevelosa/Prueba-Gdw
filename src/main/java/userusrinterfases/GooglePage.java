package userusrinterfases;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com/")
public class GooglePage extends PageObject {
	public static final Target INPUT_CONSULTA = Target.the("Caja de texto para consultar").located(By.name("q"));
	public static final Target INPUT_BOTON = Target.the("Dar clic para confirmar consulta").located(By.name("btnK")); 
}