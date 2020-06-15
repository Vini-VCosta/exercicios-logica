import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste AlunoTest.
 *@author Vinicius Costa 
 * @version 1.0
 * @since 27/05/2020 - 19:00
 */
public class AlunoTest
{    
    Aluno aluno = new Aluno();

    public AlunoTest(){
       
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp(){
       aluno.setNumeroPresencas(10);
       aluno.setTotalAulas(10);
       aluno.setNota1(10);
       aluno.setNota2(8);
    
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
        assertEquals("Aprovado", aluno.calcularMediaAritmetica());
        
        aluno.setNota2(10);
        assertEquals("Aprovado", aluno.calcularMediaAritmetica());
        
        aluno.setNota2(0);
        assertEquals("Reprovado", aluno.calcularMediaAritmetica());
    }
    
    @Test
    public void testVerificarMediaEFrequencia(){
        assertEquals("Aprovado", aluno.verificarMediaEFrequencia());
        
        aluno.setNota2(10);
        aluno.setNumeroPresencas(5);
        assertEquals("Reprovado", aluno.verificarMediaEFrequencia());
        
        aluno.setNota2(0);
        aluno.setNumeroPresencas(8);
        assertEquals("Reprovado", aluno.verificarMediaEFrequencia());
        
        aluno.setNota2(0);
        aluno.setNumeroPresencas(2);
        assertEquals("Reprovado", aluno.verificarMediaEFrequencia());
    }
    
    @Test
    public void testVerificarConceito(){
        assertEquals("Conceito A", aluno.verificarConceito());
        
        aluno.setNota2(4);
        assertEquals("Conceito B", aluno.verificarConceito());
        
        aluno.setNota2(2);
        assertEquals("Conceito C", aluno.verificarConceito());
        
        aluno.setNota1(1);
        aluno.setNota2(2);
        assertEquals("Conceito D", aluno.verificarConceito());
    }
}
