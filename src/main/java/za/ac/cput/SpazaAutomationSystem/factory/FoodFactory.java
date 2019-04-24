package za.ac.cput.SpazaAutomationSystem.factory;

import za.ac.cput.SpazaAutomationSystem.domain.Food;
import za.ac.cput.SpazaAutomationSystem.util.GenerateIDInt;

public class FoodFactory
{
    public static Food getFood(String name,String description, double price)
    {
        return new Food.Builder()
                .food_ID(GenerateIDInt.generateIDInt())
                .name(name)
                .description(description)
                .price(price)
                .build();
    }
}
