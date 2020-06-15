import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe Aluno
 * @author Vinícius Costa 
 * @version 1.0
 * @since 01/06/2020 - 16:20
 * category Test
 */
public class NadadorTest{
    
    Nadador nadador = new Nadador();
    
    /**
     * Construtor default para a classe de teste NadadorTest
     */
    public NadadorTest(){
       
    }

    /**
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp(){
        nadador.setIdade(15);
    }

    /**
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown(){
    }
    
    /**
     * @test Testa a classificação de idade
     */
    @Test 
    public void classificarIdade(){
        assertEquals("Juvenil" , nadador.classificarIdade());
        
        nadador.setIdade(5);
        assertEquals("Não pode ser nadador" , nadador.classificarIdade());
        
        nadador.setIdade(9);
        assertEquals("Infantil" , nadador.classificarIdade());
        
        nadador.setIdade(20);
        assertEquals("Adulto" , nadador.classificarIdade());
    }
}
