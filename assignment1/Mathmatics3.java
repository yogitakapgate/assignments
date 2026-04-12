//wap to input tree numbers each of exactly two digits from user . and merge them with addition or to form a new number



import java.util.Scanner;
public class Mathmatics3 {
public static void main(String[]args){

Scanner s1 = new Scanner(System.in);
 System.out.println("Enter 1st num = "); //45
 int a = s1.nextInt();
 System.out.println("Enter 2nd num = "); //67
 int b = s1.nextInt();
 System.out.println("Enter 3rd  num = "); //89
 int c = s1.nextInt();
 
  int fd1 = a/10;
  int ld1 = a%10;
  int add1 = (fd1 + ld1);
  int fd2 = b/10;
  int ld2 = b%10;
  int add2 = (fd2 + ld2);
  int fd3 = c/10;
  int ld3 = c%10;
  int add3 = (fd3 + ld3);

  System.out.println(add1+""+add2+""+add3);

}


}