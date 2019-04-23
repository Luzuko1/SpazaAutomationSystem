package za.ac.cput.SpazaAutomationSystem.factory;

import za.ac.cput.SpazaAutomationSystem.domain.Teller;
import za.ac.cput.SpazaAutomationSystem.util.GenerateIDInt;

public class TellerFactory
{
    public static Teller getTeller( String tellerName)
    {
        return new Teller.Builder()
                .tellerID(GenerateIDInt.generateIDInt())
                .tellerName(tellerName).build();
    }
}
