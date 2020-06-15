import java.util.Scanner;
/**
 * Classe Aluno
 * @author Vinícius Costa 
 * @version 1.0
 * @since 01/06/2020 - 13:50
 * category View
 */
public class Principal{
     public static void main(String args[]){
    
       System.out.println("\f");
       
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Digite o mês que você nasceu: ");
       String mes = scanner.next();
       Trimestre trimestre = new Trimestre(mes);
       System.out.println(trimestre);
    }
}
