package za.ac.cput.SpazaAutomationSystem.factory;

import za.ac.cput.SpazaAutomationSystem.domain.Meat;
import za.ac.cput.SpazaAutomationSystem.util.GenerateIDInt;

public class MeatFactory
{
    public static Meat getMeat(String dateBought,String dateExpired)
    {
        return new Meat.Builder()
                .meat_ID(GenerateIDInt.generateIDInt())
                .dateBought(dateBought)
                .expreDate(dateExpired)
                .build();
    }
}
