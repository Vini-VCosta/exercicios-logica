import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste AlunoTest.
 *@author Vinicius Costa 
 * @version 1.0
 * @since 27/05/2020 - 18:10
 */
public class AlunoTest
{    
    Aluno aluno = new Aluno();

    public AlunoTest(){
       aluno.setNumeroPresencas(10);
       aluno.setTotalAulas(10);
       aluno.setNota1(10);
       aluno.setNota2(8);
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp(){
    
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown(){
    }
    
    @Test 
     public void testCalcularFrequencia(){
      assertEquals(100, aluno.calcularFrequencia());

      aluno.setNumeroPresencas(9);
      assertEquals(90, aluno.calcularFrequencia());
          
      aluno.setNumeroPresencas(5);
      assertEquals(50, aluno.calcularFrequencia());
    }
    
    @Test
    public void testCalcularMediaAritmetica(){
        assertEquals(9, aluno.calcularMediaAritmetica() , 0.0);
        
        aluno.setNota2(10);
        assertEquals(10, aluno.calcularMediaAritmetica() , 0.0);
        
        aluno.setNota2(2);
        assertEquals(6, aluno.calcularMediaAritmetica() , 0.0);
    }
}
