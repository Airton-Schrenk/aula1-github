package entities;

public class Viuva extends Pensionista{
	//1.variáveis
	private Double percentualViuva;
	//2.construtor com argumentos
	public Viuva(String name, Double baseValorPensao, Double percentualViuva) {
		super(name, baseValorPensao);
		this.percentualViuva = percentualViuva;
	}
	//3. gets e sets
	public Double getPercentualViuva() {
		return percentualViuva;
	}
	public void setPercentualViuva(Double percentualViuva) {
		this.percentualViuva = percentualViuva;
	}
	//4.Métodos
		@Override
		public Double baseFinal() {
			return getBaseValorPensao() * 0.60;
		}
}
