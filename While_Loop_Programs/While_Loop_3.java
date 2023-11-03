//18. WAP to print all natural numbers in reverse (from n to 1). -     using while loop
import java.util.Scanner;
class While_Loop_3{
  public static void main(String[] args){
    int n,i=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n value");
    n=sc.nextInt();
    while(n>=i){
      System.out.print(n+" ");
      n--;
    }
  }
}