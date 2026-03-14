public class CheckLoanEligibilty {

    int age;
    float loanAmount;

   
    CheckLoanEligibilty(int age, float loanAmount) {
        this.age = age;
        this.loanAmount = loanAmount;
    }

    void checkLoanEligibilty() {
        System.out.println("Age = " + age);

        if (age > 50) {
            System.out.println("The person is eligible for maximum loan of 5 lakh rs");
        } 
        else if (age > 30 && age <= 50) {
            System.out.println("The person is eligible for maximum loan of 3 lakh rs");
        } 
        else if (age > 20 && age <= 30) {
            System.out.println("The person is eligible for maximum loan of 2 lakh rs");
        } 
        else {
            System.out.println("Person is not eligible for loan");
        }
    }

    public static void main(String[] args) {
        CheckLoanEligibilty c1 = new CheckLoanEligibilty(30, 5);
        c1.checkLoanEligibilty();
    }
}
