import java.util.*;
public class Car implements ShowInfo{
	private String name;
	private String color;
	private double price;
	public Car(String name, String color, double price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrise(double price) {
		this.price = price;
	}
	@Override
	public void Show() {
		System.out.printf("Name: %s\tColor: %s\tPrice: %d\n", name, color, price);
		
	}
	
}
