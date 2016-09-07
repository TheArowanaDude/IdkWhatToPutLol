import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class initials{
  public static void main(String args[]){
  Scanner input = new Scanner(System.in);
  System.out.println("Please input your name");
  String name = input.nextLine();

      int i = 0;

      while( name.charAt(i) == ' ' ){
            i++;
          }
          System.out.print(name.charAt(i));

          for(int x = i; x < name.length() - 1; x++){
              while( name.charAt(x) == ' ' ){
                x++;

                if(name.charAt(x) != ' ' ){
                  System.out.print(name.charAt(x));

                }

              }


          }



            }


            }
//update
