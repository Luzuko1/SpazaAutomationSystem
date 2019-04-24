package za.ac.cput.SpazaAutomationSystem.factory;

import za.ac.cput.SpazaAutomationSystem.domain.Energy;

public class EnergyFactory
{
    public static Energy getEnergy(String brand_name)
    {
        return new Energy.Builder()
                .brand_name(brand_name)
                .build();
    }
}
