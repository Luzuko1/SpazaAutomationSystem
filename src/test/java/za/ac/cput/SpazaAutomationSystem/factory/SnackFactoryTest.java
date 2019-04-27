package za.ac.cput.SpazaAutomationSystem.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.SpazaAutomationSystem.domain.Snack;

import static org.junit.Assert.*;

public class SnackFactoryTest
{

    @Test
    public void getSnack()
    {
        String snackName = "Simba";
        String description = "maxican Chilli";
        double price = 18.20;

        Snack snack = SnackFactory.getSnack(snackName,description,price);
        Assert.assertNotNull(snack);
        System.out.println(snack);


    }
}