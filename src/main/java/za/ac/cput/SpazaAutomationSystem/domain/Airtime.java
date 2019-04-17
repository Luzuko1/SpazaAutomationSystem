package za.ac.cput.SpazaAutomationSystem.domain;

public class Airtime extends Prepaid
{
    private int airtimeID;
    private String brand;
    private double amount;
    private double pricae;


    private Airtime(Airtime.Builder builder)
    {
        this.airtimeID = builder.airtimeID;
        this.amount = builder.amount;
    }

    private Airtime(int airtimeID, String brand, double amount, double pricae)
    {
        this.airtimeID = airtimeID;
        this.brand = brand;
        this.amount = amount;
        this.pricae = pricae;
    }

    public int getAirtimeID()
    {
        return airtimeID;
    }

    public void setAirtimeID(int airtimeID)
    {
        this.airtimeID = airtimeID;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public double getPricae()
    {
        return pricae;
    }

    public void setPricae(double pricae)
    {
        this.pricae = pricae;
    }

    @Override
    public String toString()
    {
        return "Airtime{" +
                "airtimeID=" + airtimeID +
                ", brand='" + brand + '\'' +
                ", amount=" + amount +
                ", pricae=" + pricae +
                '}';
    }


    public static class Builder{

        private int airtimeID;
        private double amount;

        public Airtime.Builder AirtimeID(int airtimeID)
        {
            this.airtimeID = airtimeID;
            return this;
        }

        public Airtime.Builder amount(double amount) {
            this.amount = amount;
            return this;
        }

        public Airtime build() {
            return new Airtime(this);
        }

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
