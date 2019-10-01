package model;

public class Archangels {
	
	private String name;
	private String photo;
	private String hPrayer;
	private String celebrationD;
	private int day;
	private int month;
	private String quirk;
	private Candle candle;
	
	
	public Archangels(String name, String photo, String hPrayer, int day, int month, String quirk,Candle ca) {
		
		this.name = name;
		this.photo = photo;
		this.hPrayer = hPrayer;
		this.day = day;
		this.month = month;
		this.quirk = quirk;
		candle = ca;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String gethPrayer() {
		return hPrayer;
	}
	public void sethPrayer(String hPrayer) {
		this.hPrayer = hPrayer;
	}
	public String getCelebrationD() {
		return celebrationD;
	}
	public void setCelebrationD(String celebrationD) {
		this.celebrationD = celebrationD;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public String getQuirk() {
		return quirk;
	}
	public void setQuirk(String quirk) {
		this.quirk = quirk;
	}


	public Candle getCandle() {
		return candle;
	}


	public void setCandle(Candle candle) {
		this.candle = candle;
	}

}
