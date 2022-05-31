package runners;

import org.junit.runner.RunWith;
import cucumber.api.SnippetType;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/ejemplo.feature",
		glue ="stepdefinitions",
		tags ="@ejecucion2",
		snippets = SnippetType.CAMELCASE
		
		)

public class Ejerciciorunner {

}
