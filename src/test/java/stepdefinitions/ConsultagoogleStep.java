package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import tasks.Consultatema;
import userusrinterfases.GooglePage;

public class ConsultagoogleStep {
	
	@Managed (driver ="chrome")
	private WebDriver navegador;
	private Actor actor = Actor.named("cliente");
	private GooglePage page =new GooglePage();
	
	
	@Given("^que el usuario se encuentra en la pagina inicial del buscador de google$")
	public void queElUsuarioSeEncuentraEnLaPaginaInicialDelBuscadorDeGoogle() {
		actor.can(BrowseTheWeb.with(navegador));
		actor.wasAbleTo(Open.browserOn(page));
	}

	@When("^consulta el tema (.*)$")
	public void consultaElTemaDeseado(String temaconsultado) {
	actor.wasAbleTo(Consultatema.Temadeseado("automatizacion"));
	}

	@Then("^puede visualizar los resultados de la busqueda$")
	public void puedeVisualizarLosResultadosDeLaBusqueda() {
	
	}



}
