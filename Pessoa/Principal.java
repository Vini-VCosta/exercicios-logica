public class Principal{

    public static void main(String args[]){
    
        System.out.println("\f");
        
        Aluno aluno = new Aluno("Vicent", "Ferraz","vicent.jr@gmail.com","11/10/2001",9,4);
        System.out.println(aluno);
        
        Professor professor = new Professor("Carlos","Silva","CSilva@gmail.com","22/02/1999","123",10,10);
        System.out.println(professor);
        
        Funcionario funcionario = new Funcionario("Agostinho","Carrara","TaxiCarraraouCarraraTaxi@gmail.com","19/10/1978","65823");
        System.out.println(funcionario);
    }
}