public class ContaCorrente extends Conta{

    protected double taxa;
    
    public ContaCorrente(){
    }
    
    public ContaCorrente(String titular,String numero,String agencia, double saldo){
        setTitular(titular);
        setNumero(numero);
        setAgencia(agencia);
        setSaldo(saldo);
    }
    
    public double getTaxa(){
        return this.taxa;
    }

    public void setTaxa(double taxa){
        this.taxa = taxa;
    }

    public String gerarExtrato(){
        return "\nTitular: "+getTitular()
              +"\nNumero do cartão: " +getNumero()
              +"\nAgencia: " +getAgencia()
              +"\nSeu saldo: " +getSaldo();
    }
    
    @Override 
    public String toString(){
        return "\nConta Corrente"              
                + gerarExtrato();
              
    }
}