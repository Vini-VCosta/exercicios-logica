public class Calculadora{

    double numero1;
    double numero2;

    public double somar(){
        return this.numero1 + numero2;
    }
    
    public double subtrair(){
        return this.numero1 - numero2;
    }
    
    public double dividir(){
        return this.numero1 / numero2;
    }
    
    public double multiplicar(){
        return this.numero1 * numero2;
    }
    
    public double calcularRaizQuadrada(){
        return Math.sqrt(this.numero1);
    }
    
    public double calcularPotenciaNumero1(int expoente){
        return Math.pow(this.numero1, expoente);
    }
    
    public double potenciaNumero1PorNumero2(){
        return Math.pow(this.numero1, numero2 );
    }

}

