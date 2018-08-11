package aula1.depois;

public enum Cargo {

	 DESENVOLVEDOR(new DezOuVintePorcento()),
	 DBA(new QuinteOuVinteECincoPorcento()),
	 TESTER(new QuinteOuVinteECincoPorcento());
	 
	 private RegraDeCalculo regra;
	 
	 Cargo(RegraDeCalculo regra) {
		 this.regra = regra;
	 }

	public RegraDeCalculo getRegra() {
		return regra;
	}
	 
}
