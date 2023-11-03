
//Example for while loop 
import java.util.Scanner;

class While_Loop {
    public static void main(String[] args) {
        int number, sum = 0, digit = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        number = sc.nextInt();
        while (number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.print("Sum of the digit is =" + sum);
    }
}