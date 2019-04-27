package za.ac.cput.SpazaAutomationSystem.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.SpazaAutomationSystem.domain.Egg;

import static org.junit.Assert.*;

public class EggFactoryTest
{

    @Test
    public void getEgg()
    {
        String brandName="Nulaid";
        int quantity=30;

        Egg egg = EggFactory.getEgg(brandName,quantity);
        Assert.assertNotNull(egg);
        System.out.println(egg);

    }

}