public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.arrancada();
        Coche coche = new Coche();
        coche.arrancada();
        // Polimorfismo a nivel de métodos de clase

        Coupe coupe = new Coupe();
        System.out.println(coupe.sumaNumeros(10, 20) + " Ejemplo polimorfismo suma enteros");
        System.out.println(coupe.sumaNumeros(2.4, 3.5) + " Ejemplo polimorfismo suma doubles");
        // Polimorfismo a nivel de función
    }
}

class Vehiculo {
    int velocidadMaxima;

    public void arrancada() {
        System.out.println("genérica");
    }
}

class Coche extends Vehiculo {
    public void arrancada() {
        System.out.println("media");
    }
}

class Coupe extends Coche {
    public int sumaNumeros (int a, int b) {
        return a+b;
    }
    public double sumaNumeros (double a, double b) {
        return a+b;
    }
}