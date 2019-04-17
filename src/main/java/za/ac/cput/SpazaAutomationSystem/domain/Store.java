package za.ac.cput.SpazaAutomationSystem.domain;

public class Store
{

    private int store_ID;
    private String store_name;
    private String store_description;
    private String store_address;

    public Store()
    {
    }

    public Store(int store_ID, String store_name, String store_description, String store_address)
    {
        this.store_ID = store_ID;
        this.store_name = store_name;
        this.store_description = store_description;
        this.store_address = store_address;
    }

    public int getStore_ID()
    {
        return store_ID;
    }

    public void setStore_ID(int store_ID)
    {
        this.store_ID = store_ID;
    }

    public String getStore_name()
    {
        return store_name;
    }

    public void setStore_name(String store_name)
    {
        this.store_name = store_name;
    }

    public String getStore_description()
    {
        return store_description;
    }

    public void setStore_description(String store_description)
    {
        this.store_description = store_description;
    }

    public String getStore_address()
    {
        return store_address;
    }

    public void setStore_address(String store_address)
    {
        this.store_address = store_address;
    }

    @Override
    public String toString()
    {
        return "Store{" +
                "store_ID=" + store_ID +
                ", store_name='" + store_name + '\'' +
                ", store_description='" + store_description + '\'' +
                ", store_address='" + store_address + '\'' +
                '}';
    }
}
