package entities;

public class Product7 {
	//variáveis
	private String name;
	private Double price;
	//construtor vazio
	public Product7() {
	}
	//construtor com argumentos
	public Product7(String name, Double price) {
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
	public static String staticUpperCaseName(Product7 p) {
		return p.getName().toUpperCase();
	}
	public String nonStaticUpperCaseName() {
		return name.toUpperCase();
	}
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
}
