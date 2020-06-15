
public class Aluno extends Pessoa{

    protected double nota1;
    protected double nota2;
    
    public Aluno(){
     super();
    }
    
    public Aluno(String nome, String sobrenome, String email, String dataNascimento, double nota1, double nota2){
      this.nome = nome;
      this.sobrenome = sobrenome;
      this.email = email;
      this.dataNascimento = dataNascimento;
      this.nota1 = nota1;
      this.nota2 = nota2;
    }
    
    public double getNota1(){
        return this.nota1;
    }
    
    public void setNota1(double nota1){
        this.nota1 = nota1;
    }
    
    public double getNota2(){
        return this.nota2;
    }
    
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }
    
    public double calcularMediaAritmetica(){
        return (this.nota1 + this.nota2) / 2;
    }
    @Override
    public String toString(){
        return "Nome: "+nome
              +"\nSobrenome: "+sobrenome
              +"\nEmail: "+email
              +"\nData de nascimento: "+dataNascimento
              +"\nNota 1 : "+nota1
              +"\nNota 2 : "+nota2
              +"\nMedia Aritmetica: "+calcularMediaAritmetica();
    }
}