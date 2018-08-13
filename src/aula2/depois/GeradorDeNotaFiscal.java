package aula2.depois;

import java.util.List;

public class GeradorDeNotaFiscal {

	private List<AcaoAposGerarNotaFiscal> acoesAposGerarNotaFiscal;

	public GeradorDeNotaFiscal(List<AcaoAposGerarNotaFiscal> acoesAposGerarNotaFiscal) {
		this.acoesAposGerarNotaFiscal = acoesAposGerarNotaFiscal;
	}

	public NotaFiscal gera(Fatura fatura) {

		NotaFiscal notaFiscal = new NotaFiscal(fatura.getValorMensal(), impostoSimplesSobreO(fatura.getValorMensal()));

		for (AcaoAposGerarNotaFiscal acaoAposGerarNotaFiscal : acoesAposGerarNotaFiscal) {
			acaoAposGerarNotaFiscal.executa(notaFiscal);
		}

		return notaFiscal;
	}

	private double impostoSimplesSobreO(double valor) {
		return valor * 0.06;
	}
}
