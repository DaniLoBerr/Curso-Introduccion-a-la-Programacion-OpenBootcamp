// Para practicar la encapsulación:
//
//Crear clase Persona.
//Crear variables las privadas edad, nombre y telefono de la clase Persona.
//Crear gets y sets de cada propiedad.
//Crear un objeto persona en el main.
//Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.

public class Main {
    public static void main(String[] args) {
        // Objeto de la clase persona
        Persona persona = new Persona();
        // Valor de la edad de la persona e impresión de la misma
        persona.setEdad(29);
        System.out.println("La edad de la persona es: " + persona.getEdad());
        // Valor del nombre de la persona e impresión del mismo
        persona.setNombre("Daniel");
        System.out.println("El nombre de la persona es: " + persona.getNombre());
        // Valor del teléfono de la persona e impresión del mismo
        persona.setTelefono(666666666);
        System.out.println("El teléfono de la persona es: " + persona.getTelefono());
    }
}
// Clase persona
class Persona {
    // Propiedad de edad de la clase persona y métodos setters y getters de esta propiedad
    private int edad;
    public void setEdad (int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }
    // Propiedad de nombre de la clase persona y métodos setters y getters de esta propiedad
    private String nombre;
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    // Propiedad de teléfono de la clase persona y métodos setters y getters de esta propiedad
    private int telefono;
    public void setTelefono (int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return this.telefono;
    }
}