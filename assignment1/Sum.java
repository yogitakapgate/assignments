/*write a program to input any  two numbers .define a function called adition to calculate the sum and return from the function.*/
import java.util.Scanner;
public class Sum{
    
    static int addition(int num1 , int num2){
        int sum = num1 + num2;
        return sum;
        }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter a 1st number = ");
         int num1 = sc.nextInt();
         
         System.out.println("Enter a 2nd number = ");
          int num2 = sc.nextInt();
          
          
          int result = addition(num1,num2);
          System.out.println("sum  = "+result);
          
           }
}