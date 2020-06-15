public class ContaPoupanca extends Conta{

    public ContaPoupanca(){
    }
    
    public ContaPoupanca(String titular,String numero,String agencia, double saldo){
        setTitular(titular);
        setNumero(numero);
        setAgencia(agencia);
        setSaldo(saldo);
    }
    
    public double gerarExtrato(){
        return getSaldo() - (getSaldo() * 0.04);
    }
    
    @Override 
    public String toString(){
        return "\nConta Poupança"              
               +"\nExtrato: " + gerarExtrato();
              
    }
}