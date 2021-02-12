package exercicio10;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import votacao.Votacao;

@RunWith(JUnitParamsRunner.class)

public class ValidarIdadePorVotacao_CSV {

	
	@Test
	@FileParameters(value = "src/test/resources/massa_de_dados.csv", mapper = CsvWithHeaderMapper.class)
	public void validarObrigatoriedadeDeVoto(String nome, int anoDeNascimento, String resultado) {
		
		Assert.assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));
	}
}
