package za.ac.cput.SpazaAutomationSystem.factory;

import za.ac.cput.SpazaAutomationSystem.domain.Warehouse;
import za.ac.cput.SpazaAutomationSystem.util.GenerateIDInt;

public class WarehouseFactory
{
    public static Warehouse getWarehouse(String warehouse_name, String address)
    {
        return new Warehouse.Builder()
                .warehouse_ID(GenerateIDInt.generateIDInt())
                .warehous_name(warehouse_name)
                .address(address)
                .build();
    }
}
