public class Main {
    public static void main(String[] args) {

    }
}

interface Vehiculo {
    void acelerar(int cuantaVelocidad);
    void frenar(int cuantaVelocidad);
}

class Coche implements Vehiculo { // implements es la palabra que se utiliza para implementar una interface en una clase
    public void acelerar (int cuataVelocidad) {

    }
    public void frenar (int cuantaVelocidad) {

    }
}

// Todas las clases derrivadas de la interface Vehiculo están obligadas a implementar los métodos de la interface