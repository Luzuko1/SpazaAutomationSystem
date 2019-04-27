package za.ac.cput.SpazaAutomationSystem.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.SpazaAutomationSystem.domain.Owner;

import static org.junit.Assert.*;

public class OwnerFactoryTest
{

    @Test
    public void getOwner()
    {
      String ownerName ="Mkize";

        Owner owner = OwnerFactory.getOwner(ownerName);
        Assert.assertNotNull(owner);
        System.out.println(owner);
    }
}