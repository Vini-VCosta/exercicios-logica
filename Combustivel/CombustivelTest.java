import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste CombustivelTest.
 * @author Vinícius Costa 
 * @version 1.0
 * @since 01/06/2020 - 14:50
 */
public class CombustivelTest{
    
    Combustivel combustivel = new Combustivel();

    public CombustivelTest() {
       
    }

    /**
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp(){
        combustivel.setLitro(50);
    }

    /**
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown(){
    }
    
    /**
     * @test Testa o calculo da Gasolina
     */
    @Test
    public void calcularGasolina(){
        assertEquals(224.5,combustivel.calcularGasolina() ,  0.0);
        
        combustivel.setLitro(2);
        assertEquals(8.98,combustivel.calcularGasolina() ,  0.0);
    }
    
    /**
     * @test Testa o calculo do Alcool
     */
    @Test
    public void calcularAlcool(){
        assertEquals(184.0,combustivel.calcularAlcool() ,  0.0);
        
        combustivel.setLitro(2);
        assertEquals(7.36,combustivel.calcularAlcool() ,  0.0);
    }
    
    /**
     * @test Testa o calculo do Diesel
     */
    @Test
    public void calcularDiesel(){
        assertEquals(185.5,combustivel.calcularDiesel() ,  0.0);
        
        combustivel.setLitro(4);
        assertEquals(14.84,combustivel.calcularDiesel() ,  0.0);
    }
    
    /**
     * @test Testa o calculo do Flex
     */
    @Test
    public void calcularFlex(){
        assertEquals(408.5,combustivel.calcularFlex() ,  0.0);
        
        combustivel.setLitro(3);
        assertEquals(24.51,combustivel.calcularFlex() ,  0.0);
    }
}
