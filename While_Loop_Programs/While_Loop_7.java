//22. WAP to find sum of all natural numbers between 1 to n.
import java.util.Scanner;
class While_Loop_7{
  public static void main(String[] args){
    int n,i=1,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n value");
    n=sc.nextInt();
    while(i<=n)
    {
      sum=sum+i;
      i++;
    }
    System.out.println("addition of n naturals numbers ="+sum);
  }
}