package za.ac.cput.SpazaAutomationSystem.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.SpazaAutomationSystem.domain.Energy;

import static org.junit.Assert.*;

public class EnergyFactoryTest
{

    @Test
    public void getEnergy()
    {
        String brandName = "Mofaya";

        Energy energy = EnergyFactory.getEnergy(brandName);
        Assert.assertNotNull(energy);
        System.out.println(energy);
    }
}