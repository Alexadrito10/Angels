package ui; 
import model.*;
import java.util.Scanner;


public class Main{
	public Scanner sc; 
	public Legion legion;
	public static void main(String args[]){
	}

public Main(){
	sc = new Scanner(System.in);
	String n = sc.nextLine();
	String si = sc.nextLine();
	int size = Integer.parseInt(si);
	legion = new Legion();
}
}