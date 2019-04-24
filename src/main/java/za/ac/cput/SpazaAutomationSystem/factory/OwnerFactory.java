package za.ac.cput.SpazaAutomationSystem.factory;

import za.ac.cput.SpazaAutomationSystem.domain.Owner;
import za.ac.cput.SpazaAutomationSystem.util.GenerateIDInt;

public class OwnerFactory
{
    public static Owner getOwner(String ownerName)
    {
        return new Owner.Builder()
                .owner_ID(GenerateIDInt.generateIDInt())
                .ownerName(ownerName)
                .build();
    }
}
