# Ejercicio1Lab

## Descripción

Este proyecto implementa varias funciones útiles en Java, incluyendo:

1. Encontrar el número duplicado y el número faltante en un arreglo de enteros.
2. Encontrar el prefijo común más largo entre un conjunto de cadenas.
3. Convertir un número romano a su representación en entero.
4. Convertir un número entero a su representación en números romanos.

El programa incluye un menú interactivo que permite al usuario probar cada una de estas funciones ingresando datos desde la terminal.

---

## Funciones implementadas

### 1. Encontrar duplicado y faltante
**Método:** `encontrarDupYFal(int[] num)`

Este método recibe un arreglo de enteros donde un número aparece duplicado y otro falta. Devuelve un arreglo con el número duplicado y el número faltante.
**Ejemplo Duplicado:**
```java
int[] nums = {4, 3, 6, 2, 1, 1};
int[] resultado = encontrarDupYFal(nums);
// Resultado: [1, 5]
```

**Método:**`prefijoComún(String[] cadenas)`
Este método recibe un arreglo de cadenas y busca el prefijo cmun entre ellas. Devuelve el máximo prefijo común.
**Ejemplo de prefijo común:**
```java
String[] cadenas = {"haskell", "haste", "hash"};
String prefijo = prefijoComún(cadenas);
// Resultado: "has"
```
**Método:**`romanoAEntero(String s)`
Este método recibe un número romano en forma de String y nos devuelve su forma en número entero.Si no nos dan una cadena válida se lanza una excepción.
**Ejemplo de pasar un romano a entero**
```java
String romano = "XIV";
int entero = romanoAEntero(romano);
// Resultado: 14
```
**Método:**`enteroRomano(int entero)`
Este médoto recibe un número entero y nos devuelve su forma en número romano en forma de String. Si el número entero no está dentro de un parámetro aceptable nos mánda una excepción.
**Ejemplo de pasar un entero a romano**
```java
int numero = 14;
String romano = enteroRomano(numero);
// Resultado: "XIV"
```
---

**Cómo compilar y ejecutar**
**Requisitos previos**
Java Development Kit (JDK) 8 o superior.
Maven (opcional, si deseas usarlo para compilar y ejecutar).

**Compilación manual**
1.Navega al directorio donde se encuentran los archivos .java.
2.Compila los archivos con el siguiente comando:
```java
javac Ejercicio1Lab/*.java
```
3.Ejecuta el programa con:
```java
java Ejercicio1Lab.Main
```
**Compilación y ejecución con Maven**
1.Asegúrate de que el archivo pom.xml esté configurado correctamente.
2.Compila el proyecto con:
```java
mvn clean package
```
3.Ejecuta el archivo .jar generado en el directorio target:
```java
java -jar target/Ejercicio1Lab-1.0-SNAPSHOT.jar
```
**Uso del programa:**
Para utilizar el programa deberás de seleccionar alguna de las opciones que aparezcan enlistadas en la terminal después de haber compilado y ejecutado el programa.
Seleccione una opción:
1. Encontrar duplicado y faltante
2. Encontrar prefijo común
3. Convertir número romano a entero
4. Convertir número entero a romano
La entrada del usuario deberá de ser de este tipo:
Seleccione una opción:
1. Encontrar duplicado y faltante
Ingrese los números separados por espacios:
4 3 6 2 1 1

**Estructura del proyecto:**
   PrácticasMP/
    └── Ejercicio1Lab/
        ├── Ejercicio1.java
        ├── Main.java
        └── pom.xml

**AUTOR**
Michelle Alanis Navarro Fierro

Este archivo `README.md` proporciona toda la información necesaria para entender, compilar, ejecutar y usar el programa.
