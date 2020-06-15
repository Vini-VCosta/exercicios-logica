public class Calculo{
    
    private double base;
    private double altura;
    private Formatacao formatacao = new Formatacao();
    
    public Calculo(){
    }
    
    public Calculo(double base, double altura){
        setBase(base);
        setAltura(altura);
    }
    
    public double getBase(){
        return this.base;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double calcularAreaRetangulo(){
        return this.base * this.altura;
    }
    
    public double calcularPerimetroRetangulo(){
        return 2 * (this.base + this.altura);
    }
    
    @Override
    public String toString(){
        return "Base: "+this.base
              +"\nAltura: "+this.altura
              +"\nÁrea do retangulo: "+formatacao.formatar(calcularAreaRetangulo())
              +"\nPerimetro do retangulo: "+formatacao.formatar(calcularPerimetroRetangulo());
              
    }
}