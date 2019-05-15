package za.ac.cput.SpazaAutomationSystem.domain.Prepaid;

public class Electricity extends Prepaid
{
    private int electricity_ID;
    private String electricity_Company;
    private double amount;
    private double electricity_Price;

    private Electricity()
    {
    }

    private Electricity(Electricity.Builder builder)
    {
        this.electricity_ID = builder.electricity_ID;
        this.electricity_Company = builder.electricity_Company;
        this.amount = builder.amount;
        this.electricity_Price = builder.electricity_Price;
    }
    private Electricity(int electricity_ID, String electricity_Company, double amount, double electricity_Price)
    {
        this.electricity_ID = electricity_ID;
        this.electricity_Company = electricity_Company;
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

    public String getElectricity_Company()
    {
        return electricity_Company;
    }

    public void setElectricity_Company(String electricity_Company)
    {
        this.electricity_Company = electricity_Company;
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

    public static class Builder{

        private int electricity_ID;
        private String electricity_Company;
        private double amount;
        private double electricity_Price;

        public Electricity.Builder electricity_ID(int electricity_ID)
        {
            this.electricity_ID = electricity_ID;
            return this;
        }
        public Electricity.Builder electricity_Company(String electricity_Company)
        {
            this.electricity_Company = electricity_Company;
            return this;
        }

        public Electricity.Builder amount(double amount) {
            this.amount = amount;
            return this;
        }
        public Electricity.Builder electricity_Price(double electricity_Price) {
            this.electricity_Price = electricity_Price;
            return this;
        }

        public Electricity build() {
            return new Electricity(this);
        }

    }

    @Override
    public String toString()
    {
        return "Electricity{" +
                "electricity_ID=" + electricity_ID +
                ", electricity_Company='" + electricity_Company + '\'' +
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
