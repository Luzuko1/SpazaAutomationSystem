package za.ac.cput.SpazaAutomationSystem.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.SpazaAutomationSystem.domain.Juice;

import static org.junit.Assert.*;

public class JuiceFactoryTest
{

    @Test
    public void getJuice()
    {
        String brandName = "Krush";
        String dateArrived = "20-03-2019";

        Juice juice = JuiceFactory.getJuice(brandName, dateArrived);
        Assert.assertNotNull(juice);
        System.out.println(juice);
    }
}