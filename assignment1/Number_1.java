//Write a program to input a nnumber and check whether it is even or odd 
import java.util.Scanner;
public class Number_1 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number 1st number =  ");
        int num1 = sc.nextInt();
        sc.nextLine();
        
        if(num1%2 == 0){
            System.out.print(num1 +" is an Even number ");}
        else
         {System.out.print(num1 + " is an odd number ");}
            
        
    }
}