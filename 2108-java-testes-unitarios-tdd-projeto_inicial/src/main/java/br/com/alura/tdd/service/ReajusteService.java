package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
		
		//Uma t�tica para o c�digo ficar melhor � usar os ENUNS
		//if(desempenho == Desempenho.A_DESEJAR) {
			BigDecimal percentual = desempenho.percentualReajuste();
			BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
			funcionario.reajustarSalario(reajuste);
		//}
		
	}

}
