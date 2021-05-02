package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			//valor = BigDecimal.ZERO; //o correto é retornar uma exception
			//O exception abaixo é uma nova implementação que gera um Exception de argumento inválido
			throw new IllegalArgumentException("Funcionário não pode ter salário maior que R$ 10.000 reais");
		}
		return valor.setScale(2, RoundingMode.HALF_UP);
	}

}
