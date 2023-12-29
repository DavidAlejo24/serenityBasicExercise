# Serenity BDD EJemplo Basico
El proyecto serenity-cucumber-start es una adaptación del framework de SerenityBDD,
considerando las especificiones del ejercicio requerido.

# Estructura basica del proyecto

  + main
	+ java
		+ com
			+ nttdata
				+ task
				+ userInterfaces
  + test
    + java                     
		+ stepsDefinitions
	
    + resources
      + features               

# Prerequisitos
Para ejecutar esta prueba E2E es necesario cumplir con los siguentes prerequisitos

	- JDK v17
	- Gradle v7.6
	- IntellIj (Ultima versión recomendado)

# Ejecución del Proyecto
Para correr el escenario y generar el informe debemos ejecutar el comando
- gradle clean test

 O a su vez par asolo ejecutar el escenario podemos compilar la clase CucumberTestSuite ubicado en:
- main/test/java/started/CucumberTestSuite.java

# Reporte Serenity

El informe se genera en la ruta serenity-cucumber-starter\target\serenity\index.html