# CVDS
## LABORATORIO 3 - PBT - 2021-2
## CLASES DE EQUIVALENCIA

### CREAR UN PROYECTO CON MAVEN
En el directorio de trabajo ejecutar el comando necesario para crear un proyecto maven, basado en un arquetipo: <br>
* Grupo: edu.eci.cvds
* Artefacto: ClasesEquivalencia
* Paquete: edu.eci.cvds.tdd
* archetypeArtifactId: maven-archetype-quickstart

![image](https://user-images.githubusercontent.com/54339107/131944387-713d8513-426e-416f-9b43-6097f1d786b6.png)

## Actualizar y crear dependencias en el proyecto

* Busque en internet el repositorio central de maven.
*Busque el artefacto JUnit y entre a la versión más nueva
*Ingrese a la pestaña de Maven y haga click en el texto de la dependencia para copiarlo al portapapeles.
Edite el archivo pom.xml y realice las siguientes actualizaciones:
*Agregue la dependencia copiada a la sección de dependencias.
*Hay que cambiar la versión del compilador de Java a la versión 8, para ello, agregue la sección properties antes de la sección de dependencias:
~~~
    <properties>
        <maven.compiler.target>1.8</maven.compiler.target>
        <maven.compiler.source>1.8</maven.compiler.source>
    </properties>
~~~
**antes:** <br>
![image](https://user-images.githubusercontent.com/54339107/131945152-70da545a-cb69-4e65-875a-3365a4e2cb90.png)<br>
**despúes:**<br>
![image](https://user-images.githubusercontent.com/54339107/131945602-0c977d69-96da-485d-8d7d-4672cc7af3c9.png)

## COMPILAR Y EJECUTAR

* Ejecute los comandos necesarios de Maven, para compilar el proyecto y verificar que el proyecto se creó correctamente y los cambios realizados al archivo pom no generan inconvenientes.

* Busque el comando requerido para ejecutar las pruebas unitarias de un proyecto desde Maven y ejecútelo sobre el proyecto. Se debe ejecutar la clase AppTest con resultado exitoso.

![image](https://user-images.githubusercontent.com/54339107/131946130-0c56b702-f57f-4583-99eb-96442d8b212b.png)

## EJERCICIO “REGISTRADURÍA”

Se va a crear un proyecto base para un requerimiento de la registraduría en el cual se registrarán personas con intención de votar paras las próximas elecciones y se generarán los certificados electorales de aquellas personas cuyo voto sea válido.

Se usará la clase de persona que ya fue creada. El servicio de la registradiría permitirá registrar personas que sean votantes

## PROPIEDADES
* Solo se registrarán votantes válidos
* Solo se permite una inscripción por número de documento

## HACER EL ESQUELETO DE LA APLICACION

Cree el archivo RegisterResult.java en el directorio edu.eci.cvds.tdd.registry con la enumeración: <br>
~~~
package edu.eci.cvds.tdd.registry;

public enum RegisterResult {
        DEAD, UNDERAGE, INVALID_AGE, VALID, DUPLICATED
}
~~~
