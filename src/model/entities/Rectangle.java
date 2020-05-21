package model.entities;

import model.enums.Color;

public class Rectangle extends AbstractShape{
	
	//1.variáveis
	private Double width;
	private Double height;
	//2.construtor com argumentos
	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	//3.Getts e setts
	public Double getWidth() {
		return width;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	@Override
	public double area() {
		return width * height;
	}
}
