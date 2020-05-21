package entities;

public class ImportedProduct extends Product {

	private Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double baseValorPensao() {
		return (getPrice() + customsFee) * 0.6;
	}
	
	@Override
	public String priceTag() {
		return getName() 
				+ "Inválido: R$ " 
				+ String.format("%.2f", baseValorPensao())
				+ " (Teto RGPS: R$ " 
				+ String.format("%.2f", customsFee)
				+ ")";
	}
}

