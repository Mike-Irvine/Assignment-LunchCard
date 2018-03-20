public class LyyraCard {
    
    private double balance;
    
    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }
    
    public String toString() {
        return "The card has " + this.balance + " euros";
    }
    
    public void payEconomical() {
        // Economy meal price €2.50
        if (this.balance >= 2.5) {
            this.balance -= 2.5;
        }
    }
    
    public void payGourmet() {
        // Gourmet meal price €4.00
        if (this.balance >= 4.0) {
            this.balance -= 4.0;
        }
    }
    
    public void loadMoney(double amount) {
        if (amount > 0) {
            
            this.balance += amount;
            // Maximum card balance = €150
            if ( this.balance > 150 ) {
                this.balance = 150;
            }
        }
    }
}
