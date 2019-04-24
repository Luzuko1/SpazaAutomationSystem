package za.ac.cput.SpazaAutomationSystem.domain;

public class Drinks implements Item
{
    private int drink_ID, size,quantity;
    private String drink_Name;

    public Drinks()
    {
    }

    private Drinks(Drinks.Builder builder)
    {
        this.drink_ID = builder.drink_ID;
        this.drink_Name = builder.drink_Name;
        this.size = builder.size;
        this.quantity = builder.size;

    }

    public Drinks(int drink_ID, int size, int quantity, String drink_Name)
    {
        this.drink_ID = drink_ID;
        this.size = size;
        this.quantity = quantity;
        this.drink_Name = drink_Name;
    }

    public int getDrink_ID()
    {
        return drink_ID;
    }

    public void setDrink_ID(int drink_ID)
    {
        this.drink_ID = drink_ID;
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

    public String getDrink_Name()
    {
        return drink_Name;
    }

    public void setDrink_Name(String drink_Name)
    {
        this.drink_Name = drink_Name;
    }

    public static class Builder{

        private int drink_ID, size, quantity;
        private String drink_Name;

        public Drinks.Builder drink_ID(int drink_ID)
        {
            this.drink_ID = drink_ID;
            return this;
        }
        public Drinks.Builder drink_Name(String drink_Name)
        {
            this.drink_Name = drink_Name;
            return this;
        }

        public Drinks.Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Drinks.Builder size(int size) {
            this.size = size;
            return this;
        }


        public Drinks build() {
            return new Drinks(this);
        }

    }

    @Override
    public String toString()
    {
        return "Drinks{" +
                "drink_ID=" + drink_ID +
                ", size=" + size +
                ", quantity=" + quantity +
                ", drink_Name='" + drink_Name + '\'' +
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
