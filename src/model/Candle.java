package model;

public class Candle {
	
	//+++++++++++++++++++++++++++++++++++++++++++
	//				Atributes
	//+++++++++++++++++++++++++++++++++++++++++++
	
	
	private String color;
	private double size ;
	private String smell;
	private double lux;
	
	//+++++++++++++++++++++++++++++++++++++++++++
	//				Constructor
	//+++++++++++++++++++++++++++++++++++++++++++
	
	public Candle(String color, double size, String smell, double lux) {
		
		this.color = color;
		this.size = size;
		this.smell = smell;
		this.lux = lux;
	}
	//+++++++++++++++++++++++++++++++++++++++++++
	//					Methods
	//+++++++++++++++++++++++++++++++++++++++++++
	public String toString(){
	
		String result = "/ncolor: " + color +"/nsize: "+ size + "/nsmell: " + smell + "/nlux: " + lux ;
		return result;
		
	}
	public String colorAndSmell(){
		String result =  " "+color+", "+ smell;
		return result;
	}
	
	

}
