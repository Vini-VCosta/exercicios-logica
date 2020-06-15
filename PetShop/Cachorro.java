public class Cachorro extends Animal{

    protected String raca;
    protected double tamanho;
    protected String sexo;
    
    public Cachorro(){
        super();
    }
    
    public Cachorro(String nome, int idade, String raca, double tamanho,String sexo){
       this.nome = nome;
       this.idade = idade;
       this.raca = raca;
       this.tamanho = tamanho;
       this.sexo = sexo;
    }
    
    public String getRaca(){
        return this.raca;
    }
    
    public void setRaca(String raca){
        this.raca = raca;
    }
    
    public double getTamanho(){
        return this.tamanho;
    }
    
    public void setTamanho(double tamanho){
        this.tamanho = tamanho;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public double calcularPrecoBanho(){
        return this.tamanho * 10;
    }
    
    public double calcularPrecoTosa(){
        return this.tamanho * 15;
    }
    
    @Override 
    public String toString(){
        return "\n  Ficha do Cachorro" 
               +"\nNome: "+nome
               +"\nIdade: "+idade
               +"\nRaça: "+raca
               +"\nSexo: "+sexo
               +"\nPreço do banho: "+calcularPrecoBanho()
               +"\nPreço da tosa: "+calcularPrecoTosa();
            }
}