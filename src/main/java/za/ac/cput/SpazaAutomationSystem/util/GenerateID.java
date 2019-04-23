package za.ac.cput.SpazaAutomationSystem.util;

import java.util.UUID;

public class GenerateID
{
    public static String generateID()
    {
        return UUID.randomUUID().toString();
    }
}
