package za.ac.cput.SpazaAutomationSystem.factory;

import za.ac.cput.SpazaAutomationSystem.domain.Dairy;
import za.ac.cput.SpazaAutomationSystem.util.GenerateID;
import za.ac.cput.SpazaAutomationSystem.util.GenerateIDInt;

import java.util.Date;

public class DairyFactory
{
    public static Dairy getDairy(String dairy_Name,String dateArrived)
    {
        return new Dairy.Builder()
                .dairy_ID(GenerateIDInt.generateIDInt())
                .dairy_Name(dairy_Name)
                .dateArrived(dateArrived)
                .build();
    }
}
