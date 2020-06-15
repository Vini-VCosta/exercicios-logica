/**
 * 
 * @author Vinícius Costa 
 * @version 1.0
 * @since 27/05/2020 - 21:40
 * category Model
 */
public class Mes{
    
    protected int numeroMes;
    
    public Mes(){
    }
    
    /**
     * Construtor cheio, ira se colocar o numero do mes, usado por causa do Scanner
     */
    public Mes(int numeroMes){
       setNumeroMes(numeroMes);
    }
    
    public int getNumeroMes(){
        return numeroMes;
    }
    
    public void setNumeroMes(int numeroMes){
        this.numeroMes = numeroMes;
    }
    /**
     *@return Retorna o nome do mês correspondente ao numero  
     */
    public String verificarMes(){
           switch (this.numeroMes){
            case 1:
              return "Janeiro";
            case 2:
               return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
               return "Junho";
            case 7:
               return "Julho";
            case 8:
               return "Agosto";
            case 9:
              return "Setembro";
            case 10:
                return "Outubro";
            case 11:
               return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return "Esse mês não existe!";
          }
        }
     
    @Override
   public String toString(){
       return "Mês: "+verificarMes();
    }
  }