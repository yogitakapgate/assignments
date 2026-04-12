//wap to input any 5 digit number from user. replace 3rd digit with its square 
import java.util.Scanner;
public class Mathmatics2{
     public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);

        
        System.out.println("Enter 5-digit numbers = ");
         int a = s1.nextInt();
       System.out.println(" 5-digit numbers = "); //34567
    
        int b = a/100;
        int td = b%10;
    
        System.out.println(34 + ""+ (td*td)+""+67);


    }

}