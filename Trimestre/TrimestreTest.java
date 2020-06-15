import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe Aluno
 * @author Vinícius Costa 
 * @version 1.0
 * @since 01/06/2020 - 13:30
 * category Test
 */
public class TrimestreTest{
    
    Trimestre trimestre = new Trimestre();
    
    /**
     * Construtor default para a classe de teste TrimestreTest
     */
    public TrimestreTest(){
        trimestre.setMes("Janeiro");
    }

    /**
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp(){
    }

    /**
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown(){
    }
    
    /**
     * @test Testa se o mes bate com o trimestre
     */
    @Test 
    public void verificarTrimestre(){
        assertEquals("1 Trimestre", trimestre.verificarTrimestre());
        
        trimestre.setMes("Fevereiro");
        assertEquals("1 Trimestre", trimestre.verificarTrimestre());
        
        trimestre.setMes("Março");
        assertEquals("1 Trimestre", trimestre.verificarTrimestre());
        
        trimestre.setMes("Abril");
        assertEquals("2 Trimestre", trimestre.verificarTrimestre());
        
        trimestre.setMes("Maio");
        assertEquals("2 Trimestre", trimestre.verificarTrimestre());
        
        trimestre.setMes("Junho");
        assertEquals("2 Trimestre", trimestre.verificarTrimestre());
        
        trimestre.setMes("Julho");
        assertEquals("3 Trimestre", trimestre.verificarTrimestre());
        
        trimestre.setMes("Agosto");
        assertEquals("3 Trimestre", trimestre.verificarTrimestre());
        
        trimestre.setMes("Setembro");
        assertEquals("3 Trimestre", trimestre.verificarTrimestre());
        
        trimestre.setMes("Outubro");
        assertEquals("4 Trimestre", trimestre.verificarTrimestre());
        
        trimestre.setMes("Novembro");
        assertEquals("4 Trimestre", trimestre.verificarTrimestre());
        
        trimestre.setMes("Dezembro");
        assertEquals("4 Trimestre", trimestre.verificarTrimestre());
        
        trimestre.setMes("Cabril");
        assertEquals("Esse mês não existe!", trimestre.verificarTrimestre());
    }
}
