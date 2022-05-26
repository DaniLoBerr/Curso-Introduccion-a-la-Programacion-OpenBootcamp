public class Main {
    public static void main(String[] args) {
        int suma1;
        suma1 = suma(10, 10, 10);
        System.out.println(suma1);


        int resultadoSuma;
        resultadoSuma = suma (7, 6, 5);
        System.out.println(resultadoSuma);

        String resultadoDatos;
        resultadoDatos = datosDiferentes (105, 72, 36);
        System.out.println(resultadoDatos);

        resta(30, 15, 10);
        resta(50,10, 5);


        Coche miCoche = new Coche();

        miCoche.sumarPuertas();
        miCoche.sumarPuertas();
        System.out.println("El numero de puertas es: " + miCoche.numeroDePuertas);

        Titulos miTitulo = new Titulos();
        miTitulo.sumarTitulo();
        System.out.println("El número de mis títulos es: " + miTitulo.numeroDeTitulos);

    }

    public static int suma (int a, int b, int c) {
        return a + b + c;
    }
    public static String datosDiferentes (int h, int i, int j) {
        if (h == 105 && i == 72 && j ==36) {
            return "Dando ints, recibiendo Strings";
        } else {
            return "na pin";
        }

    }

    public static void resta(int d, int f, int g) {
        int resultadoResta;
        resultadoResta = d - f - g;
        System.out.println(resultadoResta);
    }


}

class Coche {
    public int numeroDePuertas = 4;

    public void sumarPuertas(){

        this.numeroDePuertas++;
    }
}

class Titulos {
    public int numeroDeTitulos = 1;

    public void sumarTitulo(){
        this.numeroDeTitulos = numeroDeTitulos + 1;
    }
}