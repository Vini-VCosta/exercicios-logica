public class Pessoa{

    protected String nome;
    protected String sobrenome;
    protected String email;
    protected String dataNascimento;
    
    public Pessoa(){
    }
    
    public Pessoa(String nome, String sobrenome,String email,String dataNascimento){
        setNome(nome);
        setSobrenome(sobrenome);
        setEmail(email);
        setDataNascimento(dataNascimento);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getSobrenome(){
        return this.sobrenome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public String geEmail(){
        return this.email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getDataNascimeto(){
        return this.dataNascimento;
    }
    
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
}