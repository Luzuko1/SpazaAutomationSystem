package za.ac.cput.SpazaAutomationSystem.domain;

import java.util.Date;

public class Meat extends Food
{
    private int meat_ID;
    private String dateBought, expireDate;

    public Meat()
    {
    }
    private Meat(Meat.Builder builder)
    {
        this.meat_ID = builder.meat_ID;
        this.dateBought = builder.dateBought;
        this.expireDate = builder.expireDate;

    }

    public Meat(int meat_ID, String dateBought, String expireDate)
    {
        this.meat_ID = meat_ID;
        this.dateBought = dateBought;
        this.expireDate = expireDate;
    }

    public int getMeat_ID()
    {
        return meat_ID;
    }

    public void setMeat_ID(int meat_ID)
    {
        this.meat_ID = meat_ID;
    }

    public String getDateBought()
    {
        return dateBought;
    }

    public void setDateBought(String dateBought)
    {
        this.dateBought = dateBought;
    }

    public String getExpireDate()
    {
        return expireDate;
    }

    public void setExpireDate(String  expireDate)
    {
        this.expireDate = expireDate;
    }

    public static class Builder{

        private int meat_ID;
        private String dateBought, expireDate;

        public Meat.Builder meat_ID(int meat_ID)
        {
            this.meat_ID = meat_ID;
            return this;
        }
        public Meat.Builder dateBought(String dateBought)
        {
            this.dateBought = dateBought;
            return this;
        }

        public Meat.Builder expreDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }


        public Meat build() {
            return new Meat(this);
        }

    }
    @Override
    public String toString()
    {
        return "Meat{" +
                "meat_ID=" + meat_ID +
                ", dateBought=" + dateBought +
                ", expireyDate=" + expireDate +
                '}';
    }
}
