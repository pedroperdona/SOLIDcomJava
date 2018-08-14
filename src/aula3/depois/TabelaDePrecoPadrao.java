package aula3.depois;

public class TabelaDePrecoPadrao implements TabelaPreco {
	
	public double calculaDesconto(double valor) {
		
		if (valor > 5000) {
			return 0.03;
		}

		if (valor > 1000) {
			return 0.05;
		}
		
		return 0;
	}
}
