import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Vinícius Costa 
 * @version 1.0
 * @since 27/05/2020 - 22:00
 */
public class MesTest{
   
    Mes mes = new Mes();
    
    public MesTest(){
    mes.setNumeroMes(1);
    }

    /**
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp()
    {
    }

    /**
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown(){
    }
    
    /**
     *Utilizada para testar a conexão do numero com o mes correspondente  
     */
    @Test 
    public void testVerificarMes(){
        assertEquals("Janeiro", mes.verificarMes());
        
        mes.setNumeroMes(2);
        assertEquals("Fevereiro", mes.verificarMes());
        
         mes.setNumeroMes(3);
        assertEquals("Março", mes.verificarMes());
        
        mes.setNumeroMes(4);
        assertEquals("Abril", mes.verificarMes());
        
        mes.setNumeroMes(5);
        assertEquals("Maio", mes.verificarMes());
        
        mes.setNumeroMes(6);
        assertEquals("Junho", mes.verificarMes());
        
        mes.setNumeroMes(7);
        assertEquals("Julho", mes.verificarMes());
        
       mes.setNumeroMes(8);
        assertEquals("Agosto", mes.verificarMes());
        
        mes.setNumeroMes(9);
        assertEquals("Setembro", mes.verificarMes());
        
       mes.setNumeroMes(10);
        assertEquals("Outubro", mes.verificarMes());
        
       mes.setNumeroMes(11);
        assertEquals("Novembro", mes.verificarMes());
        
       mes.setNumeroMes(12);
        assertEquals("Dezembro", mes.verificarMes());
        
       mes.setNumeroMes(0);
        assertEquals("Esse mês não existe!", mes.verificarMes());
    }
}
