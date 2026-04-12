/*wap to input a name of user ,validate whether name has spetial charector  or not ?
prit true if exist or print false */
import java.util.Scanner;

public class UseOfBoolean{
   public static void main(String[] args){
  Scanner s1 = new Scanner(System.in);

    System.out.println("Enter Your name =  ");
    String name =s1.nextLine();

    boolean hasspecial = false ;
    for(int i = 0 ; i<name.length() ; i++){
         char ch = name.charAt(i);

         if(!Character.isLetter(ch) && (ch !=' ')){
              hasspecial = true ;
               break ;
         }
       }
    System.out.println(hasspecial);

   }

}