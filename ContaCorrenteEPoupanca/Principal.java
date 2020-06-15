import java.util.Scanner;
public class Principal{

    public static void main(String args[]){
    
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        
        /*System.out.println("Qual é o seu nome: ");
        String titular = scanner.next();
        
        System.out.println("Qual é o seu numero de cartão: ");
        String numero = scanner.next();
        
        System.out.println("Qual é a sua agẽncia: ");
        String agencia = scanner.next();
        
        System.out.println("Qual é o seu saldo: ");
        Double saldo = scanner.nextDouble();
        
        ContaCorrente contaCorrente = new ContaCorrente(titular,numero,agencia,saldo);   
        System.out.println(contaCorrente);*/
        
        // 
        System.out.println("Qual é o seu nome: ");
        String titular1 = scanner.next();
        
        System.out.println("Qual é o seu numero de cartão: ");
        String numero1 = scanner.next();
        
        System.out.println("Qual é a sua agẽncia: ");
        String agencia1 = scanner.next();
        
        System.out.println("Qual é o seu saldo: ");
        Double saldo1 = scanner.nextDouble();
        
        ContaPoupanca contaPoupanca = new ContaPoupanca(titular1,numero1,agencia1,saldo1);   
        System.out.println(contaPoupanca);
        
        
    }
}