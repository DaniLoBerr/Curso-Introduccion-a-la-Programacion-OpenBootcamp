// En este ejercicio practicarás las estructuras de control, para ello deberás crear:
//
//Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
//Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
//
//Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
//
//Incrementar el valor de la variable en uno cada vez que se ejecute.
//
//Mostrarlo por pantalla cada vez que se ejecute.
//
//Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
//
//Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
//
//Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
public class Main {

    public static void main(String[] args) {
        int numeroIf = 0;
        int numeroWhile = 1;
        int numeroDoWhile = 2;
        String estacion = "verano";

        if (numeroIf > 0) {
            System.out.println("numeroIf es positivo");
        } else if (numeroIf < 0) {
            System.out.println("numeroIf es negativo");
        } else {
            System.out.println("numeroIf es igual a 0" + " - Ejemplo if/else if/else");
        }

        while (numeroWhile < 3) {
            numeroWhile = numeroWhile + 1; // Expresión corta sería: numeroWhile++;
            System.out.println(numeroWhile + " - Ejemplo while");
        }

        do {
            numeroDoWhile = numeroDoWhile + 1;
            System.out.println(numeroDoWhile + " - Ejemplo do while");
        } while (numeroDoWhile < 3);
        // En el ejercicio resuelto de la plataforma, ellos hacen que el número de la variable sea igual al de la comparación, entonces la sentencia realiza la acción con el do y luego compara. Al no cumplirse la condición, no se repite el bucle.

        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1) {
            System.out.println (numeroFor + " - Ejemplo for");
        }

        switch (estacion) {
            case "otoño":
            case "invierno":
            case "primavera":
            case "verano":
                System.out.println("Estamos en " + estacion + " - Ejemplo switch");
                break;
            default:
                System.out.println("El valor no se corresponde con una estación" + " - Ejemplo switch");
        }

        // En el ejercicio resuelto por la plataforma, en esto del switch te ponen el print debajo de cada case y un break debajo de cada uno, pero yo creo que no es necesario según te lo pone el enunciado.
    }
}