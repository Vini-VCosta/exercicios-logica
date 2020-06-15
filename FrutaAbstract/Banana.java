public class Banana extends Fruta{
    
    public Banana(){
    }
    
    public Banana(String cor){
        setCor(cor);
    }
    
    @Override
    public String comer(){
        return "Doce e levemente azedo!";
    }
    
    @Override
    public String retirarCasca(){
        return "Pegue numa ponta da fruta e puxe a casca até a outra ponta, repita isso com todos os lados!";
    }
    
    @Override
    public String toString(){
        return  "\nNome da fruta: Banana"
              +"\nCor: "+this.cor
              +"\nO sabor é: "+comer()
              +"\nComo retirar a casca: "+retirarCasca();
    }
}