public class Calculadora implements CalculadoraInterface{
    
    protected double numero1;
    protected double numero2;
    
    public Calculadora(){
    }
    
    public Calculadora(double numero1,double numero2){
        setNumero1 (numero1);
        setNumero2 (numero2);
    }
    
    public double getNumero1(){
        return this.numero1;
    }
    
    public void setNumero1(double numero1){
        this.numero1 = numero1;
    }
    
    public double getNumero2(){
        return this.numero2;
    }
    
    public void setNumero2(double numero2){
        this.numero2 = numero2;
    }
    @Override 
    public double somar(){
        return this.numero1 + this.numero2;
    }
    
    public double subtrair(){
        return this.numero1 - this.numero2;
    }
    
    public double multiplicar(){
        return this.numero1 * this.numero2;
    }
    
    public double dividir(){
        return this.numero1 / this.numero2;
    }
    
    @Override 
    public String toString(){
        return "Numero 1: "+numero1
              +"\nNumero 2: "+numero2
              +"\nSoma: "+somar()
              +"\nSubtração: "+subtrair()
              +"\nMultiplicação: "+multiplicar()
              +"\nDivisão: "+dividir();
    }
    
}