public class Quadrado implements FiguraGeometrica{

    protected double lado;
    
    public Quadrado(){
    }
    
    public Quadrado(double lado){
        setLado(lado);
    }
    public double getLado(){
        return this.lado;
    }
    
    public void setLado(double lado){
        this.lado = lado;
    }
    

    public String getnomeFigura(){
         return "Quadrado";
    }
    
    public double calcularArea(){
         return this.lado * this.lado;
    }
    
     public double calcularPerimetro(){
         return this.lado * 4;
    }
    
    @Override 
    public String toString(){
        return "Nome da figura: "+getnomeFigura()
              +"\nLado: "+lado
              +"\nArea: "+calcularArea()
              +"\nPerimetro: "+calcularPerimetro();
    }
}