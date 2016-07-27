import java.util.Scanner; 

public class HelloMemon{ 

public static void main(String args[]){ 
	String name = "";
	String backward = ""; 
	Scanner input = new Scanner(System.in); 
	System.out.println("What is your name?"); 	
	name = input.nextLine(); 
	int length = name.length() - 1; 

	for(int i = length; i >= 0; i--)
	backward += name.charAt(i); 
	System.out.println("Hello " + backward + "!!!"); 
}

}	

	 
