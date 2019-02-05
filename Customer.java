public class Customer
{
    private int id;
    private string name;
    private double cashOnHand;

    public double getCashOnHand()
    {
        return this.cashOnHand;
    }

    public void addCashOnHand(double cash)
    {
        this.cashOnHand += cash;
        return this;
    }

    public double makePurchase(double price, int qty)
    {
        if(price*qty <= this.cashOnHand)
        {
            this.cashoOnHand -= price*qty;
            return true;
        }
        return false;
    }
    
    public void main() 
    {
        id++;
    }
}