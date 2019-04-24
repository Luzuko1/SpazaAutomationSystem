package za.ac.cput.SpazaAutomationSystem.factory;


import za.ac.cput.SpazaAutomationSystem.domain.Store;
import za.ac.cput.SpazaAutomationSystem.util.GenerateIDInt;

public class StoreFactory
{
    public static Store getDairy(String store_Name, String description, String address)
    {
        return new Store.Builder()
                .store_ID(GenerateIDInt.generateIDInt())
                .store_name(store_Name)
                .store_description(description)
                .store_address(address)
                .build();
    }
}
