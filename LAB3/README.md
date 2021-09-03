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

![image](https://user-images.githubusercontent.com/54339107/131944941-3ebbcf67-8211-4896-b313-f24886e2e276.png)

