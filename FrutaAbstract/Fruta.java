public abstract class Fruta{
    
    protected String cor;
    
    public String getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public abstract String comer();
    
    public abstract String retirarCasca();
}