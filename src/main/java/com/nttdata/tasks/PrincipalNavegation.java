package com.nttdata.tasks;

import com.nttdata.userInterfaces.OpenCarlHomePageUi;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class PrincipalNavegation {
    public static Performable about(String searchTerm) {
        return Task.where("{0} searches for '" + searchTerm + "'",
                Enter.theValue(searchTerm)
                        .into(OpenCarlHomePageUi.SEARCH_FIELD)
                        .thenHit(Keys.ENTER)
        );
    }

    public static Performable selectProducts() {
        return Task.where("{0} interactua con los productos a comprar",
                WaitUntil.the(OpenCarlHomePageUi.IPHONE_LOCATOR, isVisible()).forNoMoreThan(3).seconds(),
                Scroll.to(OpenCarlHomePageUi.IPHONE_LOCATOR),
                Click.on(OpenCarlHomePageUi.IPHONE_ADDTOCAR),
                Scroll.to(OpenCarlHomePageUi.TABLETS_NAVBAR),
                Click.on(OpenCarlHomePageUi.TABLETS_NAVBAR),
                WaitUntil.the(OpenCarlHomePageUi.TABLET_LOCATOR, isVisible()).forNoMoreThan(2).seconds(),
                Scroll.to(OpenCarlHomePageUi.TABLET_SAMSUNG_ADDTOCAR),
                Click.on(OpenCarlHomePageUi.TABLET_SAMSUNG_ADDTOCAR)
        );
    }

    public static Performable goToValidationCar() {
        return Task.where("{0} navega para el checkout através del boton CARRITO",
                Scroll.to(OpenCarlHomePageUi.CKECKOUT_BUTTONPRINCIPAL),
                Click.on(OpenCarlHomePageUi.CKECKOUT_BUTTONPRINCIPAL),
                WaitUntil.the(OpenCarlHomePageUi.OPTION_GUEST, isVisible()).forNoMoreThan(3).seconds(),
                Click.on(OpenCarlHomePageUi.OPTION_GUEST),
                Click.on(OpenCarlHomePageUi.OPTION_CONTINUE),
                WaitUntil.the(OpenCarlHomePageUi.FIRSTNAME_INPUT, isVisible()).forNoMoreThan(3).seconds()
        );
    }

    public static Performable enterInformationToValidatePurchanse(String nombre, String apellido, String correo,
                                                                  String telefono, String empresa, String direccion1,
                                                                  String direccion2, String ciudad, String codigoPostal) {
        return Task.where("{0} ingresa información para confirmar compra",
                Enter.theValue(nombre).into(OpenCarlHomePageUi.FIRSTNAME_INPUT).thenHit(Keys.TAB),
                Enter.theValue(apellido).into(OpenCarlHomePageUi.LASTNAME_INPUT).thenHit(Keys.TAB),
                Enter.theValue(correo).into(OpenCarlHomePageUi.EMAIL_INPUT).thenHit(Keys.TAB),
                Enter.theValue(telefono).into(OpenCarlHomePageUi.TELEPHONE_INPUT).thenHit(Keys.TAB),
                Enter.theValue(empresa).into(OpenCarlHomePageUi.COMPANY_INPUT).thenHit(Keys.TAB),
                Enter.theValue(direccion1).into(OpenCarlHomePageUi.ADDRESS1_INPUT).thenHit(Keys.TAB),
                Enter.theValue(direccion2).into(OpenCarlHomePageUi.ADDRESS2_INPUT).thenHit(Keys.TAB),
                Enter.theValue(ciudad).into(OpenCarlHomePageUi.CITY_INPUT).thenHit(Keys.TAB),
                Enter.theValue(codigoPostal).into(OpenCarlHomePageUi.POSTCODE_INPUT).thenHit(Keys.TAB),
                SelectFromOptions.byVisibleText("Ecuador").from(OpenCarlHomePageUi.COUNTRY_SELECT),
                SelectFromOptions.byVisibleText("Pichincha").from(OpenCarlHomePageUi.REGION_SELECT),
                Click.on(OpenCarlHomePageUi.CONTINUE_BUTTON_PERDATA)

        );
    }

    public static Performable validateAndConfirmPurchanse() {
        return Task.where("{0} valida y confirma la compra",
                Enter.theValue("any comment to test").into(OpenCarlHomePageUi.TEXTAREA_COMMENT),
                Click.on(OpenCarlHomePageUi.CONTINUE_BUTTON_COMMENT),
                SetCheckbox.of(OpenCarlHomePageUi.CHECKBOX_AGREE).toTrue(),
                Click.on(OpenCarlHomePageUi.BTN_CONTINUE_AGREE),
                Scroll.to(OpenCarlHomePageUi.BTN_CONFIRM_ORDER),
                Click.on(OpenCarlHomePageUi.BTN_CONFIRM_ORDER)
        );
    }
}
