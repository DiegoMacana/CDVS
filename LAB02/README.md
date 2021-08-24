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
~~~
/**
 * Hello world!
 *
 */
public class App 
{
	private String nombre;
	
	public  Saludo() {
		nombre= "Hello World!";
	}
	
    public  Saludo( String nombre ) 
    {
    	this.nombre="Hello"+ nombre;
    }
    
    public String getNombre() {
    	return nombre;
    }
    public static void main( String[] args )
    {
    	Saludo saludo=new Saludo();
    	System.out.println(saludo.getNombre());
    }        
}
~~~
+ Buscar cómo enviar parámetros al plugin "exec".
~~~
mvn exec:exec -Dexec.executable="maven" [-Dexec.workingdir="/tmp"] -Dexec.args="-X myproject:dist"
~~~
* Ejecutar nuevamente la clase desde línea de comandos y verificar la salida: Hello World!

* Ejecutar la clase desde línea de comandos enviando su nombre como parámetro y verificar la salida. Ej: Hello Pepito!
* Ejecutar la clase con su nombre y apellido como parámetro. ¿Qué sucedió?
* Verifique cómo enviar los parámetros de forma "compuesta" para que el saludo se realice con nombre y apellido.
* Ejecutar nuevamente y verificar la salida en consola. Ej: Hello Pepito Perez!


