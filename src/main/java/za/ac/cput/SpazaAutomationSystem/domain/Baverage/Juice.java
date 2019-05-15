package za.ac.cput.SpazaAutomationSystem.domain.Baverage;

public class Juice extends Drinks
{

    private String brand_nname;

    public Juice()
    {
    }
    private Juice(Juice.Builder builder)
    {
        this.brand_nname = builder.brand_name;
//        this.electricity_Company = builder.electricity_Company;
//        this.amount = builder.amount;
//        this.electricity_Price = builder.electricity_Price;
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

    public static class Builder{

        private String brand_name;

        public Juice.Builder brand_name(String brand_name)
        {
            this.brand_name = brand_name;
            return this;
        }


        public Juice build() {
            return new Juice(this);
        }

    }
    @Override
    public String toString()
    {
        return "Juice{" +
                "brand_nname='" + brand_nname + '\'' +
                '}';
    }
}
