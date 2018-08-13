package aula2.depois;

public class NotaFiscalDao implements AcaoAposGerarNotaFiscal {

	public void executa(NotaFiscal nf) {
		System.out.println("salva nf no banco");
	}
}