public class Principal{

    public static void main(String args[]){
    
        System.out.println("\f");
        
        PessoaJuridica pessoaJuridica = new PessoaJuridica("9875","Josias","Carpinteiro","José","12.345.678/9012-34","388.108.598.269",200.50);
        System.out.println(pessoaJuridica);
        
        PessoaFisica pessoaFisica = new PessoaFisica("54789","Zerike","Agricultor","Casado","758.319.064-91","22/10/2001");
        System.out.println(pessoaFisica);
    }
}