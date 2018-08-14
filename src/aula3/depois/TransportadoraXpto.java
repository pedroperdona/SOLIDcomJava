package aula3.depois;

public class TransportadoraXpto implements Frete {

	public double calculaFrete(String cidade) {
		if ("SAO PAULO".equals(cidade.toUpperCase())) {
			return 18;
		}
		return 40;
	}
}
