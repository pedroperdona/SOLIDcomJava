package aula5.depois;

public class ContaDeEstudante {

	private int milhas;
	private ControladorDeSaldo controladorDeSaldo;

	public ContaDeEstudante() {
		controladorDeSaldo = new ControladorDeSaldo();
	}

	public void deposita(double valor) {
		controladorDeSaldo.deposita(valor);
		this.milhas = this.milhas + (int) valor;
	}

	public int getMilhas() {
		return milhas;
	}
}