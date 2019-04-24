package za.ac.cput.SpazaAutomationSystem.factory;

import za.ac.cput.SpazaAutomationSystem.domain.Snack;
import za.ac.cput.SpazaAutomationSystem.util.GenerateIDInt;

public class SnackFactory
{
    public static Snack getSnack(String snack_name, String description, double price)
    {
        return new Snack.Builder()
                .snack_ID(GenerateIDInt.generateIDInt())
                .snack_name(snack_name)
                .description(description)
                .price(price)
                .build();
    }
}
