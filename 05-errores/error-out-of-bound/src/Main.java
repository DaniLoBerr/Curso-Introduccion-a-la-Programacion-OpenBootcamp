public class Main {
    public static void main(String[] args) {
        // Out of bounds (off-by-one)
        int array[] = new int [5]; // Este 5 quiere decir que el nuevo array consta de 5 elementos
        System.out.println(array[4]); // Aquí estamos diciendo la posición del array que queremos que se imprima
        //En informática, como se empieza a contar desde 0, la posición 5 no existe, el elemento 5 se encontraría en la cuarta posición.
    }
}