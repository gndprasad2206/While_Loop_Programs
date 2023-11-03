//23. WAP to find sum of all even numbers between 1 to n.
import java.util.Scanner;
class While_Loop_8{
  public static void main(String[] args){
    int n,i=1,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    n=sc.nextInt();
    while(i<=n){
      if(i%2==0){
        sum=sum+i;
      }
      i++;
    }
    System.out.println("Addition of even numbers ="+sum);
  }
  
}