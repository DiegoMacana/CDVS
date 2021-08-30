# LAB02 
## EJERCICIO DE LAS FIGURAS 
## CREAR UN PROYECTO CON MAVEN 
1) Buscar cómo se crea un proyecto maven con ayuda de los arquetipos (archetypes). <br>
2) Busque cómo ejecutar desde línea de comandos el objetivo "generate" del plugin "archetype", con los siguientes parámetros:
* Grupo: edu.eci.cvds
* Id del Artefacto: Patterns
* Paquete: edu.eci.cvds.patterns
* archetypeArtifactId: maven-archetype-quickstart
A) **VERIFICAR LA INSTALACIÓN DE MAVEN**
![image](https://user-images.githubusercontent.com/54339107/130557623-07672f39-abbc-4a07-9f95-65f071935b86.png) <br>
B) **POSICIONARNOS EN EL DIRECTORIO QUE SE DESEA Y EJECUTAR EL COMANDO mvn archetype:generate**
![image](https://user-images.githubusercontent.com/54339107/130559364-70d254d6-d527-4436-9264-f097eead523c.png)
3) Se debió haber creado en el directorio, un nuevo proyecto Patterns a partir de un modelo o arquetipo, que crea un conjunto de directorios con un conjunto de archivos básicos. <br>
![image](https://user-images.githubusercontent.com/54339107/130559507-ce4a89af-cb5a-42a6-9a79-06403eba1151.png)
Cambie al directorio Patterns:<br>
Para ver el conjunto de archivos y directorios creados por el comando mvn ejecute el comando tree.<br>
![image](https://user-images.githubusercontent.com/54339107/130559680-505533a2-2cc4-4acd-8efa-de80823e8083.png) <br>
## AJUSTAR ALGUNAS CONFIGURACIONES EN EL PROYECTO
1) Edite el archivo pom.xml y realize la siguiente actualización:
2) Hay que cambiar la version del compilador de Java a la versión 8, para ello, agregue la sección properties antes de la sección de dependencias:
~~~
<properties>
        <maven.compiler.target>1.8</maven.compiler.target>
        <maven.compiler.source>1.8</maven.compiler.source>
    </properties>
~~~
![image](https://user-images.githubusercontent.com/54339107/130560589-9e5574a0-06db-485d-9273-f587f446bcc3.png)
## COMPILAR Y EJECUTAR
1) Para compilar ejecute el comando:
~~~
mvn package
~~~
![image](https://user-images.githubusercontent.com/54339107/130560627-5296213f-9b49-4b2d-9f60-84c5e5a6236c.png)

2) Busque cuál es el objetivo del parámetro "package" y qué otros parámetros se podrían enviar al comando mvn.
3) Busque cómo ejecutar desde línea de comandos, un proyecto maven y verifique la salida cuando se ejecuta con la clase App.java como parámetro en "mainClass".
4) Realice el cambio en la clase App.java para crear un saludo personalizado, basado en los parámetros de entrada a la aplicación. Utilizar la primera posición del parámetro que llega al método "main" para realizar el saludo personalizado, en caso que no sea posible, se debe mantener el saludo como se encuentra actualmente:
5) package edu.eci.cvds.patterns;
6) ![image](https://user-images.githubusercontent.com/54339107/131158106-e2af01a4-224f-4b22-a69e-50d5020ce72a.png)

~~~
package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App{
    public static void main(String[] args){
        if(String.join("",args)==""){
            System.out.println("Hello World!");
        }
        else{
            System.out.println("Hello "+String.join(" ",args)+"!");
        }
    }
}

~~~
+ Buscar cómo enviar parámetros al plugin "exec".
~~~
mvn exec:java
~~~
* Ejecutar nuevamente la clase desde línea de comandos y verificar la salida: Hello World!
* Ejecutar la clase desde línea de comandos enviando su nombre como parámetro y verificar la salida. Ej: Hello Pepito!
* Ejecutar la clase con su nombre y apellido como parámetro. ¿Qué sucedió?
* Verifique cómo enviar los parámetros de forma "compuesta" para que el saludo se realice con nombre y apellido.
* Ejecutar nuevamente y verificar la salida en consola. Ej: Hello Pepito Perez!
![image](https://user-images.githubusercontent.com/54339107/131159090-58de2d46-b8f4-488e-8574-48679e92909b.png)

---
# Parte 2



HACER EL ESQUELETO DE LA APLICACION
Cree el paquete edu.eci.cvds.patterns.shapes y el paquete edu.eci.cvds.patterns.shapes.concrete.
Cree una interfaz llamada Shape.java en el directorio src/main/java/edu/eci/cvds/patterns/shapes de la siguiente manera:
~~~
package edu.eci.cvds.patterns.shapes;

public interface Shape {
    public int getNumberOfEdges();
}
Cree una enumeración llamada RegularShapeType.java en el directorio src/main/java/edu/eci/cvds/patterns/shapes así:

package edu.eci.cvds.patterns.shapes;

public enum RegularShapeType {
    Triangle, Quadrilateral, Pentagon, Hexagon
}
~~~
En el directorio src/main/java/edu/eci/cvds/patterns/shapes/concrete cree las diferentes clases (Triangle, Quadrilateral, Pentagon, Hexagon), que implementen la interfaz creada y retornen el número correspondiente de vértices que tiene la figura. Siguiendo el ejemplo del triangulo:
~~~
package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Triangle implements Shape {
    public int getNumberOfEdges() {
        return 3;
    }
}
~~~
Cree el archivo ShapeMain.java en el directorio src/main/java/edu/eci/cvds/patterns/shapes con el metodo main:
~~~
package edu.eci.cvds.patterns.shapes;

public class ShapeMain {
    public static void main(String[] args) {
        if (args == null || args.length != 1) {
            System.err.println("Parameter of type RegularShapeType is required.");
            return;
        }
        try {

            RegularShapeType type = RegularShapeType.valueOf(args[0]);
            Shape shape = ShapeFactory.create(type);
            
            System.out.println(String.format("Successfully created a %s with %s sides.", type, shape.getNumberOfEdges()));

        } catch (IllegalArgumentException ex) {
            System.err.println("Parameter '" + args[0] + "' is not a valid RegularShapeType");
            return;
        }
    }
}
~~~
* Analice y asegúrese de entender cada una de las instrucciones que se encuentran en todas las clases que se crearon anteriormente.
* Cree el archivo ShapeFactory.java en el directorio src/main/java/edu/eci/cvds/patterns/shapes implementando el patrón fábrica, haciendo uso de la instrucción switch-case de Java y usando las enumeraciones.

* Ejecute múltiples veces la clase ShapeMain, usando el plugin exec de maven con los siguientes parámetros y verifique la salida en consola para cada una:

* Sin parámetros
* Parámetro: qwerty
* Parámetro: pentagon
* Parámetro Hexagon
* ¿Cuál(es) de las anteriores instrucciones se ejecutan y funcionan correctamente y por qué?

