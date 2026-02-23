//Write a program to input three numbersand find the maximum
import java.util.Scanner;
public class Number_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number 1st number = ");
        int num1 = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter number 2nd number = ");
        int num2 = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter number 3rd number = ");
        int num3 = sc.nextInt();
        sc.nextLine();
        
     if(num1>num2 && num1>num3){
        System.out.println(num1 + " is greater number . ");
        }
    else if(num2>num1 && num2>num3)
     {System.out.println(num2 + " is greater number .  "); }
      
    else
    {System.out.println(num3 + " is greater number .  ");
        
    }
    }
}