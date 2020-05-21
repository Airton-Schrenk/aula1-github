package entities;

public class Product5 {
	//vari�veis
	private String name;
	private Double price;
	//construtor vazio
	public Product5() {
	}
	//construtor com argumentos
	public Product5(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void nonStaticPriceUpdate() {
		price = price *1.1;
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
}
