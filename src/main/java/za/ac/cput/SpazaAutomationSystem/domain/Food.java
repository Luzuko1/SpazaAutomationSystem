package za.ac.cput.SpazaAutomationSystem.domain;

public class Food implements Item
{
    private int food_ID;
    private String name, description;
    private double price;

    public Food()
    {
    }

    private Food(Food.Builder builder)
    {
        this.food_ID = builder.food_ID;
        this.name = builder.name;
        this.description = builder.description;
        this.price = builder.price;
    }
    public int getFood_ID()
    {
        return food_ID;
    }

    public void setFood_ID(int food_ID)
    {
        this.food_ID = food_ID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Food{" +
                "food_ID=" + food_ID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
    public static class Builder{

        private int food_ID;
        private String name, description;
        private double price;

        public Food.Builder food_ID(int food_ID)
        {
            this.food_ID = food_ID;
            return this;
        }
        public Food.Builder name(String name)
        {
            this.name = name;
            return this;
        }

        public Food.Builder description(String description) {
            this.description = description;
            return this;
        }
        public Food.Builder price(double price) {
            this.price = price;
            return this;
        }

        public Food build() {
            return new Food(this);
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
