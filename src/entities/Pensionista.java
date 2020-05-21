package entities;

public abstract class Pensionista {
	//1.variáveis
	private String name;
	private Double baseValorPensao;
	
	//2.construtor com argumentos
	public Pensionista(String name, Double baseValorPensao) {
		this.name = name;
		this.baseValorPensao = baseValorPensao;
	}
	//3.gets e sets
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBaseValorPensao() {
		return baseValorPensao;
	}

	public void setBaseValorPensao(Double baseValorPensao) {
		this.baseValorPensao = baseValorPensao;
	}
	
	//4.Métodos
	public abstract Double baseFinal();
}
