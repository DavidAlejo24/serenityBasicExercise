package com.nttdata.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class OpenCarlHomePageUi {
    public static Target SEARCH_FIELD = Target.the("search field").locatedBy("#searchbox_input");
    public static Target IPHONE_LOCATOR = Target.the("Boton de IPhone").located(By.xpath("//div[@class='caption']//a[contains(text(),'iPhone')]"));

    public static Target IPHONE_ADDTOCAR = Target.the("Boton de Agregar al Carrito IPhone").locatedBy("//div[@class='caption']//a[contains(text(),'iPhone')]//ancestor::div[@class='caption']//following-sibling::div//button//span[contains(text(),'Add to Cart')]");
    public static Target TABLETS_NAVBAR = Target.the("Navbar Tablets").locatedBy("//li//a[contains(text(),'Tablets')]");
    public static Target TABLET_LOCATOR = Target.the("Boton de Tablet Samsung").located(By.xpath("//div[@class='caption']//a[contains(text(),'Samsung Galaxy Tab 10.1')]"));
    public static Target TABLET_SAMSUNG_ADDTOCAR = Target.the("Boton de Agregar al Carrito Tablet Samsung").located(By.xpath("//div[@class='caption']//a[contains(text(),'Samsung Galaxy Tab 10.1')]//ancestor::div[@class='caption']//following-sibling::div//button//span[contains(text(),'Add to Cart')]"));
    public static Target CAR_BUTTON = Target.the("Boton Principal CARRITO").located(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']"));
    public static Target CKECKOUT_BUTTON = Target.the("Boton Ckeckout CARRITO").located(By.xpath("//a//strong[contains(text(),'Checkout')]//parent::a"));
    public static Target CKECKOUT_BUTTONPRINCIPAL = Target.the("Boton Ckeckout CARRITO").located(By.xpath("//li//a//span[text()='Checkout']"));
    //public static Target OPTION_GUEST = Target.the("Boton Ckeckout de Invitado").located(By.xpath("//div//label//Input[@value='guest']"));
    //public static Target OPTION_GUEST = Target.the("Boton Ckeckout de Invitado").located(By.xpath("//div[@id='accordion']//div[@class='panel-body']//div[@class='radio']//child::input[@value='register']"));
    public static Target OPTION_GUEST = Target.the("Boton Ckeckout de Invitado").located(By.xpath("//*[@id='collapse-checkout-option']/div/div/div[1]/div[2]/label"));
    public static Target OPTION_CONTINUE = Target.the("Opción Continuar").located(By.xpath("//div//input[@id='button-account']"));
    public static Target FIRSTNAME_INPUT = Target.the("Input First Name").located(By.xpath("//input[@name='firstname']"));
    public static Target LASTNAME_INPUT = Target.the("Input Last Name").located(By.xpath("//input[@name='lastname']"));
    public static Target EMAIL_INPUT = Target.the("Input email Name").located(By.xpath("//fieldset//input[@name='email']"));
    public static Target TELEPHONE_INPUT = Target.the("Input telephone Name").located(By.xpath("//input[@name='telephone']"));
    public static Target COMPANY_INPUT = Target.the("Input Company Name").located(By.xpath("//input[@name='company']"));
    public static Target ADDRESS1_INPUT = Target.the("Input Address 1").located(By.xpath("//input[@name='address_1']"));
    public static Target ADDRESS2_INPUT = Target.the("Input Address 2").located(By.xpath("//input[@name='address_2']"));
    public static Target CITY_INPUT = Target.the("Input City").located(By.xpath("//input[@name='city']"));
    public static Target POSTCODE_INPUT = Target.the("Input Postcode").located(By.xpath("//input[@name='postcode']"));
    public static Target COUNTRY_SELECT = Target.the("Country Select").located(By.id("input-payment-country"));
    public static Target REGION_SELECT = Target.the("Region Select").located(By.id("input-payment-zone"));
    public static Target CONTINUE_BUTTON_PERDATA = Target.the("Input Postcode").located(By.xpath("//div[@class='buttons']//input[@value='Continue']"));
    public static Target CONTINUE_BUTTON_COMMENT = Target.the("Input Postcode").located(By.xpath("//div[@id='collapse-shipping-method']//input[@value='Continue']"));
    public static Target TEXTAREA_COMMENT = Target.the("TextArea Comment").located(By.xpath("//textarea[@name='comment']"));
    public static Target CHECKBOX_AGREE = Target.the("CheckBox Agree").located(By.xpath("//input[@name='agree']"));
    public static Target BTN_CONTINUE_AGREE = Target.the("Button Continue Agree").located(By.xpath("//div[@id='collapse-payment-method']//input[@value='Continue']"));
    public static Target BTN_CONFIRM_ORDER = Target.the("Button Confirm Order").located(By.xpath("//div[@id='collapse-checkout-confirm']//input[@value='Confirm Order']"));

}
