public class PessoaJuridica extends Cliente{

   protected String razaoSocial;
   protected String CNPJ;
   protected String inscricaoEstadual;
   protected double capitalInicial;
   
   public PessoaJuridica(){
       super();
   }
   
   public PessoaJuridica(String codigoCliente, String nome,String profissao,String razaoSocial,
   String CNPJ,String inscricaoEstadual, double capitalInicial){
       this.codigoCliente = codigoCliente;
       this.nome = nome;
       this.profissao = profissao;
       this.razaoSocial = razaoSocial;
       this.CNPJ = CNPJ;
       this.inscricaoEstadual = inscricaoEstadual;
       this.capitalInicial = capitalInicial;
   }
   
   public String getRazaoSocial(){
       return razaoSocial;
   }
   
   public void setRazaoSocial(String razaoSocial){
       this.razaoSocial = razaoSocial;
   }
   
   public String getCNPJ(){
       return CNPJ;
   }
   
   public void setCNPJ(String CNPJ){
       this.CNPJ = CNPJ;
   }
   
   public String getInscricaoEstadual(){
       return inscricaoEstadual;
   }
   
   public void setInscricaoEstadual(String inscricaoEstadual){
       this.inscricaoEstadual = inscricaoEstadual;
   }
   
   public double getCapitalInicial(){
       return capitalInicial;
   }
   
   public void setCapitalInicial(double capitalInicial){
       this.capitalInicial = capitalInicial;
   }
   @Override
    public String toString(){
        return "     Pessoa Juridica"
              +"\nCodigo do cliente: "+codigoCliente
              +"\nNome: "+nome
              +"\nProfissão: "+profissao
              +"\nRazão Social: "+razaoSocial
              +"\nCNPJ: "+CNPJ
              +"\nInscricao Estadual: "+inscricaoEstadual
              +"\nCapital inicial: "+capitalInicial;
    }
}