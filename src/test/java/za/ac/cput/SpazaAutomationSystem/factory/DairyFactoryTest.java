package za.ac.cput.SpazaAutomationSystem.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.SpazaAutomationSystem.domain.Dairy;

import static org.junit.Assert.*;

public class DairyFactoryTest
{

    @Test
    public void getDairy()
    {
        String dairyName = "Milk";
        String dateArrived = "10-03-20119";

        Dairy dairy = DairyFactory.getDairy(dairyName,dateArrived);
        Assert.assertNotNull(dairy.getDairy_ID());
        System.out.println(dairy);
    }
}