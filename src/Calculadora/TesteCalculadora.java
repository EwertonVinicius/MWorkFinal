package Calculadora;

public class TesteCalculadora {

	public static void main(String[] args) {

		CalcularImpostos calc = new CalcularImpostos();
		ICMS icms = new ICMS(10.0);
		IPI ipi = new IPI(10.0);
		ISS iss = new ISS(10.0);
		System.out.println("Valor do ICMS : " + calc.calcularImposto(icms));
		System.out.println("Valor do IPI: " + calc.calcularImposto(ipi));
		System.out.println("Valor do ISS: " + calc.calcularImposto(iss));
	}
}
