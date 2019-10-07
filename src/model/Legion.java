package model;
 

 /*
 +++++++++++++++++++++++++++++++++++
 oooooo   ooooooo   oooooo   ooooooo
 o    o   o     o	o	 o   o     o
 oooooo   o     o   oooooo   o	   o
 o        o     o   o        o	   o
 o        ooooooo   o        ooooooo
 +++++++++++++++++++++++++++++++++++
 */
public class Legion {
	
	//+++++++++++++++++++++++++++++++++++++++++++
	//				Atributes
	//+++++++++++++++++++++++++++++++++++++++++++
	
	private Archangel[] archangels;
	private String name;
	
	//+++++++++++++++++++++++++++++++++++++++++++
	//				Constructor
	//+++++++++++++++++++++++++++++++++++++++++++
	public Legion(String n,int size) {
		n = name;
		archangels = new Archangel[size+2];
	}
	
	//+++++++++++++++++++++++++++++++++++++++++++
	//					Methods
	//+++++++++++++++++++++++++++++++++++++++++++
	
	public boolean correctLastSyllable(String name){
		boolean result= false; 
		if (name.toUpperCase().endsWith("EL")){
			result= true;
			
		}
		return result;
	}
	public boolean checkName(String name){
		boolean used= false;
		for (int i=0; i<archangels.length&& used == false;i++){
			String comparing=archangels[i].getName();
			if(comparing.equalsIgnoreCase(name)){
				used=true;
			}
		}
	return used;
	
	}
	public boolean checkAbility(String ability){
		boolean used= false;
		for (int i=0; i<archangels.length&& used == false;i++){
			String comparing=archangels[i].getAbility();
			if(comparing.equalsIgnoreCase(ability)){
				used=true;
			}
		}
	return used;
	
	}
	
	
	// @authors:Alexander Samaca and Sebastian Morales
	public void addArchangel(String name, String photo, String prayer, int day, int month, String ability,String color, double size, String smell, double lux){
		int i= 2;
		
		boolean flag = false; 
		
		while (i<archangels.length && flag == false ){
			if (archangels[i] == null ){
				archangels[i]= new Archangel(name,photo,prayer,day,month,ability,color,size,smell,lux);	
				flag=true;
				System.out.println("Angel created succesfully");
			}
		}
		
	} // @authors: Alexander Samaca and Sebastian Morales
	public int countArchangels(){
		
	int i= 2;
		boolean flag = false; 
		
		while (i<archangels.length && flag == false ){
			if (archangels[i] == null ){
				flag=true;
				
			}
			else {
				i=i+1;
			}
		}
		return i;	
		
	}
	public String infoByName(String name){
		String info= "Archangel not found";
		int cont=0;
		boolean flag = false ;
		
		for (int i= 0;i<archangels.length;i++){
			
			String nameC=archangels[i].getName();
			
			if(nameC.equalsIgnoreCase(name)){
				
				info = archangels[i].toString();
			}
		}
		return info;
	}
	public String infoByAbility(String ability){
		String info= "Archangel not found";
		int cont=0;
		boolean flag = false ;
		
		for (int i= 0;i<archangels.length;i++){
			String abilityC=archangels[i].getAbility();
			if(ability.equalsIgnoreCase(abilityC)){
				
				
				info = archangels[i].toString();
			}
			
			
			
			
		}
		
		return info;
		
	}
	
	public String getName() {
		
		return name;
	}
	public String celebByMonth(int month){
		int i=0;
		String result="";
		
		while(i<archangels.length){
			int compare = archangels[i].getMonth();
			if(compare==month){
				result = archangels[i].celebsByMonth();
				
			}
			
		}
		
		return result ;
	}
	public String allCelebs(){
		int i=1;
		String result="";
	
		if (archangels[0]!=null){
				result+=archangels[i].celebsInfo();
		}
		
		while (i<archangels.length){
			if (archangels[i]!=null){
				result+=", "+archangels[i].celebsInfo();
			}
			if(archangels[archangels.length-1]!=null){
				result+=".";
			}
			i++;
		}
		return result;
	}
	
}
	

	