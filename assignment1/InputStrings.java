/* write a program to input any 5 string values from the command line. 
show them using a for loop in the main() function*/
/*Hint -> define function input inputstrings() 5 strings values .then use a loop to display these values in the main() funtion. make sure to handle user input appropriately*/

public class InputStrings{

static String[] inputStrings(String[] args){
    
    String[] arr = new String[5]; // ...declaration of arry
    for (int i = 0 ; i < arr.length ;i++)
    arr[i] = args[i];
    return arr;
    
}
public static void main(String[] args){
    if(args.length<5){
        System.out.println("please enter the 5 string values of array");
    return ;}
     
System.out.println( " Enter 5 values =" );   
  String[] values = inputStrings(args);
  for(int i = 0 ; i < values.length ; i++)
      
    System.out.println( values[i] );
}
    }

