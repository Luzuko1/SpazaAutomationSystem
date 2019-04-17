package za.ac.cput.SpazaAutomationSystem.domain;

public class Juice extends Drinks
{

    private String brand_nname;

    public Juice()
    {
    }

    public Juice(String brand_nname)
    {
        this.brand_nname = brand_nname;
    }

    public Juice(int drink_ID, int size, int quantity, String drink_Name, String brand_nname)
    {
        super(drink_ID, size, quantity, drink_Name);
        this.brand_nname = brand_nname;
    }

    public String getBrand_nname()
    {
        return brand_nname;
    }

    public void setBrand_nname(String brand_nname)
    {
        this.brand_nname = brand_nname;
    }

    @Override
    public String toString()
    {
        return "Juice{" +
                "brand_nname='" + brand_nname + '\'' +
                '}';
    }
}
