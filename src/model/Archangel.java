package model;

public class Archangel {
	
	//+++++++++++++++++++++++++++++++++++++++++++
	//				Atributes
	//+++++++++++++++++++++++++++++++++++++++++++
	
	
	private String name;
	private String photo;
	private String prayer;
	private int day;
	private int month;
	private String ability;
	private Candle candle;
	
	//+++++++++++++++++++++++++++++++++++++++++++
	//				Constructor
	//+++++++++++++++++++++++++++++++++++++++++++
	public Archangel(String name, String photo, String prayer, int day, int month, String ability,String color, double size, String smell, double lux) {
		
		this.name = name;
		this.photo = photo;
		this.prayer = prayer;
		this.day = day;
		this.month = month;
		this.ability = ability;
		candle = new Candle(color,size,smell,lux);
	}
	
	//+++++++++++++++++++++++++++++++++++++++++++
	//					Methods
	//+++++++++++++++++++++++++++++++++++++++++++
	public String getName() {
		return name;
	}

	public String getPhoto() {
		return photo;
	}

	public String getPrayer() {
		return prayer;
	}


	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public String getAbility() {
		return ability;
	}
	public String toString(){
		String result="name: "+ name + "/nphoto: "+ photo  + "/nprayer:" + prayer + "/nday: "+ day + "/nmonth: "+ month + "/nability"+ ability + candle.toString();  
		return result; 
	}



	public Candle getCandle() {
		return candle;
	}


	public void setCandle(Candle candle) {
		this.candle = candle;
	}

}
