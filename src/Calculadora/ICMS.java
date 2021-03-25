package Calculadora;

public class ICMS implements Imposto {

	private double valor;

	public ICMS(double valor) {
		this.valor = valor;
	}

	@Override
	public double calcularImposto() {
		return this.valor * 0.12;
	}
}
