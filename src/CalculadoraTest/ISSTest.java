package CalculadoraTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Calculadora.CalcularImpostos;
import Calculadora.ISS;
import Calculadora.TesteCalculadora;

public class ISSTest {

	@Test
	public void testCalcularImposto() {
		CalcularImpostos calc = new CalcularImpostos();
		TesteCalculadora test = new TesteCalculadora();

		ISS iss = new ISS(10.0);

		double valor = calc.calcularImposto(iss);
		double esperado = 4.0;
		assertEquals(esperado, valor, 0);
		System.out.println(valor);
	}
}
