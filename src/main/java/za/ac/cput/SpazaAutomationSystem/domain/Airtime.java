package za.ac.cput.SpazaAutomationSystem.domain;

public class Airtime extends Prepaid
{
    private int airtimeID;
    private String brand;
    private double amount;
    private double pricae;


    private Airtime()
    {
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
}
