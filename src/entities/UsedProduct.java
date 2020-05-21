package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public Double baseValorPensao() {
		return getPrice()  * 0.7;
	}
	
	@Override
	public String priceTag() {
		return getName() 
				+ "Filho Menor:  R$ " 
				+ String.format("%.2f", baseValorPensao())
				+ " (Manufacture date: "
				+ sdf.format(manufactureDate)
				+ ")";
	}
}

