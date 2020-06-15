import java.util.Scanner;
/**
 * Classe Aluno
 * @author Vinícius Costa 
 * @version 1.0
 * @since 01/06/2020 - 16:29
 * category View
 */
public class Principal{
     public static void main(String args[]){
    
       System.out.println("\f");
       
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Digite o nome: ");
       String nome = scanner.next();
       System.out.println("Digite a sua idade: ");
       int idade = scanner.nextInt();
       Nadador nadador = new Nadador(nome,idade);
       System.out.println(nadador);
    }
}
       