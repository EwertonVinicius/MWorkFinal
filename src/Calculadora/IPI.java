package Calculadora;

public class IPI implements Imposto {

	private double valor;

	public IPI(double valor) {
		this.valor = valor;
	}

	@Override
	public double calcularImposto() {
		return this.valor * 0.6;
	}
}
