package za.ac.cput.SpazaAutomationSystem.factory;

import za.ac.cput.SpazaAutomationSystem.domain.Teller;
import za.ac.cput.SpazaAutomationSystem.util.GenarateID;

public class TellerFactory
{
    public static Teller getTeller( String tellerName)
    {
        return new Teller.Builder()
                .tellerID(GenarateID.generateID())
                .tellerName(tellerName).build();
    }
}
