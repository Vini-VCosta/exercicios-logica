public class Pessoa {

    String nome;
    double peso;
    int idade;
    
    public String falar1(String mensagem){
        return mensagem;
    }
    public void falar2(String mensagem){
        System.out.println(mensagem);
    }
    
    public String darBoaTarde(){
        return "Oi! Boa tarde";
    }
    
    public int calcularIdadeMeses(){
        return this.idade * 12;
    }
    
    public double calcularIdadeAoQuadrado(){
        return Math.pow(this.idade, 2);
    }
    
    public double calcularIdadeConformeExpoente(int expoente){
        return Math.pow(this.idade, expoente);   
   
    }
    public double adicionarDezPorCentoNoPeso(){
        //return this.peso + this.peso * 0.1 ;
        return this.peso * 1.10;
    }
   
   
}