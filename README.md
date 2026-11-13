# CIFRAS Y LETRAS

> Este proyecto ha sido realizado por Javier de la Cruz Montaña y Miguel Ángel Nevado Rey

## Estructura de carpetas

El trabajo ha sido realizado en diferentes archivos, los cuales son:

- `App.java`
- `Interfaz.java`
- `Logica.java`
- `Pruebas.java`

El output del compilado se generó en la carpeta `bin` por defecto.

## Estructura del código

Hemos organizado el proyecto en un total de 4 archivos, de los cuales cada uno tiene su propia función.
En `App.java` está lo que se ejecuta. Desde el `main`, se llaman a todas las funciones de los diferentes archivos para así poder ejecutarlo de forma más organizada y limpia.

Dentro de `Interfaz.java` se localiza toda la interfaz de los menús y los selectores de pruebas.

En el archivo `Logica.java` está escrita toda la lógica (mayormente las operaciones matemáticas).

Y en el archivo `Pruebas.java` es donde se localiza el código de todas y cada una de las pruebas.

## Expresiones y detalles importantes del código

A lo largo de toda la programación se hacen referencia a términos internos los cuales no se entenderían de forma clara a simple vista.
Dos de ellos (el más usado en todas las pruebas) son:

>P1: Hace referencia a todo lo relacionado con el jugador 1.
>P2: Hace referencia a todo lo relacionado con el jugador 2.

Algunos términos también son:

> sc: Hace referencia a la entrada de teclado con `SC`anner.

Algunas veces se hace uso de expreiones tales como P12, P23, P21, etc...
Todo eso hace uso de una nomenclatura que es la siguiente:

> P = PLAYER \ 1-2 = Numero del jugador \ 1-99 = Numero de la variable.