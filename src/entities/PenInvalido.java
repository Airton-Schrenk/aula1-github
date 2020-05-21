//PARTE4
package entities;

public class PenInvalido extends PenViuva{
	//1.VARIÁVEL
	private Double valorAdicional;
	//2.CONSTRUTOR VAZIO
	public PenInvalido() {
		super();
	}
	//3.CONSTRUTOR COM ARGUMENTOS
	public PenInvalido(Integer numFunc, String nomePens, Double cotaPens, Double valorAdicional) {
		super(numFunc, nomePens, cotaPens);
		this.valorAdicional = valorAdicional;
	}
	//4. GETS E SETS
	public Double getValorAdicional() {
		return valorAdicional;
	}
	public void setValorAdicional(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	//5.MÉTODOS
	public void acrescimoRGPS() {
		cotaPens = cotaPens + valorAdicional;
	}
	
}