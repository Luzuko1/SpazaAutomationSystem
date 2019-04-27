package za.ac.cput.SpazaAutomationSystem.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.SpazaAutomationSystem.domain.Grain;

import static org.junit.Assert.*;

public class GrainFactoryTest
{

    @Test
    public void getGrain()
    {
        String dateBought = "01-04-2019";
        int quantity = 50;

        Grain grain = GrainFactory.getGrain(dateBought,quantity);
        Assert.assertNotNull(grain);
        System.out.println(grain);

    }
}