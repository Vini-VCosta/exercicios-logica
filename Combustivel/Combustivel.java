/**
 * Classe Combustivel
 * @author Vinícius Costa 
 * @version 1.0
 * @since 01/06/2020 - 14:25
 * category Model
 */
public class Combustivel{

    protected double litro;
    protected String nomeCombustivel;
   
   public Combustivel(){
   }
   
   /**
     * Construtor cheio, ira se colocar a quantidade e o nome do combustivel desejado, usado por causa do Scanner
     */
   public Combustivel(double litro, String nomeCombustivel){
       setLitro(litro);
       setNomeCombustivel(nomeCombustivel);
   }
    
   public double getLitro(){
    return litro;
   }
   
   public void setLitro(double litro){
    this.litro = litro;
   }
   
   public String getNomeCombustivel(){
    return nomeCombustivel;
   }
   
   public void setNomeCombustivel(String nomeCombustivel){
    this.nomeCombustivel = nomeCombustivel;
   }
   /**
     *@return Retorna o calculo da Gasolina
     */
   public double calcularGasolina(){
       return this.litro * 4.49;
   } 
   
    /**
     *@return Retorna o calculo do Alcool
     */
   public double calcularAlcool(){
       return this.litro * 3.68;
   }
   
    /**
     *@return Retorna o calculo do Diesel
     */
   public double calcularDiesel(){
       return this.litro * 3.71;
  }
  
   /**
     *@return Retorna o calculo do Flex
     */
   public double calcularFlex(){
       return (this.litro * 4.49) + (this.litro * 3.68);
  }
  
   /**
     *@return Retorna o calculo do combustivel com base no nome 
     */
  public String verificarCombustivel(){
       if (this.nomeCombustivel.equals("Gasolina")){
           return ""+calcularGasolina();
        }else if(this.nomeCombustivel.equals("Alcool")){ 
           return  ""+calcularAlcool();
        }else if(this.nomeCombustivel.equals("Diesel")){
            return ""+calcularDiesel();
        }else if(this.nomeCombustivel.equals("Flex")){
            return ""+calcularFlex();
        }
        return "Gasolina indisponivel";
    }
    
   @Override
   public String toString(){
       return "\nCombustivel: "+nomeCombustivel
              +"\nLitros: "+litro
              +"\nValor a pagar: "+verificarCombustivel();
    }
}
