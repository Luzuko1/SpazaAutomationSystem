package za.ac.cput.SpazaAutomationSystem.domain;

import java.util.Date;

public class Grain extends Food
{
    private int grain_ID, quantity;
    private Date dateBought;

    public Grain()
    {
    }

    public Grain(int grain_ID, int quantity, Date dateBought)
    {
        this.grain_ID = grain_ID;
        this.quantity = quantity;
        this.dateBought = dateBought;
    }

    public int getGrain_ID()
    {
        return grain_ID;
    }

    public void setGrain_ID(int grain_ID)
    {
        this.grain_ID = grain_ID;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public Date getDateBought()
    {
        return dateBought;
    }

    public void setDateBought(Date dateBought)
    {
        this.dateBought = dateBought;
    }

    @Override
    public String toString()
    {
        return "Grain{" +
                "grain_ID=" + grain_ID +
                ", quantity=" + quantity +
                ", dateBought=" + dateBought +
                '}';
    }
}
