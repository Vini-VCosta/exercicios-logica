public class Principal{
    
    public static void main(String args[]){
        
        System.out.println("\f");
        
        Pessoa pessoa = new Pessoa();
        
        pessoa.nome = "Vinicius";
        pessoa.peso = 88.300;
        pessoa.idade = 18;
        
        System.out.println("\nNome: "+pessoa.nome);
        System.out.println("\nPeso: "+pessoa.peso);
        System.out.println("\nIdade: "+pessoa.idade);   
        
        System.out.println("Nome: "+pessoa.nome
                           +"\nPeso: "+pessoa.peso
                           +"\nIdade: "+pessoa.idade);
        
        System.out.println(pessoa.falar1("Oi"));
        
        pessoa.falar2("Tchau");
        
        System.out.println(pessoa.darBoaTarde());
        
        System.out.println("Idade em Meses: "+pessoa.calcularIdadeMeses());
        
        System.out.println("Idade ao quadrado: "+pessoa.calcularIdadeAoQuadrado());
        
        System.out.println("Calcular idade conforme expoente: "+pessoa.calcularIdadeConformeExpoente(4));
        
        System.out.println("Dez por cento no peso: "+pessoa.adicionarDezPorCentoNoPeso());
    }
}