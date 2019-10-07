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
	private String monthS;
	
	
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
		monthS= monthInString(day);
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
		String result="name: "+ name + "/nphoto: "+ photo  + "/nprayer:" + prayer + "/nday: "+ day + "/nmonth: "+ month + "/nability: "+ ability + candle.toString();  
		return result; 
	}
	public String celebsByMonth(){
		
		String result= name+", "+day+candle.colorAndSmell();
		
		return result;
		
	}
	public String celebsInfo(){
		String result ="";
		result = name+": " + day+ " de "+ monthS;
		
		return result;
		
	}

	public Candle getCandle() {
		return candle;
	}


	public void setCandle(Candle candle) {
		this.candle = candle;
	}
	public String monthInString(int i){
		String result="";
		
		switch(i){
			
			case 1: result="January";
					break;
			
			case 2: result="February";
					break;
			case 3: result="March";
					break;
			case 4: result="April";
					break;
			case 5: result="May";
					break;
			case 6: result="June";
					break;
			case 7: result="July";
					break;		
			case 8: result="August";
					break;
			case 9: result="September";
					break;
			case 10: result="October";
					break;
			case 11: result="November";
					break;		
			case 12: result="December";
					break;		
			default: break;		
			
		}
		return result;
		
	}

}