import java.util.Scanner;
/**
 * @author Vinicius Costa 
 * @version 1.0
 * @since 27/05/2020 - 18:00
/**
 * @author Vinicius Costa 
 * @version 1.0
 * @since 27/05/2020 - 18:30
 */

public class Principal{
    
    public static void main(String args[]){
    
        System.out.println("\f");
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual o seu nome: ");
        String nome = scanner.next();
        System.out.println("Quanto foi a sua nota 1: ");
        Double nota1 =  scanner.nextDouble();
        System.out.println("Quanto foi a sua nota 2: ");
        Double nota2 =  scanner.nextDouble();
        System.out.println("Quantas aulas tiveram: ");
        int totalAulas = scanner.nextInt();
        System.out.println("Quantas aulas você participou: ");
        int numeroPresencas = scanner.nextInt();
        Aluno aluno = new Aluno(nome,nota1,nota2,totalAulas,numeroPresencas);
        System.out.println(aluno);
    }
}
