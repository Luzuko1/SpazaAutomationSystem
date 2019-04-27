package za.ac.cput.SpazaAutomationSystem.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.SpazaAutomationSystem.domain.Meat;

import static org.junit.Assert.*;

public class MeatFactoryTest
{

    @Test
    public void getMeat()
    {
        String dateBought = "01-02-2019";
        String expireDate = "01-06-2019";

        Meat meat = MeatFactory.getMeat(dateBought,expireDate);
        Assert.assertNotNull(meat);
        System.out.println(meat);
    }
}