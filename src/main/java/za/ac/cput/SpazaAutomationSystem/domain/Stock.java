package za.ac.cput.SpazaAutomationSystem.domain;

public class Stock
{
    private int strock_ID;
    private String stock_item;
    private int quantity;

    public Stock()
    {
    }

    public Stock(int strock_ID, String stock_item, int quantity)
    {
        this.strock_ID = strock_ID;
        this.stock_item = stock_item;
        this.quantity = quantity;
    }

    public int getStrock_ID()
    {
        return strock_ID;
    }

    public void setStrock_ID(int strock_ID)
    {
        this.strock_ID = strock_ID;
    }

    public String getStock_item()
    {
        return stock_item;
    }

    public void setStock_item(String stock_item)
    {
        this.stock_item = stock_item;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    @Override
    public String toString()
    {
        return "Stock{" +
                "strock_ID=" + strock_ID +
                ", stock_item='" + stock_item + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
