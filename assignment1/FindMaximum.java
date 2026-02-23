import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter a number: ");
        int num2 = sc.nextInt();
         
        if(num1>num2)
        System.out.println(num1 + " is greater number than "+num2);
        else
        System.out.println(num2 + " is greater number than "+num1); 
        
    }
}