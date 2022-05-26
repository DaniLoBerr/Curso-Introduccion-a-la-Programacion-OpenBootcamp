// Ejemplo condicionales de selección de Java
public class Main {
    public static void main(String[] args) {
        String estacion = "verano";
        int temperatura = 21;
        int contador = 25;
        int asignaturas = 25;
        int fila = 15;
        int valores[] = new int[5];
        int posicionArray[]= {10, 20, 30, 40, 50};
        String hoy_es = "domingo";

        if (estacion == "invierno") {
            System.out.println ("Estamos en la estación de invierno");
        } else if (estacion == "primavera" && (temperatura <= 19)) {
            System.out.println ("Estamos en la estación de primavera y hacen 19 ºC o menos");
        } else {
            System.out.println ("Vete a la playa" + " - " + "Ejemplo if/else if/else");
        }

        while (temperatura > 0) {
            System.out.println (temperatura + " - " + "Ejemplo while");
            temperatura = temperatura - 5; // Esta expresión sería equivalente a escribir 5 veces la orden " temperatura--; "
                                            // Otra expresión equivalente para esto sería escribir " temperatura-=5; "
        }

        while (contador > 0) {
            System.out.println (contador + " - " + "Ejemplo while con expresión corta");
            contador--;
            contador--;
            contador--;
            contador--;
            contador--;
            // Ejemplo con la expresión corta.

        }

        while (asignaturas > 0) {
            System.out.println (asignaturas + " - " + "Ejemplo while con expresión corta múltiple");
            asignaturas-=5;
            // Ejemplo con la otra expresión .

        }

        do {
            System.out.println(fila + " - " + "Ejemplo do while");
            fila = fila - 1;
        } while (fila > 10);

        for (int lista = 1; lista <= 10; lista = lista + 1) {
            System.out.println(lista + " - " + "Ejemplo for");
        }

        for (int i = 0; i < valores.length; i = i + 1) {
            // La variable i se suele utilizar par indicar la posición en la que nos encontramos dentro del bucle, es una convención
            // El valores.length nos indica cual es la longitud del array (propio de Java)
            System.out.println(valores[i] + " - Ejemplo de recorrido de un array con un for");
        }

        for (int i = 0; i < posicionArray.length; i = i + 1) {
            System.out.println (posicionArray[i] + " - Ejemplo de recorrido con un array con un for con valores");
        }

        switch (estacion) {
            case "verano":
                System.out.println("Es verano" + " - Ejemplo de bucle switch");
                break;
            case "invierno":
                System.out.println("Es invierno" + " - Ejemplo de bucle switch");
                break;
            default:
                System.out.println(estacion + " - Ejemplo de bucle switch");
        }

        switch (hoy_es) { // Ejemplo de switch en el que no es necesario escribir un break después de cada case.
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Hoy es un día laborable");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Hoy no es un día laborable");
        }
    }

}