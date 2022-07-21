package co.com.pruebasconcepto.stepdefinitions.transversal;

import co.com.pruebasconcepto.tasks.transversal.AbrirLa;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class IngresarStepDefinitions {
    @Before
    public void configuracionInicial() {
        setTheStage(new OnlineCast());
    }

    @Dado("^que ingreso al sitio web de pruebas$")
    public void que_ingreso_al_sitio_web_de_pruebas() {
        theActorCalled("Usuario").wasAbleTo(AbrirLa.pagina());
    }
}
