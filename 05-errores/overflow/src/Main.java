public class Main {
    public static void main(String[] args) {
        byte numero = 127; // Un byte solo puede ocupar en la memoria unos valores entre -128 y 127
        System.out.println(numero);

        numero += 5; // Si nos intentamos superar este valor, incurriremos en overflow.
        System.out.println(numero); // El valor que se guardará en la memoria acabará en el 127 y empezará a contar de nuevo desde el -128.

    }
}