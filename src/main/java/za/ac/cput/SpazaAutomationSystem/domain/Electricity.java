package za.ac.cput.SpazaAutomationSystem.domain;

public class Electricity extends Prepaid
{
    private int electricity_ID;
    private String electrictrity_Company;
    private double amount;
    private double electricity_Price;

    private Electricity()
    {
    }

    private Electricity(int electricity_ID, String electrictrity_Company, double amount, double electricity_Price)
    {
        this.electricity_ID = electricity_ID;
        this.electrictrity_Company = electrictrity_Company;
        this.amount = amount;
        this.electricity_Price = electricity_Price;
    }

    public int getElectricity_ID()
    {
        return electricity_ID;
    }

    public void setElectricity_ID(int electricity_ID)
    {
        this.electricity_ID = electricity_ID;
    }

    public String getElectrictrity_Company()
    {
        return electrictrity_Company;
    }

    public void setElectrictrity_Company(String electrictrity_Company)
    {
        this.electrictrity_Company = electrictrity_Company;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public double getElectricity_Price()
    {
        return electricity_Price;
    }

    public void setElectricity_Price(double electricity_Price)
    {
        this.electricity_Price = electricity_Price;
    }

    @Override
    public String toString()
    {
        return "Electricity{" +
                "electricity_ID=" + electricity_ID +
                ", electrictrity_Company='" + electrictrity_Company + '\'' +
                ", amount=" + amount +
                ", electricity_Price=" + electricity_Price +
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
