package aula5.depois;

public class ContaComum {
	
	private ControladorDeSaldo controladorDeSaldo;

	public ContaComum() {
		controladorDeSaldo = new ControladorDeSaldo();
	}

	public void deposita(double valor) {
		controladorDeSaldo.deposita(valor);;
	}

	public void saca(double valor) {
		controladorDeSaldo.saca(valor);
	}

	public void rende() {
		controladorDeSaldo.rende(0.01);
	}

	public double getSaldo() {
		return controladorDeSaldo.getSaldo();
	}
}