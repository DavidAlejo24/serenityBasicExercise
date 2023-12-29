#language: es
#Author: david3505@hotmail.com
Característica: Comprar productos en Opercart

  Como usuario invitado en Opercart
  Quiero comprar los productos
  Para validar el correcto funcionamiento del flujo de Compra

  @basicTest
  Escenario: Probar movimiento
    Dado el accede al sistema
    Cuando el busca los productos y los compra con los datos "david", "Cruz", "test@nttdata.com", "0999999999", "NTT DATA", "Quito", "Quito Sur", "Quito", "+593"
    Entonces el valida y confirma la compra