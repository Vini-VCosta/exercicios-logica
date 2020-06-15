public class Professor extends Pessoa{
    
    protected String numeroRegistro;
    protected double numeroHorasTrabalhadas;
    protected double valorHora;
    
    public Professor(){
        super();
    }
    
    public Professor(String nome, String sobrenome, String email, String dataNascimento,
    String numeroRegistro, double numeroHorasTrabalhadas, double valorHora){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.numeroRegistro = numeroRegistro;
        this.numeroHorasTrabalhadas = numeroHorasTrabalhadas;
        this.valorHora = valorHora;
    }
    
    public String getNumeroRegistro(){
        return this.numeroRegistro;
    }
    
    public void setNumeroRegistro(String numeroRegistro){
        this.numeroRegistro = numeroRegistro;
    }
    
    public double getNumeroHorasTrabalhadas(){
        return this.numeroHorasTrabalhadas;
    }
    
    public void setNumeroHorasTrabalhadas(double numeroHorasTrabalhadas){
        this.numeroHorasTrabalhadas = numeroHorasTrabalhadas;
    }
    
    public double getValorHora(){
        return this.valorHora;
    }
    
    public void setValorHora(double valorHora){
        this.valorHora = valorHora;
    }
    
    public double calcularSalarioBruto(){
        return this.valorHora * this.numeroHorasTrabalhadas;
    }
    
    public double calcularFGTS(){
        return this.calcularSalarioBruto() * 0.8;
    }
    
    @Override
    public String toString(){
        return "\nNome: "+nome
              +"\nSobrenome: "+sobrenome
              +"\nEmail: "+email
              +"\nData de nascimento: "+dataNascimento
              +"\nNúmero do Registro: "+numeroRegistro
              +"\nNumero de horas trabalhadas: "+numeroHorasTrabalhadas
              +"\nValor da hora: "+valorHora
              +"\nSalario bruto: "+calcularSalarioBruto()
              +"\nValor de FGTS: "+calcularFGTS();
    }
}