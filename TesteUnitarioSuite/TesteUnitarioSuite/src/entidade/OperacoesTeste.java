package entidade;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class OperacoesTeste {

	Operacoes objetoOp;
	@Before
	public void setUp() throws Exception {
		objetoOp = new Operacoes();
		
	}

	@Test
	public void testeMaiorValor() {
		// assertEquals("TEXTO ", valor esperado, objeto.m�todo(lista de par�metros), delta);
		assertEquals("TESTE 1:", 16, objetoOp.maiorValor(16, 9), 0); //delta = varia��o no valor.
	}

	@Test
	public void testeMenorValor() {
		/*
		assertTrue("TEXTO ", valor esperado ==  objeto.m�todo(lista de par�metros)); <- assertTrue n�o aceita varia��o (delta).
		assertFalse("TEXTO ", valor esperado ==  objeto.m�todo(lista de par�metros)); <- assertFalse n�o aceita varia��o (delta).
		*/
		assertTrue("TESTE 2: ", objetoOp.menorValor(16, 9) == 9);	
	}
	
	@Test
	public void testeProduto() {
		assertFalse("TESTE 3: ", objetoOp.produto(16, 5) == 81);
	}	
}
