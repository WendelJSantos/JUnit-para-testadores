package exercicio7;

import org.junit.Assert;
import org.junit.Test;

import votacao.Votacao;

public class ValidarIdadePorVotacao {
	
	
	@Test
	public void idadeIgual15Anos_NaoPodeVotar() {
		Assert.assertEquals("Maria voce nao pode votar", Votacao.podeVotar("Maria", 2006));
	}
	
	
	@Test
	public void idadeIgual16Anos_VotoFacultativo() {	
		Assert.assertEquals("Rodrigo seu voto e facultativo", Votacao.podeVotar("Rodrigo", 2005));	
	}
	
	@Test
	public void idadeIgual17Anos_VotoFacultativo() {
		Assert.assertEquals("Joao seu voto e facultativo", Votacao.podeVotar("Joao", 2004));
	}
	
	@Test
	public void idadeIgual18Anos_VotoObrigatorio() {
		Assert.assertEquals("Carla seu voto e obrigatorio", Votacao.podeVotar("Carla", 2003));
	}
	
	@Test
	public void idadeIgual25Anos_VotoObrigatorio() {		
		Assert.assertEquals("Jose seu voto e obrigatorio", Votacao.podeVotar("Jose", 1996));
	}

	@Test
	public void idadeIgual70Anos_VotoObrigatorio() {
		Assert.assertEquals("Ana seu voto e obrigatorio",Votacao.podeVotar("Ana", 1951));
	}
	
	
	@Test
	public void idadeIgual71Anos_VotoFacultativo() {	
		Assert.assertEquals("Pedro seu voto e facultativo", Votacao.podeVotar("Pedro", 1950));
	}
	
	

}
