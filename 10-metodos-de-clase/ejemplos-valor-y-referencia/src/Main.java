public class Main {
    public static void main(String[] args) {
        int valA = 5; // int = 32 bits, = 4 bytes
        int valB = 10; // int = 32 bits, = 4 bytes

        int resultado = suma(valA, valB);

        System.out.println(valA);
        System.out.println(valB);
        System.out.println(resultado);

        Coche coche = new Coche (); // Ejemplo de puntero, con la instancia lo que hacemos es crear por debajo un puntero a esta zona de la memoria del tipo coche y vamos a acceder a ella a través de la variable coche.
        cocheChanger(coche); // Le paso como referencia un objeto. Le aplico el método cocheChanger directamente al valor original que se encuentre en la variable coche.

        System.out.println(coche.velocidad); // Aquí vemos como se imprime en pantalla el valor original modificado de velocidad de la clase coche tras la ejecución del método.

        factorial(8);
    }

    public static int suma (int a, int b) {
        return a+b;
    }

    public static void cocheChanger (Coche coche) { // Ejemplo de paso por referencia, a esta función le estamos dando como parámetro un objeto poruqe lo que realmente le estamos pasando es la referencia del objeto
        coche.velocidad = coche.velocidad + 50; // coche.velocidad += 50; es la expresión corta
        // Aquí estamos cogiendo el valor velocidad original de la clase coche y le estamos sumando 50.
    }

    public static int factorial (int numero) { // Ejemplo de recursividad.
        int resultado; // Se crea una variable resultado.
        if (numero == 1) { // Se establece la estructura de control
            return 1;
        }
        resultado = factorial(numero - 1)* numero; // Si no se cumple la estructura de control, la función se vuelve a invocar a si misma.
        return resultado; // se devuleve el resultado.

        // Esto ocurre hasta que se cumple la primera condición, que número es igual a 1 y entonces empieza a devolver unos hasta que la función finaliza. A esto se le llama propagar
        // Ni puta idea de esto de la recursividad y el factorial hermano.
    }

    public static int factorialNR (int numero) { // Ejemplo de factorial no recursivo, lo mismo pero de otra forma. Hay veces que espreferible hacerlo de una manera o de otra
        int temp;
        int resultado = 1;

        for (temp = 1; temp <= numero; temp++) {
            resultado = resultado * temp;
        }
        return resultado;
    }

    public static void sumaRecursiva (int a, int b) { // Otro ejemplo de recursividad pero con una suma
        var temp = a+b;
        System.out.println ("A vale" + a + "b vale" + b + "temp vale" + temp);
        if (b>=30) { // Importante la sentencia de control para detener el bucle
            return;
        }
    }
}

interface Vehiculo {
    void acelerar (int cuantaVelocidad);
    void frenar (int cuantaVelocidad);
}

class Coche implements Vehiculo {
    int velocidad = 0;
    public void acelerar (int cuantaVelocidad) {
        System.out.println("Coche() -> acelerar");
    }
    public void frenar (int cuantaVelocidad) {
        System.out.println("Coche() -> frenar");
    }
}

class Moto implements Vehiculo {
    public void acelerar(int cuantaVelocidad) {
        System.out.println("Moto() -> acelerar");
    }

    public void frenar(int cuantaVelocidad) {
        System.out.println("Moto() -> frenar");
    }
}