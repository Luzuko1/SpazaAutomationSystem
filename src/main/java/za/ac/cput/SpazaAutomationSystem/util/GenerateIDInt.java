package za.ac.cput.SpazaAutomationSystem.util;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateIDInt
{
    public static int generateIDInt()
    {
        int min = 1 ;
        int max = 999_999 ;
        int randomNum = ThreadLocalRandom.current().nextInt( min , max + 1 );

        return randomNum;
    }
}
