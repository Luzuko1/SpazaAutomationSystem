package za.ac.cput.SpazaAutomationSystem.factory;

import za.ac.cput.SpazaAutomationSystem.domain.Soda;
import za.ac.cput.SpazaAutomationSystem.util.GenerateIDInt;

public class SodaFactory
{
    public static Soda getSoda(String brand_name)
    {
        return new Soda.Builder()
                .brand_name(brand_name)
                .build();
    }
}
