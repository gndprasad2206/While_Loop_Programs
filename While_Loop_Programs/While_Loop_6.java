//21. WAP to print all odd number between 1 to 100.
import java.util.Scanner;
class While_Loop_6{
  public static void main(String[] args){
    int i=1;
    while(i<=100){
      if(i%2==1){
        System.out.print(i+" ");
      }
      i++;
    }
  }
}