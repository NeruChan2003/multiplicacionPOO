import java.util.Scanner;

public class MainMultiplicacion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int a = input.nextInt();

        System.out.println("Ingrese el segundo número:");
        int b = input.nextInt();

        // Crear una instancia de la clase mutlplicar
        Multiplicacion multiplicacion = new Multiplicacion();

        // Establecer los valores de a y b en la instancia de mutlplicar
        multiplicacion.setA(a);
        multiplicacion.setB(b);

        // Realizar la resta usando el método mutlplicar de la instancia de mutlplicar
        multiplicacion.multiplicar();

        // Obtener el resultado de la instancia de mutlplicar
        int r = multiplicacion.getR();

        // Mostrar la representación de la instancia de mutlplicar
        System.out.println(multiplicacion.toString());
    }
}