package co.com.pruebasconcepto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@CucumberOptions(features = "src/test/resources/feature/PruebasConcepto.feature",
        glue = "co.com.pruebasconcepto.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
@RunWith(CucumberWithSerenity.class)
public class RunnerPruebaConcepto {
}
