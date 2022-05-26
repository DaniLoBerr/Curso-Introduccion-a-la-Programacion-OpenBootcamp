public class Main {
    public static void main(String[] args) {
        double temperatura = 15.9;
        int temperaturaInt = (int)temperatura; // Aqui estamos haciendo la conversión de tipo, estamos forzando a la variable tipo double a que se convierta en una tipo int
        imprimeTemperatura(temperaturaInt);    // Lo que se hace es crear una variable nueva que contenga la variable anterior convertida.
    }

    public static void imprimeTemperatura (int valor) { // Una solución a este error es cambiar el tipo de dato que pide la función, pedir un double en vez de un int.
        System.out.println(valor);
    }
}