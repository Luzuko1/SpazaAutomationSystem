package za.ac.cput.SpazaAutomationSystem.domain;

import java.util.Date;

public class Dairy implements Item
{
    private int dairy_ID;
    private String dairy_name;
    private Date dateArrived;

    public Dairy()
    {

    }

    private Dairy(int dairy_ID, String dairy_name, Date dateArrived)
    {
        this.dairy_ID = dairy_ID;
        this.dairy_name = dairy_name;
        this.dateArrived = dateArrived;
    }

    public int getDairy_ID()
    {
        return dairy_ID;
    }

    public void setDairy_ID(int dairy_ID)
    {
        this.dairy_ID = dairy_ID;
    }

    public String getDairy_name()
    {
        return dairy_name;
    }

    public void setDairy_name(String dairy_name)
    {
        this.dairy_name = dairy_name;
    }

    public Date getDateArrived()
    {
        return dateArrived;
    }

    public void setDateArrived(Date dateArrived)
    {
        this.dateArrived = dateArrived;
    }

    @Override
    public String toString()
    {
        return "Dairy{" +
                "dairy_ID=" + dairy_ID +
                ", dairy_name='" + dairy_name + '\'' +
                ", dateArrived=" + dateArrived +
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
