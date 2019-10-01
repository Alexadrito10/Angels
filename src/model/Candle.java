package model;

public class Candle {
	
	
	private String color;
	private String size ;
	private String smell;
	private double lux;
	
	public Candle(String color, String size, String smell, double lux) {
		super();
		this.color = color;
		this.size = size;
		this.smell = smell;
		this.lux = lux;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getSmell() {
		return smell;
	}
	public void setSmell(String smell) {
		this.smell = smell;
	}
	public double getLux() {
		return lux;
	}
	public void setLux(double lux) {
		this.lux = lux;
	}
	

}
