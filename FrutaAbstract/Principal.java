import java.util.Scanner;
public class Principal{

    public static void main(String args[]){
    
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual a cor da maça: ");
        String cor = scanner.next();
        Maca maca = new Maca(cor);
        System.out.println(maca);
        
        System.out.println("\nQual a cor da banana: ");
        String cor1 = scanner.next();
        Banana banana = new Banana(cor1);
        System.out.println(banana);
        
        System.out.println("\nQual a cor da laranja: ");
        String cor2 = scanner.next();
        Laranja laranja = new Laranja(cor2);
        System.out.println(laranja);
    }
}