public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.Acelerar(10);

        var resultado = suma (5, 7);
        System.out.println (resultado);
    }
    public static int suma (int a, int b) {
        return a+b;
    }

}

interface Vehiculo {
    void Acelerar (int cuantaVelocidad);
    void Frenar (int cuantaVelocidad);
}

class Coche implements Vehiculo {
    public void Acelerar (int cuantaVelocidad) {

    }
    public void Frenar (int cuantaVelocidad) {

    }
}