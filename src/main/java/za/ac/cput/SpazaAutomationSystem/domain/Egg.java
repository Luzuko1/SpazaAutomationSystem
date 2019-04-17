package za.ac.cput.SpazaAutomationSystem.domain;

public class Egg extends Dairy
{
    private String brand_name;
    private String quantity;

    public Egg()
    {
    }

    public Egg(String brand_name, String quantity)
    {
        this.brand_name = brand_name;
        this.quantity = quantity;
    }


}
