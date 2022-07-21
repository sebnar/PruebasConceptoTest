package co.com.pruebasconcepto.tasks.transversal;

import co.com.pruebasconcepto.userinterface.Index;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirLa implements Task {

    private Index index;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(index));
    }

    public static AbrirLa pagina() {
        return Tasks.instrumented(AbrirLa.class);
    }
}
