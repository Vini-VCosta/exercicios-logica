public class Calculo{
    
    private double numero1;
    private double numero2;
    private double numero3;
    private Formatacao formatacao = new Formatacao();
    
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
    
    public double getNumero3(){
        return this.numero3;
    }
    
    public void setNumero3(double numero3){
        this.numero3 = numero3;
    }
    
    public double calcularProdutoDosNumeros(){
        return this.numero1 * this.numero2 * this.numero3;
    }

    @Override
    public String toString(){
        return "Número 1: "+this.numero1
              +"\nNúmero 2: "+this.numero2
              +"\nNúmero 3: "+this.numero3
              +"\nSoma dos três números: "+formatacao.formatar(this.calcularProdutoDosNumeros());
    }
    
    
}