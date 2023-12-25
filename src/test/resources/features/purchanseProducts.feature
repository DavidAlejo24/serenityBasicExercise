#language: es
#Author: david3505@hotmail.com
Característica: Comprar productos en Opercart

  Como usuario invitado en Opercart
  Quiero comprar los productos
  Para validar el correcto funcionamiento del flujo de Compra

  @basicTest
  Escenario: Probar movimiento
    Dado el accede al sistema
    Cuando el busca los productos y los agrega al carrito
    Y el ingresa su información "david", "Cruz", "test@nttdata.com", "0999999999", "NTT DATA", "Quito", "Quito Sur", "Quito", "+593" para validar la compra como INVITADO
    Entonces el valida y confirma la compra
