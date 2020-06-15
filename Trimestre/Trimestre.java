/**
 * Classe Aluno
 * @author Vinícius Costa 
 * @version 1.0
 * @since 01/06/2020 - 13:15
 * category Model
 */
public class Trimestre{
    
    protected String mes;
    
    public Trimestre(){
    }
   
    /**
     * Construtor cheio, ira se colocar o numero do mes, usado por causa do Scanner
     */
    public Trimestre(String mes){
        setMes(mes);
    }
    
    public String getMes(){
        return mes;
    }
    
    public void setMes(String mes){
        this.mes = mes;
    }
    
    /**
      *return Retorna o trismestre com base no nome do mes;
      */
     
     public String verificarTrimestre(){
         switch (this.mes){
           case "Janeiro":
                return "1 Trimestre";
           case "Fevereiro":
                return "1 Trimestre";
           case "Março":
                return "1 Trimestre";
           case "Abril":
                return "2 Trimestre";
           case "Maio":
                return "2 Trimestre";
           case "Junho":
                return "2 Trimestre";
           case "Julho":
                return "3 Trimestre";
           case "Agosto":
                return "3 Trimestre";
           case "Setembro":
                return "3 Trimestre";
           case "Outubro":
                return "4 Trimestre";
           case "Novembro":
                return "4 Trimestre";
           case "Dezembro":
                return "4 Trimestre";
           default:
                return "Esse mês não existe!";
            }
     }
     @Override
   public String toString(){
       return "\nVocê nasceu no: "+verificarTrimestre();
    }
}
