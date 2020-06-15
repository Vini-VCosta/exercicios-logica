
public class Principal{
    
    public static void main(String args[]){
        
        System.out.println("\f");
        
        Calculadora calculadora = new Calculadora();
        
        calculadora.numero1 = 20;
        calculadora.numero2 = 10;
        
        System.out.println("Soma do número1 com número2: "+calculadora.somar()
                        +"\nSubtração do número1 com número2: "+calculadora.subtrair()
                        +"\nDivisão do número1 com o número2: "+calculadora.dividir()
                        +"\nMultiplicação do número1 com número2: "+calculadora.multiplicar()
                        +"\nRaiz quadrada do número1: "+calculadora.calcularRaizQuadrada()
                        +"\nPótenciação do número1: "+calculadora.calcularPotenciaNumero1(2)
                        +"\nPotenciação do número1 pelo número2: "+calculadora.potenciaNumero1PorNumero2());
    }

}