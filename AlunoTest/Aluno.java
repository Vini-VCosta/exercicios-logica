/**
 * @author Vinicius Costa 
 * @version 1.0
 * @since 27/05/2020 - 18:00
 */
public class Aluno{
   protected String nome;
   protected double nota1;
   protected double nota2;
   protected int totalAulas;
   protected int numeroPresencas;

   public Aluno(){ 
   }
   
   public Aluno(String nome, double nota1, double nota2, int totalAulas, int numeroPresencas){
       setNome (nome);
       setNota1 (nota1);
       setNota2 (nota2);
       setTotalAulas (totalAulas);
       setNumeroPresencas (numeroPresencas);
   }
   public String getNome(){
    return nome;
   }
   
   public void setNome(String nome){
    this.nome = nome;
   }
   
   public double getNota1(){
    return nota1;
   }
   
   public void setNota1(double nota1){
    this.nota1 = nota1;
   }
   
   public double getNota2(){
    return nota2;
   }
   
   public void setNota2(double nota2){
    this.nota2 = nota2;
   }
   
   public int getTotalAulas(){
    return totalAulas;
   }
   
   public void setTotalAulas(int totalAulas){
    this.totalAulas = totalAulas;
   }
   
   public int getNumeroPresencas(){
    return numeroPresencas;
   }
   
   public void setNumeroPresencas(int numeroPresencas){
    this.numeroPresencas = numeroPresencas;
   }
   
   /**
   *@return Retorna a frequencia do aluno
   */
   public int calcularFrequencia(){
       return (this.numeroPresencas * 100) / this.totalAulas ;
   }
   
   /**
   *@return Retorna a media do aluno
   */
   public double calcularMediaAritmetica(){
       return (this.nota1 + this.nota2) /2;
   }
   
   @Override
   public String toString(){
       return "\nNome: "+this.nome
             +"\nNota 1 : "+this.nota1
             +"\nNota 2 : "+this.nota2
             +"\nNúmero de presenças: "+this.numeroPresencas
             +"\nTotal de aulas dadas: "+this.totalAulas
             +"\nFrequência: "+this.calcularFrequencia() + "%"
             +"\nMédia: "+this.calcularMediaAritmetica();
    }
}
