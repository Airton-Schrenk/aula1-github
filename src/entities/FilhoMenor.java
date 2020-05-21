package entities;

public class FilhoMenor extends Pensionista{
	//1.variáveis
	private Double percentualAdicional;
	//2.construtor com argumentos

	public FilhoMenor(String name, Double baseValorPensao, Double percentualAdicional) {
		super(name, baseValorPensao);
		this.percentualAdicional = percentualAdicional;
	}
	//3.gets e sets

	public Double getPercentualAdicional() {
		return percentualAdicional;
	}

	public void setPercentualAdicional(Double percentualAdicional) {
		this.percentualAdicional = percentualAdicional;
	}
	//4.Métodos
	@Override
	public Double baseFinal() {
		return getBaseValorPensao() * (0.60 + getPercentualAdicional());
	}
}
