package za.ac.cput.SpazaAutomationSystem.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.SpazaAutomationSystem.domain.Teller;

import static org.junit.Assert.*;

public class TellerFactoryTest
{

    @Test
    public void getTeller()
    {
        String name = "Luzuko";
        Teller teller1 = TellerFactory.getTeller(name);
        System.out.println(teller1);
        Assert.assertNotNull(teller1.getTellerID());
    }
}