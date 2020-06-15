import java.util.Scanner;
/**
 * Classe Aluno
 * @author Vinícius Costa 
 * @version 1.0
 * @since 01/06/2020 - 15:55
 * category View
 */
public class Principal{
     public static void main(String args[]){
    
       System.out.println("\f");
       
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Digite quantos litros deseja: ");
       double litro = scanner.nextDouble();
       System.out.println("Qual combustivel deseja: ");
       String nomeCombustivel = scanner.next();
       Combustivel combustivel = new Combustivel(litro,nomeCombustivel);
       System.out.println(combustivel);
    }
}
       