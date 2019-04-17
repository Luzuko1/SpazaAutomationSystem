package za.ac.cput.SpazaAutomationSystem.domain;

public class Milk extends Dairy
{
    private String milk_name;
    private String brand_name;

    public Milk()
    {
    }

    public Milk(String milk_name, String brand_name)
    {
        this.milk_name = milk_name;
        this.brand_name = brand_name;
    }

    public String getMilk_name()
    {
        return milk_name;
    }

    public void setMilk_name(String milk_name)
    {
        this.milk_name = milk_name;
    }

    public String getBrand_name()
    {
        return brand_name;
    }

    public void setBrand_name(String brand_name)
    {
        this.brand_name = brand_name;
    }

    @Override
    public String toString()
    {
        return "Milk{" +
                "milk_name='" + milk_name + '\'' +
                ", brand_name='" + brand_name + '\'' +
                '}';
    }
}
