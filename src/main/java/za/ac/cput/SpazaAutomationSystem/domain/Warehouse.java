package za.ac.cput.SpazaAutomationSystem.domain;

public class Warehouse
{

    private int warehouse_ID;
    private String warehouse_name, address;

    public Warehouse()
    {
    }

    public Warehouse(int warehouse_ID, String warehouse_name, String address)
    {
        this.warehouse_ID = warehouse_ID;
        this.warehouse_name = warehouse_name;
        this.address = address;
    }

    public int getWarehouse_ID()
    {
        return warehouse_ID;
    }

    public void setWarehouse_ID(int warehouse_ID)
    {
        this.warehouse_ID = warehouse_ID;
    }

    public String getWarehouse_name()
    {
        return warehouse_name;
    }

    public void setWarehouse_name(String warehouse_name)
    {
        this.warehouse_name = warehouse_name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "Warehouse{" +
                "warehouse_ID=" + warehouse_ID +
                ", warehouse_name='" + warehouse_name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
