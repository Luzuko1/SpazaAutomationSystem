package za.ac.cput.SpazaAutomationSystem.factory;

import za.ac.cput.SpazaAutomationSystem.domain.Drinks;
import za.ac.cput.SpazaAutomationSystem.util.GenerateIDInt;

public class DrinksFactory
{
    public static Drinks getDrink(String drink_Name, int size, int quantity)
    {
        return new Drinks.Builder()
                .drink_ID(GenerateIDInt.generateIDInt())
                .drink_Name(drink_Name)
                .size(size)
                .quantity(quantity)
                .build();
    }
}
