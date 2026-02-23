//Write a program to input person's income amount ,monthly expences such as phone bill ,electricity bill ,and travelling Calculate and show much the person saved after paying expences
public class CalculateSaving{
    float income;
    float phoneBill;
    float electrycitybill;
    float travelExpences;
    
    
    void calculateSaving(float income, float phoneBill ,float electrycitybill,float travelExpences)
    {
      this.income = income;
      this.phoneBill = phoneBill;
      this.electrycitybill =electrycitybill;
      this.travelExpences = travelExpences;
      
      
      System.out.println("Income  = " +income);
      System.out.println("PhoneBill  = "+phoneBill);
      System.out.println("Electrycitybill=  "+electrycitybill);
       System.out.println("Travel Expences = "  + travelExpences);
      System.out.println(" Toatal savings =  "+ (income - (phoneBill +electrycitybill+travelExpences)));
        
    }
    public static void main(String[] args) {
      CalculateSaving s1 = new CalculateSaving(); 
     s1.calculateSaving(30000 ,350 , 250 , 500 );
    
    }
}