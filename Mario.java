import java.util.Scanner;

public class Mario{
	public static void main(String[] args){
		numCheck();

		}

		public static void numCheck(){
			Scanner input = new Scanner(System.in);
			System.out.println("Please input the height you want your half pyramid to be, it must be a whole number and 23 or less");
		 	double height = input.nextDouble();

			if((height > 23) || !(height % 1 == 0)){
			while((height > 23) || !(height%1 ==0)){
			System.out.println("Try again");
			height = input.nextDouble();
}
}
			int height1 = (int)height;
				System.out.println("Height: " + height1);



				for(int rows = 1; rows <= height1; rows++){
									for(int space = (height1 - rows); space > 0; space--){
									System.out.print(" ");
								}

								for (int hash = 0; hash <= rows ; hash++){
									System.out.print("#");
									}
									System.out.print("\n");

					}
}















	}
