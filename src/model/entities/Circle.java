package model.entities;

import model.enums.Color;

public class Circle extends AbstractShape{
	
	//1.variáveis
	private Double radius;
	//2.construtor com argumentos
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}
	//3.getts e setts
	public Double getRadius() {
		return radius;
	}
	public void setRadius(Double radius) {
		this.radius = radius;
	}
	//4.Métodos sobrescrito
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
