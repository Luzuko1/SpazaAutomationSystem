package za.ac.cput.SpazaAutomationSystem.factory;

import za.ac.cput.SpazaAutomationSystem.domain.Grain;
import za.ac.cput.SpazaAutomationSystem.util.GenerateIDInt;

public class GrainFactory
{
    public static Grain getGrain(String dateBought, int quantity)
    {
        return new Grain.Builder()
                .grain_ID(GenerateIDInt.generateIDInt())
                .dateBought(dateBought)
                .quantity(quantity)
                .build();
    }
}
