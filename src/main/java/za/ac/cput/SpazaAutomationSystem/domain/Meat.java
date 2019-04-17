package za.ac.cput.SpazaAutomationSystem.domain;

import java.util.Date;

public class Meat extends Food
{
    private int meat_ID;
    private Date dateBought, expireyDate;

    public Meat()
    {
    }

    public Meat(int meat_ID, Date dateBought, Date expireyDate)
    {
        this.meat_ID = meat_ID;
        this.dateBought = dateBought;
        this.expireyDate = expireyDate;
    }

    public int getMeat_ID()
    {
        return meat_ID;
    }

    public void setMeat_ID(int meat_ID)
    {
        this.meat_ID = meat_ID;
    }

    public Date getDateBought()
    {
        return dateBought;
    }

    public void setDateBought(Date dateBought)
    {
        this.dateBought = dateBought;
    }

    public Date getExpireyDate()
    {
        return expireyDate;
    }

    public void setExpireyDate(Date expireyDate)
    {
        this.expireyDate = expireyDate;
    }

    @Override
    public String toString()
    {
        return "Meat{" +
                "meat_ID=" + meat_ID +
                ", dateBought=" + dateBought +
                ", expireyDate=" + expireyDate +
                '}';
    }
}
