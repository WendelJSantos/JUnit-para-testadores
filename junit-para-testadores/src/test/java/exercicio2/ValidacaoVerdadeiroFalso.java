package exercicio2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidacaoVerdadeiroFalso {
	

	@Test
	public void testeValidacaoFalso() {
		boolean campoEstaPresente = false;
		assertTrue("Esperava que o campo estivesse falso, mas está verdadeiro.", campoEstaPresente);
	}
	
	@Test
	public void testeValidacaoVerdadeiro() {
		boolean campoEstaPresente = true;
		assertFalse("Esperava que o campo estivesse verdadeiro, mas está falso.", campoEstaPresente);
	}
	
	@Test
	public void validacaoVerdadeiro_Sucesso() {
		boolean campoEstaPresente = true;
		assertTrue(campoEstaPresente); 
	}
	
	@Test
	public void validacaoVerdadeiro_Falha() {
		boolean campoEstaPresente = true;
		assertFalse("Campo não está presente", campoEstaPresente);
	}

}
