/**
 * Classe Aluno
 * @author Vinícius Costa 
 * @version 1.0
 * @since 01/06/2020 - 16:00
 * category Model
 */
public class Nadador{
    
    protected String nome;
    protected int idade;
    
    public Nadador(){
    }
    
    /**
     * Construtor cheio, ira se colocar o nome e a idade, usado por causa do Scanner
     */
    public Nadador(String nome,int idade){
        setNome(nome);
        setIdade(idade);
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    /**
     *@return Retorna a classificação do nadador com base na idade 
     */
    public String classificarIdade(){
        return this.idade <= 8 ? "Não pode ser nadador" : this.idade <= 10 ? "Infantil" 
        : this.idade <= 17 ? "Juvenil" : "Adulto";
    }
    
    @Override
   public String toString(){
       return "\nNome: "+this.nome
              +"\nIdade: "+this.idade
              +"\nClassificação: "+classificarIdade();
            }
}
