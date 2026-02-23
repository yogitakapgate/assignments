//Write a program to input flight name ,ticket cost , and the number of seats Calculate and Show the total amount for the journey
public class CalculateTotalAmount{
    String name = "Air India ";
    float ticketCost;
    int numberOfSeats;
    
    void calculateTotalAmount(float ticketCost, int numberOfSeats ){
      this.ticketCost = ticketCost;
      this.numberOfSeats = numberOfSeats;
      System.out.println("Name of Flight  = " +name);
      System.out.println(" Ticket cost = "+ticketCost);
      System.out.println(" Number of Seats =  "+numberOfSeats);
      System.out.println(" Toatal amount per flight  =  "+ (ticketCost*numberOfSeats));
        
    }
    public static void main(String[] args) {
       CalculateTotalAmount c1 = new CalculateTotalAmount();
       c1.calculateTotalAmount(8000 , 32);
     
    
    }
}