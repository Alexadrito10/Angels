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
		if (name.toUpperCase().endsWith("EL")|){
			boolean result= true;
			
		}
		return result;
	}
	public boolean checkName(String name){
		boolean used= false;
		for (int i=0; i<archangels.length&& boolean== false;i++){
			String comparing=archangels[i].getName();
			if(comparing.equalsIgnoreCase(name)){
				used=true;
			}
		}
	return used;
	
	}public boolean checkAbility(String ability){
		boolean used= false;
		for (int i=0; i<archangels.length&& boolean== false;i++){
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
				archangel[i]= new Archangel(name,photo,prayer,day,month,ability,color,size,smell,lux);	
				flag=true;
			}
		}
		
	} // @authors: Alexander Samaca and Sebastian Morales
	public void countArchangels(){
	int i= 2;
		boolean flag = false; 
		
		while (i<archangels.length && flag == false ){
			if (archangels.length[i] == null ){
				flag=true;
			}
			else {
				i=i+1;
			}
			return i;	
		}
		
		
	}
	public String infoByName(String name){
		String info= "Archangel not found";
		int cont=0;
		boolean flag = false ;
		
		for (int i= 0;i<archangels.length;i++){
			String nameC=archangels[i].getName();
			if(nameC.equalsIgnoreCase(name)){
				
				info = archangel[i].toString();
			}
			
			
			
			
		}
		
		return info;
		
	}
	public String infoByAbility(String name){
		String info= "Archangel not found";
		int cont=0;
		boolean flag = false ;
		
		for (int i= 0;i<archangels.length;i++){
			String abilityC=archangels[i].getAbility();
			if(nameC.equalsIgnoreCase(abilityC)){
				
				
				info = archangel[i].toString();
			}
			
			
			
			
		}
		
		return info;
		
	}
	
	public String getName() {
		
		return name;
	}
	public celebByMonth(){
		
	}
}
	