public class Main {
    public static void main(String[] args) {
        Coupe micoupe = new Coupe();
        micoupe.setNumeroDePuertas(3);
        System.out.println(micoupe.getNumeroDePuertas() + " son las puertas de mi Coupé");
        micoupe.velocidadMaxima = 120;
        System.out.println(micoupe.velocidadMaxima + " es la velocidad máxima de mi Coupé");
        // Variables y funciones que llamo de clases madres desde clases hijas

    }
}

class Vehiculo {
    int velocidadMaxima;
    String tipoGasolina;

    public void diHola () {
        System.out.println("Hola");
    }
}

class Coche extends Vehiculo { // extends es el término que se utiliza para crear una subclase
    private int numeroDePuertas;

    public void setNumeroDePuertas (int puertas) {
        this.numeroDePuertas = puertas;
    }
    public int getNumeroDePuertas () {
        return this.numeroDePuertas;
    }
}

final class Coupe extends Coche { // El final significa que no se puede heredar de esta clase

}