import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Preg03 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de horas: ");
        int horas = scanner.nextInt();

        double importe = calcularImporte(horas);
        
        // Mostrar el importe a pagar
        System.out.println("El importe a pagar es: S/." + importe + " soles");
        
        scanner.close();
    }
    
    public static double calcularImporte(int horas) {
        double costoBase = 6.00; // primeras 4 horas
        double costoExtraPorHora = 2.00; // hora adicional
        
        if (horas <= 4) {
            return costoBase;
        } else {
            // costo por las horas adicionales
            double horasExtras = horas - 4;
            return costoBase + (horasExtras * costoExtraPorHora);
        }
    }

}