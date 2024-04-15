import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Preg02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese n: ");
        int n = scanner.nextInt();
        
        int suma=0;
        suma = (n*(n+1))/2;
        System.out.println("Sumatoria = "+ suma);
        
    }
    
}