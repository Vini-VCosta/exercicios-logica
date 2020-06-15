public class PessoaFisica extends Cliente{
   
   protected String estadoCivil;
   protected String CPF;
   protected String dataNascimento;
   
   public PessoaFisica(){
       super();
   }
   
   public PessoaFisica(String codigoCliente, String nome,String profissao, String estadoCivil, String CPF,String dataNascimento){
       this.codigoCliente = codigoCliente;
       this.nome = nome;
       this.profissao = profissao;
       this.estadoCivil = estadoCivil;
       this.CPF = CPF;
       this.dataNascimento = dataNascimento;
   }
   
   public String EstadoCivil(){
       return this.estadoCivil;
   }
   
   public void EstadoCivil(String estadoCivil){
       this.estadoCivil = estadoCivil;
   }
   
   public String CPF(){
       return this.CPF;
   }
   
   public void CPF(String CPF){
       this.CPF = CPF;
   }
   
   public String getDataNascimeto(){
        return this.dataNascimento;
    }
    
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
   @Override
    public String toString(){
        return "\n      Pessoa Fisica"+
               "\nCodigo do cliente: "+codigoCliente
              +"\nNome: "+nome
              +"\nProfissão: "+profissao
              +"\nEstado Civil: "+estadoCivil
              +"\nCPF: "+CPF
              +"\nData de nascimento: "+dataNascimento;
    }
}