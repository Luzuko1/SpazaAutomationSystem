package za.ac.cput.SpazaAutomationSystem.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.SpazaAutomationSystem.domain.Airtime;
import za.ac.cput.SpazaAutomationSystem.domain.Teller;

import static org.junit.Assert.*;

public class AirtimeFactoryTest
{

    @Test
    public void getAirtime()
    {
        int amount = 30;
        Airtime airtime1 = AirtimeFactory.getAirtime(amount);
        System.out.println(airtime1);
        Assert.assertNotNull(airtime1.getAirtimeID());
    }
}