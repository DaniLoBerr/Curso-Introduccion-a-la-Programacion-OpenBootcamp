public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche(); // Creamos un objeto de la clase Coche
        Moto moto = new Moto(); // Creamos un objeto de la clase Moto
        ejecutaAcelerar(coche); // Y aquí estamos llamando a la función ejecutaAcelerar y le damos como parámetro el nombre del objeto de una clase que implemente la interface vehiculo, en este caso coche
        ejecutaAcelerar(moto); //
    }

    public static void ejecutaAcelerar (Vehiculo vehiculo) { // Le ponemos un parámetro vehiculo de tipo Vehiculo, es decir, del tipo de la interface. Con esto le exigimos a la función que el parámetro sea una clase que implemente esa interface
        vehiculo.acelerar(15); // Aquí dentro ejecuto el método acelerar de vehiculo porque sé que cualquier objeto que me pasen como parámetro de la función está obligado a implementar todos los métodos de la interface Vehiculo
    }
}

interface Vehiculo {
    void acelerar (int cuantaVelocidad);
    void frenar (int cuantaVelocidad);
}

class Coche implements Vehiculo {
    public void acelerar (int cuantaVelocidad) {
        System.out.println("Coche() -> acelerar");
    }
    public void frenar (int cuantaVelocidad) {
        System.out.println("Coche() -> frenar");
    }
}

class Moto implements Vehiculo {
    public void acelerar (int cuantaVelocidad) {
        System.out.println("Moto() -> acelerar");
    }
    public void frenar (int cuantaVelocidad) {
        System.out.println("Moto() -> frenar");
    }
}