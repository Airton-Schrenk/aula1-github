
public class Pensionista {
	private String nome;
	private Double baseValorPensao;

	// 1.construtor vazio
	public Pensionista() {
	}

	// 2.Construtor com argumentos
	public Pensionista(String nome, Double baseValorPensao) {
		this.nome = nome;
		this.baseValorPensao = baseValorPensao;
	}

	// 3.gets e sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getBaseValorPensao() {
		return baseValorPensao;
	}

	public void setBaseValorPensao(Double baseValorPensao) {
		this.baseValorPensao = baseValorPensao;
	}

	// 4.Métodos
	public double baseFinal() {
		return baseValorPensao * 0.90;
	}
}
