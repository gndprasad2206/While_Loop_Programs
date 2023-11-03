//17. WAP to print all natural numbers from 1 to n. - using while loop
import java.util.Scanner;
class While_Loop_2{
  public static void main(String[] args){
    int n,i=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n value");
    n=sc.nextInt();
    while(i<=n)
    {
      System.out.print(i+",");
      i++;
    }
    
  }
}