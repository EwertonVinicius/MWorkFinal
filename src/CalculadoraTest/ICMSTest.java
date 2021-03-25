package CalculadoraTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Calculadora.CalcularImpostos;
import Calculadora.ICMS;
import Calculadora.TesteCalculadora;

public class ICMSTest {

	@Test
	public void testCalcularImposto() {
		CalcularImpostos calc = new CalcularImpostos();
		TesteCalculadora test = new TesteCalculadora();

		ICMS icms = new ICMS(10.0);

		double valor = calc.calcularImposto(icms);
		double esperado = 1.2;
		assertEquals(esperado, valor, 0);
		System.out.println(valor);
	}
}
