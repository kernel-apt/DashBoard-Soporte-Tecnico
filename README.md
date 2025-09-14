# DashBoard-Soporte-Tecnico
DashBoard para Soporte Tecnico Proyecto Final Construccion y Evolucion de Software

Aplicacion de escritorio desarrollada usando el framework JavaFX 25 
de Java, MySQL y SceneBuilder de Gluon. Requiere JDK +22.

Para linux requieres de la variable de entorno JAVA_HOME la cual tiene
que apuntar al fichero donde esta instalado el JDK.

JAVA_HOME=path/to/your/jdk/home
PATH=${JAVA_HOME}/bin:${PATH}

el proyecto usa una configuracion de ejecucion descrita en el archivo
launch.json dentro de la carptera oculta .vscode, ahi hay una referencia
a la variable de entorno JFX/lib la cual debes establecer en tu sistema
operativo, JFX apunta a la ubicacion donde se almacena el JDK de JavaFX.

JFX=path/to/your/javafxjdk/home
