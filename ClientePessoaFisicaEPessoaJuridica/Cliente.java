public class Cliente{

    protected String codigoCliente;
    protected String nome;
    protected String profissao;
    
    public Cliente(){
    }
    
    public Cliente (String codigoCliente,String nome,String profissao){
        setCodigoCliente(codigoCliente);
        setNome(nome);
        setProfissao(profissao);
    }
    
    public String getCodigo(){
        return this.codigoCliente;
    }
    
    public void setCodigoCliente(String codigoCliente){
        this.codigoCliente = codigoCliente;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getProfissao(){
        return this.profissao;
    }
    
    public void setProfissao(String profissao){
        this.profissao = profissao;
    }
}