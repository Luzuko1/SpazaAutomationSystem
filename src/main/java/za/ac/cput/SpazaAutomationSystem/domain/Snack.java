package za.ac.cput.SpazaAutomationSystem.domain;

public class Snack implements Item
{
    private int snack_ID;
    private String snack_name, description;
    private double price;

    public Snack()
    {
    }

    public Snack(int snack_ID, String snack_name, String description, double price)
    {
        this.snack_ID = snack_ID;
        this.snack_name = snack_name;
        this.description = description;
        this.price = price;
    }

    public int getSnack_ID()
    {
        return snack_ID;
    }

    public void setSnack_ID(int snack_ID)
    {
        this.snack_ID = snack_ID;
    }

    public String getSnack_name()
    {
        return snack_name;
    }

    public void setSnack_name(String snack_name)
    {
        this.snack_name = snack_name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Snack{" +
                "snack_ID=" + snack_ID +
                ", snack_name='" + snack_name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public String addItem()
    {
        return null;
    }

    @Override
    public String editItem()
    {
        return null;
    }

    @Override
    public String deleteItem()
    {
        return null;
    }

    @Override
    public String updateItem()
    {
        return null;
    }

    @Override
    public String searchItem()
    {
        return null;
    }
}
