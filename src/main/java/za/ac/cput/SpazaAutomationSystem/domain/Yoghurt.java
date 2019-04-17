package za.ac.cput.SpazaAutomationSystem.domain;

public class Yoghurt extends Dairy
{
    private String yoghurt_Name, brand_name;
    private int size,quantity;

    public Yoghurt()
    {
    }

    public Yoghurt(String yoghurt_Name, String brand_name, int size, int quantity)
    {
        this.yoghurt_Name = yoghurt_Name;
        this.brand_name = brand_name;
        this.size = size;
        this.quantity = quantity;
    }

    public String getYoghurt_Name()
    {
        return yoghurt_Name;
    }

    public void setYoghurt_Name(String yoghurt_Name)
    {
        this.yoghurt_Name = yoghurt_Name;
    }

    public String getBrand_name()
    {
        return brand_name;
    }

    public void setBrand_name(String brand_name)
    {
        this.brand_name = brand_name;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
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
        return "Yoghurt{" +
                "yoghurt_Name='" + yoghurt_Name + '\'' +
                ", brand_name='" + brand_name + '\'' +
                ", size=" + size +
                ", quantity=" + quantity +
                '}';
    }
}
