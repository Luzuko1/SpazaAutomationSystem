package za.ac.cput.SpazaAutomationSystem.factory;

import za.ac.cput.SpazaAutomationSystem.domain.Egg;
import za.ac.cput.SpazaAutomationSystem.util.GenerateIDInt;

public class EggFactory
{
    public static Egg getEgg( String brand_brand, int quantity)
    {
        return new Egg.Builder()
                .brand_name(brand_brand)
                .quantity(quantity)
                .build();
    }
}
