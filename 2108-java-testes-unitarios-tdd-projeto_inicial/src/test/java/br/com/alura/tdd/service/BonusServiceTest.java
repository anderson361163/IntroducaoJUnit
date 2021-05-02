package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();
		//BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")));
		
		//----------------------- TÉCNICA 1 -------------------------
		//assertEquals(new BigDecimal("0.00"), bonus);
		
		//----------------------- TECNICA 2 -------------------------
		/*
		try {
			service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")));
			//SE FOR EXECUTA ELE CONSIDERA COMO ERRO E MANDA UMA MENSAGEM NO CONSOLE
			fail("Não deu a exception!");
		}catch(Exception e) {
			//vai comparar se a mensagem de erro é igual
			assertEquals("Funcionário não pode ter salário maior que R$ 10.000 reais", e);
		}
		*/
		
		// ------------------- TECNICA 3 (ADQUADA) ------------------
		//Primeiro ele precisa da classe de exception
		
		
		assertThrows(IllegalArgumentException.class,
				//depois o Lambda (pré-fixo) de lambda, função
				() -> service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000"))));
		
	}
	
	//abaixo do valor
	@Test
	void bonusDeveriaSer10PorCentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("2500")));
	
		assertEquals(new BigDecimal("250.00"), bonus);
	}
	
	
	@Test
	void bonusDeveriaSerDezPorCentoParaSalarioDeExatamenteDe1000() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000.00")));
	
		assertEquals(new BigDecimal("1000.00"), bonus);
	}

}
