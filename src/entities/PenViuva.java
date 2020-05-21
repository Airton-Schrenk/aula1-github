//PARTE2
package entities;

public class PenViuva {
	//1.VARIÁVEIS
	private Integer numFunc;
	private String nomePens;
	protected Double cotaPens;//protected para ser acessado por outra classe

	//CONSTRUTOR VAZIO
	public PenViuva() {
	}
	//CONSTRUTOR COM ARGUMENTOS
	public PenViuva(Integer numFunc, String nomePens, Double cotaPens) {
		this.numFunc = numFunc;
		this.nomePens = nomePens;
		this.cotaPens = cotaPens;
	}
	//GETS E SETS
	public Integer getNumFunc() {
		return numFunc;
	}
	public void setNumFunc(Integer numFunc) {
		this.numFunc = numFunc;
	}
	public String getNomePens() {
		return nomePens;
	}
	public void setNomePens(String nomePens) {
		this.nomePens = nomePens;
	}
	public Double getCotaPens() {
		return cotaPens;
	}
	//MÉTODO DE CÁLCULO  COTA PENSÃO
	public void valorBaseFinal(double valorSalarioBase) {
		cotaPens = valorSalarioBase * 0.60;
	}
	
}



