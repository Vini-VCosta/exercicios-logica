import java.util.Scanner;
/**
 * 
 * @author Vinícius Costa 
 * @version 1.0
 * @since 27/05/2020 - 22:20
 * category View
 */
public class Principal{
   public static void main(String args[]){
    
       System.out.println("\f");
       
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Digite o número do mês que deseja: ");
       int numeroMes = scanner.nextInt();
       Mes mes = new Mes(numeroMes);
       System.out.println(mes);
    }
}
