//Write to input  a 3 digit number and check whether it is palindrome or not
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number 1st number = ");
        int num1 = sc.nextInt();
        sc.nextLine();
        
        int original = num1;
        int reverse = 0 ;
        
        while(num1 != 0){
        int digit = num1 %10;
        reverse = reverse*10+digit;
        num1= num1 / 10;
    }
    if(original == reverse){
        System.out.println(original+ " is a palindrome. ");
        
    }
    else
     {System.out.println(original+ " is not  a palindrome. "); }
        
    }
}