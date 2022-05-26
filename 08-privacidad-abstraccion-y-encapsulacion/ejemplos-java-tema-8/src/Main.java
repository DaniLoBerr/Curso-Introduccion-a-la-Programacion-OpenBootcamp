public class Main {
    public static void main(String[] args) {
        Vehiculo coche = new Vehiculo(); // Clase instanciada, creación de objeto
        coche.setTipo("Monovolumen"); // Nombre de la variable del objeto.método setter de la propiedad de la clase = valor que le queremos dar a la propiedad
        System.out.println(coche.getTipo()); // Imprimimos en pantalla en la variable del objeto.el valor del getter de la propiedad de la clase.
        coche.setTipo("Biplaza");
        String tipo = coche.getTipo();
        System.out.println(tipo); // Lo mismo pero hecho en dos pasos
        coche.setRapido(true);
        System.out.println("¿Es rápido el coche? " + coche.isRapido());

        Vehiculo moto = new Vehiculo(); // Otro objeto de la misma clase
        moto.setTipo ("Scooter");
        moto.setVelocidadMaxima (50);
        System.out.println("La velocidad máxima de los " + moto.getTipo() + " es de " + moto.getVelocidadMaxima());
        moto.setRapido(false);
        System.out.println("¿Es rápida la moto? " + moto.isRapido());

    }
}

class Vehiculo { // Clase vehículo
    private String tipo; // Propiedad privada de la clase
    public void setTipo (String tipo) { // Método para establecer el valor de la propiedad cuando se invoca a la función
        this.tipo = tipo; // El valor de la propiedad de la clase = El valor del parámetro de la función
    }
    // El tipo de dato que acepta el parámetro del setter debe ser igual que el de la propiedad de la clase
    // El setter es tipo void porque no devuelve nada
    public String getTipo () { // Método para devolver el valor de la propiedad cuando se invoca a la fucnción
        return this.tipo; // Devuelve el valor de la propiedad de esta clase.
    }
    // El tipo de dato que devuleve la función getter debe ser igual que el tipo de dato de la propiedad de la clase.

    private int velocidadMaxima;
    private int estado; // Ejemplo de propiedad privada que no hace falta encapsular porque solo la vamos a utilizar dentro de la clase
    public void setVelocidadMaxima (int velocidadMaxima) {
        if (this.estado == 0) { // Ejemplo de propiedad que solo se utiliza dentro de la clase
            this.velocidadMaxima = velocidadMaxima;
        }
    }
    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    private boolean rapido; // Caso especial de los getters/setters en los tipos de dato booleanos.
    public void setRapido (boolean rapido) { // la función setter es exactamente igual
        this.rapido = rapido;
    }
    public boolean isRapido() { // pero la función getter, en vez de llamarla "getRapido" se debe llamar "isRapido"
        return this.rapido;
    }
}

abstract class instrumentoMusical { //Ejemplo de clase abstracta
    private String tipo;
    public void setTipo (String tipo) { //Ejemplos de métodos normales, funciones comúnes para todos los objetos de la clase
        this.tipo = tipo;
    }
    public String getTipo () {
        return this.tipo;
    }
    private String sonido;
    abstract public void setSonido (String sonido); //Ejemplos de métodos abstractos
    abstract public String getSonido(); //NO tienen cuerpo, son prototipos que utilizaremos en la nueva clase derivada de esta


}
