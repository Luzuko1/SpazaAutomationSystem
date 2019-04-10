package za.ac.cput.SpazaAutomationSystem.util;

import java.util.UUID;

public class GenarateID
{
    public static String generateID()
    {
        return UUID.randomUUID().toString();
    }
}
