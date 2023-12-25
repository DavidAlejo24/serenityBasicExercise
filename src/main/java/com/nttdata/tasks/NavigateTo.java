package com.nttdata.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable accedeAlSistema() {
        return Task.where("{0} abre la pagina principal",
                Open.browserOn().the(OpenCartGoHomePage.class));
    }
}
