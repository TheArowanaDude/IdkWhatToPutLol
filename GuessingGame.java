import java.util.Scanner;

public class GuessingGame{
  static int Guess;
  static Scanner input = new Scanner(System.in);
  static int Num;
  static int randomNumber;

  public static void main(String[] args){

getRandomNum();

  int guessResult = 1;
  int randomGuess = 0;

    while(guessResult != -1){
      System.out.println("Guess a number between 0 and " + Num);
      randomGuess = input.nextInt();
      guessResult = checkGuess(randomGuess);

    }
    System.out.println("Yes the number is " + randomGuess);
  }
    public static int getRandomNum(){
      System.out.println("Pick a number for this guessing game");
       Num = input.nextInt();
      randomNumber = (int)(Math.random() * (Num));
      return randomNumber;
    }

    public static int checkGuess(int guess){
      if(guess == randomNumber){
          return -1;
}
    else{
      return guess;

    }
      }

}
