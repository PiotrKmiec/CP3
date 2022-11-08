public class BankAccount{
    // properties
    String accountNumber;
    String mainCreditCardType;
    private double balance;
    private int creditScore;
    String fullName;

    // methods
    public String getCreditClass(){
        if(this.creditScore >= 720){
            return "Excellent";
        }else if(this.creditScore >= 690){
            return "Good";
        }else if(this.creditScore >= 630){
            return "Fair";
        }else{
            return "Poor";
        }
    }
    public void showAccountDetails(){
        System.out.print("\nAccount owner's full name: "+this.fullName+"\nAccount no.: "+this.accountNumber+"\nCredit card subscription type: "+this.mainCreditCardType+"\nCredit score class: "+this.getCreditClass());
        if(this.balance >= 0){
            System.out.print("\nAccount IS NOT currently in debt.\n");
        }else{
            System.out.print("\nAccount IS INDEED currently in debt.\n");
        }
    }
    public void showCreditScore(){
        System.out.print("\nCurrent credit score: "+this.creditScore+"\n");
    }
}