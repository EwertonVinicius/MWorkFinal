package CalculadoraTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Calculadora.CalcularImpostos;
import Calculadora.IPI;
import Calculadora.TesteCalculadora;

public class IPITest {

	@Test
	public void testCalcularImposto() {
		CalcularImpostos calc = new CalcularImpostos();
		TesteCalculadora test = new TesteCalculadora();

		IPI ipi = new IPI(10.0);
		double valor = calc.calcularImposto(ipi);
		double esperado = 6.0;
		assertEquals(esperado, valor, 0);
		System.out.println(valor);
	}
}
