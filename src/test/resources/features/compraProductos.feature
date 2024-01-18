#language: es
#Author: david3505@hotmail.com
Característica: Comprar productos en Opercart

  Como usuario invitado en Opercart
  Quiero comprar los productos
  Para validar el correcto funcionamiento del flujo de Compra

  @basicTest
  Escenario: Probar la compra correcta de un par de productos con un escenario basico
    Dado el accede al sistema
    Cuando el busca los productos y los compra con los datos "david", "Cruz", "test@nttdata.com", "0999999999", "NTT DATA", "Quito", "Quito Sur", "Quito", "+593"
    Entonces el valida y confirma la compra


  @scenarioOutlineBasicTest
  Esquema del escenario: Probar la compra correcta de un par de productos con un esquema del escenario
    Dado el accede al sistema
    Cuando el busca los productos y los compra con los datos <nombre>, <apellido>, <correo>, <telefono>, <empresa>, <direccion1>, <direccion2>, <ciudad>, <codigoPostal>
    Entonces el valida y confirma la compra

  Ejemplos:
  | nombre      | apellido | correo               | telefono     | empresa   | direccion1 | direccion2    | ciudad  | codigoPostal |
  | "David" | "Cruz"   | "dcruz@nttdata.com" | "0999999999" | "NTTDATA" | "Quito"    | "Quito Sur" | "Quito" | "+593"       |
  | "Alejandro" | "Choez"   | "achoez@nttdata.com" | "0999999999" | "NTTDATA" | "Quito"    | "Quito Norte" | "Quito" | "+593"       |


  @ScearioWithCsvFileBasicTest
  Escenario: Probar la compra correcta de un par de productos con un archivo JSON
    Dado el accede al sistema
    Cuando  el busca los productos y compra con los datos del archivo JSON
    Entonces el valida y confirma la compra


