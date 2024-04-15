import java.util.Scanner;


public class Preg4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double ganancia, donacion;
        System.out.println("Ingrese la ganancia de Pablito: ");
        ganancia = entrada.nextDouble();
        donacion = ganancia;
        if (ganancia >= 0 && ganancia <= 1000) {
            donacion *= 5;
            donacion /= 100;
            System.out.println("La ganancia es S/." + ganancia + "\nPor lo tanto la donacion sera: " + donacion);
        } else if (ganancia > 1000 && ganancia <= 1500) {
            donacion *= 7;
            donacion /= 100;
            System.out.println("La ganancia es S/." + ganancia + "\nPor lo tanto la donacion sera: " + donacion);
        } else if (ganancia > 1500 && ganancia <= 2000) {
            donacion *= 8;
            donacion /= 100;
            System.out.println("La ganancia es S/." + ganancia + "\nPor lo tanto la donacion sera: " + donacion);
        } else if (ganancia > 2000 && ganancia <= 5000) {
            donacion *= 10;
            donacion /= 100;
            System.out.println("La ganancia es S/." + ganancia + "\nPor lo tanto la donacion sera: " + donacion);
        } else if (ganancia > 5000) {
            donacion *= 15;
            donacion /= 100;
            System.out.println("La ganancia es S/." + ganancia + "\nPor lo tanto la donacion sera: " + donacion);
        }

    }

}