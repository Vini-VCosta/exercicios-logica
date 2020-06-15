public class Laranja extends Fruta{
    
    public Laranja(){
    }
    
    public Laranja(String cor){
        setCor(cor);
    }
    
    @Override
    public String comer(){
        return "Levemente acida!";
    }
    
    @Override
    public String retirarCasca(){
        return "Coloque a fruta de pé, faça um corte na vertical e outro na horizontal. Após isso puxe a casca dos gomos!";
    }
    
    @Override
    public String toString(){
        return  "\nNome da fruta: Laranja"
              +"\nCor: "+this.cor
              +"\nO sabor é: "+comer()
              +"\nComo retirar a casca: "+retirarCasca();
    }
}