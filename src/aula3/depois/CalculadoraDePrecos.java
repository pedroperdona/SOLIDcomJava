package aula3.depois;

public class CalculadoraDePrecos {

	private TabelaPreco tabelaPreco;
	private Frete frete;

	public CalculadoraDePrecos(TabelaPreco tabelaPreco, Frete frete) {
		this.tabelaPreco = tabelaPreco;
		this.frete = frete;
	}

	public double calcula(Produto produto) {

		double valorDesconto = this.tabelaPreco.calculaDesconto(produto.getValor());
		double valorFrete = this.frete.calculaFrete(produto.getCidade());

		return produto.getValor() * (1 - valorDesconto) + valorFrete;
	}
}
