//24. WAP to find sum of all odd numbers between 1 to n.
import java.util.Scanner;
class While_Loop_9{
  public static void main(String[] args){
    int n,sum=0,i=1;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the n value");
    n=sc.nextInt();
    while(n>=i){
      if(n%i==1){
        sum=sum+i;
      }
      i++;
    }
    System.out.println("The addition of Odd numbers ="+sum);
  }
}