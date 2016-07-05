import java.util.Scanner; 
import javax.swing.*;
public class Hello123	{ 
	public static void main(String args[]){ 
	String option = JOptionPane.showInputDialog(null, "Type \"pyramid\" if you want your name in a pyramid or type \"backwards\" if you want your name backwards");	
	if(option.equals("pyramid")||option.equals("pyramid ")){ 
	pyramid(); 
	}	
	if(option.equals("backwards") || option.equals("backwards ")){
	backwards(); 
	}
	else{ 
		System.out.println("Please jump off a cliff you incompetent piece of crap");
		}
	}
	public static void pyramid(){ 
	String pyramid = JOptionPane.showInputDialog(null, "Input whatever you want to be in a word pyramid"); 
	String lol = ""; 	
	System.out.println("Input whatever you want in a word pyramid"); 		
	int length = pyramid.length() - 1; 
	for(int i = 0; i <= length; i++){ 
	lol += pyramid.charAt(i); 
	System.out.println(lol); 
} 
} 
public static void backwards(){
	String name = JOptionPane.showInputDialog(null, "Type your name and it will be backwards");
	String backward = ""; 	 
	int length = name.length() - 1; 
	for(int i = length; i >= 0; i--)
	backward += name.charAt(i); 
	System.out.println("Hello " + backward + "!!!"); 
}	 
	}