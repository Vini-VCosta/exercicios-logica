public class Maca extends Fruta{
    
    public Maca(){
    }
    
    public Maca(String cor){
        setCor(cor);
    }
    
    @Override
    public String comer(){
        return "Doce e umida!";
    }
    
    @Override
    public String retirarCasca(){
        return "Não há necessidade de retirar, mas caso deseje, deve-se encostar a faca na casca e movimenta-la pela fruta!";
    }
    
    @Override
    public String toString(){
        return "\nNome da fruta: Maça"
              +"\nCor: "+this.cor
              +"\nO sabor é: "+comer()
              +"\nComo retirar a casca: "+retirarCasca();
    }
}