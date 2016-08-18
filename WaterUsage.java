import java.util.Scanner;
import java.util.*;

public class WaterUsage{ 
 
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int water = 0; 
                System.out.println("How many minutes do you shower in one session?");
		int minutes = input.nextInt();
		System.out.println("Minutes:" + minutes);
                water = minutes * 192 /16;
		
		System.out.println("Number of bottles used:" + water );	
	
	}



}