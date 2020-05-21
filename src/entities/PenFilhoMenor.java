//PARTE3
package entities;

public class PenFilhoMenor extends PenViuva{
	//1.VARI�VEL
	private Double percentualExced;
	//2.CONSTRUTOR VAZIO
	public PenFilhoMenor() {
		super();
	}
	//3.CONSTRUTOR COM ARGUMENTOS
	public PenFilhoMenor(Integer numFunc, String nomePens, Double cotaPens, Double percentualExced) {
		super(numFunc, nomePens, cotaPens);
		this.percentualExced = percentualExced;
	}
	//4.GETS E SETS
	public Double getPercentualExced() {
		return percentualExced;
	}
	public void setPercentualExced(Double percentualExced) {
		this.percentualExced = percentualExced;
	}
	//5.M�TODOS DE C�LCULO
	public void somaPerc(double valorSalarioBase) {
		cotaPens = valorSalarioBase * 0.70;
	}
	
}
