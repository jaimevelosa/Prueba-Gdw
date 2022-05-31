package tasks;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static userusrinterfases.GooglePage.*;
public class Consultatema implements Task {
private String Temaconsultado;

public Consultatema(String Temaconsultado) {
	this.Temaconsultado=Temaconsultado;
}
	public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(
		Enter.theValue(Temaconsultado).into(INPUT_CONSULTA),
		Click.on(INPUT_BOTON)
		);

		
	}
public static Consultatema Temadeseado(String Temaconsultado) {
	return instrumented(Consultatema.class, Temaconsultado);
}
}
