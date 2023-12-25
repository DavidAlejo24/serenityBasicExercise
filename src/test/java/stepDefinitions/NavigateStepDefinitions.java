package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import com.nttdata.tasks.NavigateTo;
import com.nttdata.tasks.PrincipalNavegation;

import static net.serenitybdd.screenplay.GivenWhenThen.when;

public class NavigateStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("{actor} accede al sistema")
    public void accede_al_sistema(Actor actor) {
        actor.wasAbleTo(NavigateTo.accedeAlSistema());
    }


    @When("{actor} busca los productos y los agrega al carrito")
    public void busca_productos_y_agrega_a_carrito(Actor actor) {
        actor.attemptsTo(
                PrincipalNavegation.selectProducts(),
                PrincipalNavegation.goToValidationCar()
                //PrincipalNavegation.enterInformationToValidatePurchanse()

        );
    }

    @And("{actor} ingresa su información {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} para validar la compra como INVITADO")
    public void ingresa_informacion_para_validar_compra_como_invitado(Actor actor, String nombre, String apellido, String correo,
                                                                      String telefono, String empresa, String direccion1,
                                                                      String direccion2, String ciudad, String codigoPostal) {
        actor.attemptsTo(
                PrincipalNavegation.enterInformationToValidatePurchanse(nombre, apellido, correo, telefono, empresa, direccion1,direccion2, ciudad, codigoPostal)


        );
    }

    @Then("{actor} valida y confirma la compra")
    public void should_see_information_about(Actor actor) {
        actor.attemptsTo(
                PrincipalNavegation.validateAndConfirmPurchanse()
        );
    }
}
