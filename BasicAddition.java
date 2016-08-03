import java.util.Scanner; 
class BasicAddition{ 
	public static void main(String[] args){ 
		Scanner calc = new Scanner(System.in);
		double FirstNum, SecondNum, sum; 
		System.out.println("Input your first number you would like to add");
		FirstNum = calc.nextDouble(); 
		System.out.println("Input the 2nd number you would like to add");
		SecondNum = calc.nextDouble();
		sum = FirstNum + SecondNum; 
		System.out.println(sum);
	
	}

}