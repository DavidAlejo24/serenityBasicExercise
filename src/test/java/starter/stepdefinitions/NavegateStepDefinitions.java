package starter.stepdefinitions;

import com.nttdata.utils.DatosParametrizados;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.nttdata.tasks.NavigateTo;
import com.nttdata.tasks.PrincipalNavegation;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class NavegateStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("{actor} accede al sistema")
    public void accede_al_sistema(Actor actor) {
        actor.wasAbleTo(NavigateTo.accedeAlSistema());
    }

    @Given("{actor} go to the system")
    public void go_to_the_system(Actor actor) {
        accede_al_sistema(actor);
    }


    @When("{actor} busca los productos y los compra con los datos {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void busca_productos_y_agrega_a_carrito(Actor actor,String nombre, String apellido, String correo,
                                                   String telefono, String empresa, String direccion1,
                                                   String direccion2, String ciudad, String codigoPostal) {
        actor.attemptsTo(
                PrincipalNavegation.selectProducts(),
                PrincipalNavegation.goToValidationCar(),
                PrincipalNavegation.enterInformationToValidatePurchanse(nombre, apellido, correo, telefono, empresa, direccion1,direccion2, ciudad, codigoPostal)

        );
    }

    @When("{actor} busca los productos y compra con los datos del archivo JSON")
    public void buscar_productos_compra_con_los_datos_del_archivo_csv(Actor actor) throws IOException, ParseException {
        JSONObject js = DatosParametrizados.leerJson();
        actor.attemptsTo(
                PrincipalNavegation.selectProducts(),
                PrincipalNavegation.goToValidationCar(),
                PrincipalNavegation.enterInformationToValidatePurchanse((String) js.get("nombre"),(String)js.get("apellido") , (String)js.get("correo"), (String) js.get("telefono"), (String) js.get("empresa"), (String) js.get("direccion1"), (String) js.get("direccion2"), (String) js.get("ciudad"), (String) js.get("codigoPostal"))

        );
    }

    @When("{actor} search the products and buy with the JSON file data")
    public void search_the_productos_and_buy_with_file_data(Actor actor) throws IOException, ParseException {
       buscar_productos_compra_con_los_datos_del_archivo_csv(actor);
    }


    @When("{actor} search the products and buy  with the data {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void search_products_and_buy_with_data(Actor actor,String nombre, String apellido, String correo,
                                                   String telefono, String empresa, String direccion1,
                                                   String direccion2, String ciudad, String codigoPostal) {
       busca_productos_y_agrega_a_carrito(actor,nombre,apellido,correo,telefono,empresa,direccion1,direccion2,ciudad,codigoPostal);
    }

    @And("{actor} ingresa su información {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} para validar la compra como INVITADO")
    public void ingresa_informacion_para_validar_compra_como_invitado(Actor actor, String nombre, String apellido, String correo,
                                                                      String telefono, String empresa, String direccion1,
                                                                      String direccion2, String ciudad, String codigoPostal) {
        actor.attemptsTo(
                PrincipalNavegation.selectProducts(),
                PrincipalNavegation.goToValidationCar(),
                PrincipalNavegation.enterInformationToValidatePurchanse(nombre, apellido, correo, telefono, empresa, direccion1,direccion2, ciudad, codigoPostal)


        );
    }

    @Then("{actor} valida y confirma la compra")
    public void should_see_information_about(Actor actor) {
        actor.attemptsTo(
                PrincipalNavegation.validateAndConfirmPurchanse()
        );
    }

    @Then("{actor} validate information and purchase")
    public void validate_information_and_purchase(Actor actor) {
        should_see_information_about(actor);
    }
}
