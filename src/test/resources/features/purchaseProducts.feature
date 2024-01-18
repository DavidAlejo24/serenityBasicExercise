#language: en
# Author: david3505@hotmail.com
Feature:  Purchase products on Opercart

  As a gues
  I need to purchase products
  So that I verify my personal information and confirm the purchase

  @basicTest
  Scenario: Test purchase products with a basic scenario
    Given el go to the system
    When el search the products and buy  with the data "david", "Cruz", "test@nttdata.com", "0999999999", "NTT DATA", "Quito", "Quito Sur", "Quito", "+593"
    Then el validate information and purchase


  @scenarioOutlineBasicTest
  Scenario Outline: Run Purchase Products with Scenario Outline
    Given el go to the system
    When el search the products and buy  with the data <nombre>, <apellido>, <correo>, <telefono>, <empresa>, <direccion1>, <direccion2>, <ciudad>, <codigoPostal>
    Then el validate information and purchase

  Examples:
    | nombre      | apellido | correo               | telefono     | empresa   | direccion1 | direccion2    | ciudad  | codigoPostal |
    | "David" | "Cruz"   | "dcruz@nttdata.com" | "0999999999" | "NTTDATA" | "Quito"    | "Quito Sur" | "Quito" | "+593"       |
    | "Alejandro" | "Choez"   | "achoez@nttdata.com" | "0999999999" | "NTTDATA" | "Quito"    | "Quito Norte" | "Quito" | "+593"       |


  @ScearioWithCsvFileBasicTest
  Scenario: Run Purchase Products with CSV file
    Given el go to the system
    When el search the products and buy with the JSON file data
    #When he search the products and buy with the CSV file data
    Then el validate information and purchase
