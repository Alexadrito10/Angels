package ui; 

import model.*;
import java.util.Scanner;


public class Main{
	//+++++++++++++++++++++++++++++++++++++++++++
	//				Atributes
	//+++++++++++++++++++++++++++++++++++++++++++
	
	public Scanner sc; 
	public Legion legion;
	public String name="";
	public String photo="";
	public String prayer="";
	public int day=0;
	public int month=0;
	public String ability="";
	private String color="";
	private double size= 0.0 ;
	private String smell= "";
	private double lux =0.0;
	
	//+++++++++++++++++++++++++++++++++++++++++++
	//				Constructor
	//+++++++++++++++++++++++++++++++++++++++++++
	
	
	public Main(String legName,int legSize){
		
		sc = new Scanner(System.in);

		legion = new Legion(legName,legSize);
	}
	
	//+++++++++++++++++++++++++++++++++++++++++++
	//					Methods
	//+++++++++++++++++++++++++++++++++++++++++++
	
	
	public static void main(String[]args){
		
	    int option; 
		Scanner forLeg = new Scanner(System.in);
		
		System.out.println("/n Welcome to the angels program.");
		System.out.println("/nPlease digit the name of the legion that you are going to create");
		String legName= forLeg.next();
		forLeg.nextLine();
		System.out.println("Please digit numerically with an integer , the number of angels that you are going to create");
		int legSize= forLeg.nextInt();
		forLeg.nexLine();
		while (legSize<0){
			System.out.println("The number of angels that you are going to create must not be a negative number, please write again the number uf angels that you are going to create");
			legSize=forLeg.nextInt();
			forLeg.nexLine();
		}
		forLeg.nexLine();
		Main main = new Main(legName,legSize);
		
		int option= 2 ; 
		while(option != 0){
			showMenu();
			option = sc.nextInt(); 
			sc.nexLine();
			
			switch(option){
				case 1: 
				firstMenu();
				break;
				case 2: 
				secondMenu();
				break;
				case 3: 
				thirdMenu();
				break;
				case 4: 
				fourthMenu();
				break;
				case 5: 
				fifthMenu();
				break;
				case 6:
				sixthMenu();
				break;
				default:
				break;
			}
			
			
		} 
		
		
	}
	

	public void showMenu(){
		System.out.println("/n Please digit numerically , the number of the function that you want to use. /n<1> Enter a new archangel. /n<2> Count the archangels. /n<3> Show archangel giving a name. /n <4> Show archangel info giving an ability. /n<5> Show celebrations giving a month. /n<6> Show every celebration. /n <0>Exit. /n");
		
	}
	public void firstMenu(){
		System.out.println("/nPlease digit the name of your angel (it must finish in the syllable 'el' and be unique/n )");
		name=sc.next();
		sc.nexLine();
		boolean validSyllab=false;
		boolean dispName=false;
		
		validSyllab= legion.correctLastSyllable(name);
		dispName = legion.checkName(name);
		while(validSyllab==false||dispName==false){
			System.out.println("/nError:Your angel name is already used or does not finish in 'el' .Please digit the another name for your angel (it must finish in the syllable 'el'/n )");
			name=sc.next();
			sc.nexLine();
			
		}
		System.out.println("/nPlease digit the url of you angel");
		photo= sc.next();
		sc.nextLine();
		
		System.out.println("/nPlease digit the prayer of your angel");
		prayer=sc.next();
		sc.nexLine();
		
		System.out.println("/nPlease digit numerically the day of the celebration of your angel ( only numbers 1-30) ");
		day = sc.nextInt();
		sc.nexLine();
		while (day<=0||day>30){
			System.out.println("/nError, not a valid day.Please digit numerically the day of the celebration of your angel ( only numbers 0-30) ");
			day = sc.nextInt();
			sc.nexLine();
			
		}
		System.out.println("/nPlease digit numerically the month of the celebration of your angel(only numbers 1-12)");
		month = sc.nextInt();
		sc.nexLine();
		while (month<=0||month>12){
			System.out.println("/nError, not a valid month.Please digit numerically the month of the celebration of your angel ( only numbers 1-12) ");
			month= sc.nextInt();
			sc.nexLine();
		}
		System.out.println("/nPlease digit the ability of your angel (it must be unique/n )");
		ability=sc.next();
		sc.nexLine();
	
		boolean dispAbility=false;
		
		dispAbility= legion.checkAbility(ability);
		while(dispAbility==true){
			System.out.println("/nError:Your angel ability is already used .Please digit another ability for your angel (it must be unique )/n");
			name=sc.next();
			sc.nexLine();
			
		}
		
		System.out.println("/n Now, we are going to create the candle./n");
		System.out.println("/n Please digit the color of the candle(Ex:Red)");
		color = sc.next();
		sc.nextLine();
		System.out.println("/nPlease digit the decimal number that represent the size in cm of your candle(Ex: 40.6)/n");
		size = sc.nextDouble();
		sc.nextLine();
		System.out.println("/nPlease digit the essence or smell of the candle. /n");
		smell = sc.next();
		sc.nextLine();
		System.out.println("Please digit the representation in lux , of the luminiscence of the candle (Ex : 500.3)");
		lux = sc.nextDouble();
		sc.nexLine();
		
		legion.addArchangel(name,photo,prayer,day,month,ability,color,size,smell,lux);
		System.out.println("Angel created succesfully");
		
		
		
		
		
	}
	public void secondMenu(){
		int counter=legion.countArchangels();
			System.out.println("/n The numer of angels created are: "+ counter);
		
	}
	public void thirdMenu(){
		String compare = "";
		System.out.println("Please give us a name of an Archangel to search if exist");
		compare = sc.next();
		sc.nextLine();
		String result= legion.infoByName(compare);
		System.out.println(result);
		
		
		
		
	}
	public void fourthMenu(){
		String compare = "";
		System.out.println("Please give us an ability of an Archangel to search if exist");
		compare = sc.next();
		sc.nextLine();
		String result= legion.infoByAbility(compare);
		System.out.println(result);
		
		
	}
	public void fifthMenu(){
		int month=0;
		String result =""; 
		System.out.println("Please give us the number of the month that you are going to search");
		month=sc.nextInt();
		sc.nexLine();
		String result= legion.celebByMonth(month);
		System.out.println(result);
		
		
	}
	public void sixthMenu(){
		String result = legion.allCelebs();
	}
	
	
	
}