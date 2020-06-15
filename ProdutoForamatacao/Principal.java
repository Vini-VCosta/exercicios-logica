public class Principal{

       public static void main(String args[]){
       
       Produto produto = new Produto();
        
        System.out.println("\f");
       
        produto.descricao = "Celular";
        produto.fornecedor  ="Apple";
        produto.valorCusto = 10; 
        produto.quantidade = 20;
        produto.porcentagem = 0.5;
        
        System.out.println("Descrição: "+produto.descricao
                            +"\nFornecedor: "+produto.fornecedor
                            +"\nValor em estoque: "+produto.calcularValorEmEstoque()
                            +"\nAdicionar 65% ao valor custo: "+produto.adiconarPorcentagemAoValorCusto()
                            +"\nAdicionar porcentagem ao valor custo (segunda opção): "+produto.adicionarPorcentagem(produto.porcentagem));
    }
        
}