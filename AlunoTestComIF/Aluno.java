 /**
 * Classe Aluno
 * @author Vinícius Costa 
 * @version 1.0
 * @since 28/05/2020 - 18:45
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
   *@return Retorna a situação do aluno em relação as notas
   */
   public String calcularMediaAritmetica(){
       return (this.nota1 + this.nota2) /2 >= 6 ? "Aprovado" : "Reprovado";
    }
   /**
    *@return Retorna a situação do aluno  
    */
   public String verificarMediaEFrequencia(){
       return calcularMediaAritmetica().equals("Aprovado") && calcularFrequencia() >= 75 ? "Aprovado" : "Reprovado";
    }
    
   /**
    *@return Retorna o conceito do aluno
    */
   public String verificarConceito(){
       return (this.nota1 + this.nota2) /2 >= 9 ? "Conceito A" :  (this.nota1 + this.nota2) /2 >= 7 ? "Conceito B" :
       (this.nota1 + this.nota2) /2 >= 6 ? "Conceito C" : "Conceito D";
    }
    
   @Override
   public String toString(){
       return "\nNome: "+this.nome
             +"\nNota 1 : "+this.nota1
             +"\nNota 2 : "+this.nota2
             +"\nNúmero de presenças: "+this.numeroPresencas
             +"\nTotal de aulas dadas: "+this.totalAulas
             +"\nFrequência: "+this.calcularFrequencia() + "%"
             +"\nSituação do aluno em quetão as notas: "+this.calcularMediaAritmetica()
             +"\nSituação do aluno: "+verificarMediaEFrequencia()
             +"\nConceito do aluno: "+ verificarConceito();
            }
}

