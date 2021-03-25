package Calculadora;

public class ISS implements Imposto {

	private double valor;

	public ISS(double valor) {
		this.valor = valor;
	}

	@Override
	public double calcularImposto() {
		return this.valor * 0.4;
	}
}
