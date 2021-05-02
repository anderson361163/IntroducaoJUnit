package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {
	
	private ReajusteService service;
	private Funcionario funcionario;

//	@Test
//	public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar() {
//		ReajusteService service = new ReajusteService();
//		
//		Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));
//		
//		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
//		
//		//para funcionar sem nada, precisa improtar staticamente a classe Asserts
//		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
//		
//	}
//	
//	@Test
//	public void reajusteDeveriaSerDeQuinzePorCentoQuandoDesempenhoForBom() {
//		ReajusteService service = new ReajusteService();
//		
//		Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));
//		
//		service.concederReajuste(funcionario, Desempenho.BOM);
//		
//		//para funcionar sem nada, precisa improtar staticamente a classe Asserts
//		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
//		
//	}
//	
//	@Test
//	public void reajusteDeveriaSerDeVintePorCentoQuandoDesempenhoForOtimo() {
//		ReajusteService service = new ReajusteService();
//		
//		Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));
//		
//		service.concederReajuste(funcionario, Desempenho.OTIMO);
//		
//		//para funcionar sem nada, precisa improtar staticamente a classe Asserts
//		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
//		
//	}
	
	//Ele vai executar este método antes de todos os demais métodos (para evitar ficar repetindo código)
	@BeforeEach
	public void inicializaMetodo() {
		System.out.println("ANTES de CADA MÉTODO");
		this.service = new ReajusteService();
		this.funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));
	}
	
	@AfterEach
	public void finalizaMetodo() {
		System.out.println("DEPOIS de CADA MÉTODO");
	}
	
	//(estático) Vai executar apenas uma vez antes de todos os métodos
	@BeforeAll
	public static void inicioTestes() {
		System.out.println("-----------------------------------------------");
		System.out.println("ANTES de TODOS");
	}
	
	//(estático) Vai executar apenas uma vez antes de todos os métodos
	@AfterAll
	public static void fimTestes() {
		System.out.println("DEPOIS de TODOS");
		System.out.println("-----------------------------------------------");
	}
	
	
	@Test
	public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar() {
		
		
		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
		
		//para funcionar sem nada, precisa improtar staticamente a classe Asserts
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
		
	}
	
	@Test
	public void reajusteDeveriaSerDeQuinzePorCentoQuandoDesempenhoForBom() {
		
		service.concederReajuste(funcionario, Desempenho.BOM);
		
		//para funcionar sem nada, precisa improtar staticamente a classe Asserts
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
		
	}
	
	@Test
	public void reajusteDeveriaSerDeVintePorCentoQuandoDesempenhoForOtimo() {
		
		service.concederReajuste(funcionario, Desempenho.OTIMO);
		
		//para funcionar sem nada, precisa improtar staticamente a classe Asserts
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
		
	}
	
}
