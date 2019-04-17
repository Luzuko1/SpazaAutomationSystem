package za.ac.cput.SpazaAutomationSystem.domain;

public class Soda extends Drinks
{
    private String brand_name;

    public Soda(String brand_name)
    {
        this.brand_name = brand_name;
    }

    public Soda(int drink_ID, int size, int quantity, String drink_Name, String brand_name)
    {
        super(drink_ID, size, quantity, drink_Name);
        this.brand_name = brand_name;
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
        return "Soda{" +
                "brand_name='" + brand_name + '\'' +
                '}';
    }
}