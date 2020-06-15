public class Gato extends Animal{

    protected String raca;
    protected double peso;
    protected String sexo;
    
    public Gato(){
        super();
    }
    
    public Gato(String nome, int idade, String raca, double peso,String sexo){
       this.nome = nome;
       this.idade = idade;
       this.raca = raca;
       this.peso = peso;
       this.sexo = sexo;
    }
    
    public String getRaca(){
        return this.raca;
    }
    
    public void setRaca(String raca){
        this.raca = raca;
    }
    
    public double getPeso(){
        return this.peso;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public double calcularDosagemRemedio(){
        return this.peso * 0.30;
    }
    
    public double calcularPrecoCastramento(){
        return this.peso * 12; 
    }
    
    @Override 
    public String toString(){
        return "  Ficha do Gato" 
               +"\nNome: "+nome
               +"\nIdade: "+idade
               +"\nRaça: "+raca
               +"\nPeso: "+peso
               +"\nSexo: "+sexo
               +"\nDosagem dos remedios (medida em gramas): "+calcularDosagemRemedio()
               +"\nPreço do castramento: "+calcularPrecoCastramento();
    }
}