public class Funcionario extends Pessoa{

   protected String numeroRegistro;
   
   public Funcionario(){
        super();
    }
    
    public Funcionario(String nome, String sobrenome, String email, String dataNascimento,String numeroRegistro){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.numeroRegistro = numeroRegistro; 
    }
    
    public String getNumeroRegistro(){
        return this.numeroRegistro = numeroRegistro;
    }
    
    public void setNumeroRegistro(String numeroRegistro){
        this.numeroRegistro = numeroRegistro;
    }
    
    @Override
    public String toString(){
        return "\nNome: "+nome
              +"\nSobrenome: "+sobrenome
              +"\nEmail: "+email
              +"\nData de nascimento: "+dataNascimento
              +"\nNúmero do Registro: "+numeroRegistro;
    }
}