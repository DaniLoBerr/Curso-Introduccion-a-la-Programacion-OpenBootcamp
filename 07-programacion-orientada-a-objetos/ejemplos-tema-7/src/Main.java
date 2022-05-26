public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche(); //Esto es un objeto. Partes: Nombre de la clase + nombre de la variable = new tipo de clase
        System.out.println(coche.velocidadActual);
        coche.acelerar(); // Invocación de un método de la clase (se llama a la función)
        System.out.println(coche.velocidadActual);

        Coche coche2 = new Coche();
        System.out.printf("Puertas: %d\n", coche.numeroDePuertas); // De esto no tengo ni puta idea
        System.out.println(coche2.velocidadActual);

        Coche coche3 = new Coche();
        System.out.println(coche3.numeroDePuertas);
        System.out.println(coche3.velocidadActual);
        System.out.println(coche3.velocidadMaxima);


        Coche coche4 = new Coche(3, 90);
        System.out.println(coche4.numeroDePuertas);
        System.out.println(coche4.velocidadActual);
        System.out.println(coche4.velocidadMaxima);


    }
}
class Coche { //Esto es una clase
    int numeroDePuertas; //Esto son las propiedades de la clase
    int velocidadMaxima;
    float velocidadActual;

    public Coche(){
        // Esto es un constructor.
        numeroDePuertas = 5; // Esto hace que los objetos que se creen a partir de este constructor tendrán esta propiedad
        velocidadMaxima = 120;
        System.out.println("Constructor sin parámetros");
    }

    public Coche (int numeroDePuertas, int velocidadMaxima){
        // Estro es otro constructor dentro de una misma clase.
        // Ambos constructores crearán objetos con las mismas propiedades y métodos de la clase que comparten y los objetos instanciados tendrán la misma sintaxis.
        // La diferencia en este caso será que cuando se instancie un objeto sin darle parámetros, invocará a un constructor, y si se le da parámetros invocará al otro.
        this.numeroDePuertas = numeroDePuertas; // En este caso, queremos que los valores que le indicamos a los parámetros afecten a las propiedades de la clase.
        this.velocidadMaxima = velocidadMaxima;// Para ello le damos el mismo nombre a ambas variables y le ponemos el this a la variable que haga referencia a las variables de la clase.
        System.out.println("Constructor con parámetros");
    }

    public void acelerar(){ //Esto son los métodos de la clase
        velocidadActual +=15; // Expresión corta para sumar el valor 15 a una variable
    }
    public void decelerar(){}

    // No solo se puede sobrecargar el constructor, en este ejemplo final estaríamos sobrecargando el tipo de dato de una misma función
    public int consumo (int consumo1, int consumo2) {return consumo2-consumo1}
    public float consumo (float consumo1, float consumo2) {return consumo2-consumo1}
}