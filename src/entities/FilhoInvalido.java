package entities;

public class FilhoInvalido extends Pensionista{
	//1.variáveis
	private Double tetoRGPS;
	//2.construtor com argumentos
	public FilhoInvalido(String name, Double baseValorPensao, Double tetoRGPS) {
		super(name, baseValorPensao);
		this.tetoRGPS = tetoRGPS;
	}
	//3.gets e sets
	public Double getTetoRGPS() {
		return tetoRGPS;
	}
	public void setTetoRGPS(Double tetoRGPS) {
		this.tetoRGPS = tetoRGPS;
	}
	@Override
	public Double baseFinal() {
		if(getBaseValorPensao() > tetoRGPS) {
			return getBaseValorPensao() * 0.60;
		}else {
			return getTetoRGPS() * 0.60;
		}
	}
}
