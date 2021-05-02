package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			//valor = BigDecimal.ZERO; //o correto � retornar uma exception
			//O exception abaixo � uma nova implementa��o que gera um Exception de argumento inv�lido
			throw new IllegalArgumentException("Funcion�rio n�o pode ter sal�rio maior que R$ 10.000 reais");
		}
		return valor.setScale(2, RoundingMode.HALF_UP);
	}

}
