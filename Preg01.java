import java.util.Scanner;

public class Preg01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DATOS DE ENTRADA: ");
        System.out.print("A: ");
        int numero1 = scanner.nextInt();

        System.out.print("B: ");
        int numero2 = scanner.nextInt();

        // Intercambio de los números
        int temp = numero1;
        numero1 = numero2;
        numero2 = temp;

        System.out.println("DATOS DE SALIDA: ");
        System.out.println("A: " + numero1);
        System.out.println("B: " + numero2);

        scanner.close();
    }
}