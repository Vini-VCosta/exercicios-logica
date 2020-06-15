public class Produto{
    
    String descricao;
    String fornecedor;
    double valorCusto; 
    double quantidade;
    double porcentagem;
    
    public double calcularValorEmEstoque(){
        return this.valorCusto * this.quantidade;
    }
    
    public double adiconarPorcentagemAoValorCusto(){
        return this.valorCusto * 1.65;
    }
    
    
    public double adicionarPorcentagem(double porcentagem){
        return this.valorCusto + valorCusto * porcentagem;
    }
}