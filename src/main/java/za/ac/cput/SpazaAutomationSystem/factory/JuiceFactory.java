package za.ac.cput.SpazaAutomationSystem.factory;

import za.ac.cput.SpazaAutomationSystem.domain.Juice;
import za.ac.cput.SpazaAutomationSystem.util.GenerateIDInt;

public class JuiceFactory
{
    public static Juice getJuice(String brand_name, String dateArrived)
    {
        return new Juice.Builder()
                .brand_name(brand_name)
                .build();
    }
}
