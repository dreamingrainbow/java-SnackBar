public class Snack
{
    private int id;
    public String name;
    public int quantity;
    public double cost;
    public int vendingMachineID;

    public void setName(String name)
    {
        this.name = name;
        return this;
    }

    public String getName()
    {
        return this.name;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    public int addInventory(int qty)
    {
        this.quantity += qty;
    }

    public int getCost(int qty)
    {
        return this.cost * qty;
    }
}