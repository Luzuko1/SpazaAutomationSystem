package za.ac.cput.SpazaAutomationSystem.domain;

public class Customer
{
    private int custName;
    private double shoppingCost;

    public Customer()
    {
    }

    public Customer(int custName, double shoppingCost)
    {
        this.custName = custName;
        this.shoppingCost = shoppingCost;
    }

    public int getCustName()
    {
        return custName;
    }

    public void setCustName(int custName)
    {
        this.custName = custName;
    }

    public double getShoppingCost()
    {
        return shoppingCost;
    }

    public void setShoppingCost(double shoppingCost)
    {
        this.shoppingCost = shoppingCost;
    }

    @Override
    public String toString()
    {
        return "Customer{" +
                "custName=" + custName +
                ", shoppingCost=" + shoppingCost +
                '}';
    }
}
