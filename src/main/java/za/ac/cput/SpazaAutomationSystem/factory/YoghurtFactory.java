package za.ac.cput.SpazaAutomationSystem.factory;

import za.ac.cput.SpazaAutomationSystem.domain.Yoghurt;
import za.ac.cput.SpazaAutomationSystem.util.GenerateIDInt;

public class YoghurtFactory
{
    public static Yoghurt getYoghurt( String yoghurt_Name, String brand_name, int quantity, int  size)
    {
        return new Yoghurt.Builder()
                .yoghurt_Name(yoghurt_Name)
                .brand_name(brand_name)
                .quantity(quantity)
                .size(size)
                .build();
    }
}
