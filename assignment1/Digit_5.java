/* Write a program to any 5-digit integer number .print the addition of the second and  second-last digit .
print the multiplication of the first and last digit */
public class Digit_5{
    int num;
    
    void num(int num){
        this.num = num ; 
        System.out.println("5-digit integer number = "+num);
        int first_num = (num/ 10000);
        int second_num = (num/ 1000)%10;
        int second_last = (num / 10)%10;
        int last_num = (num % 10);
        System.out.println("Multiplication of the first and last digit number = "+(first_num*last_num ));
        System.out.println("Adition of the second and second-last digit number. = "+( second_num +second_last));
        
        
    }
        
    
    public static void main(String[] args) {
     Digit_5 d1 = new Digit_5() ;
     d1.num(67895);
    
    }
}