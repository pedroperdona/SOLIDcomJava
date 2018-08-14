package aula3.depois;

public class Correios implements Frete {

	public double calculaFrete(String cidade) {
		if ("SAO PAULO".equals(cidade.toUpperCase())) {
			return 15;
		}
		return 30;
	}
}