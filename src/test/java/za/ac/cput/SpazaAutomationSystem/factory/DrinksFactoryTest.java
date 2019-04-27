package za.ac.cput.SpazaAutomationSystem.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.SpazaAutomationSystem.domain.Drinks;

import static org.junit.Assert.*;

public class DrinksFactoryTest
{

    @Test
    public void getDrink()
    {
        String drinkName = "Coke";
        int size = 400;
        int quantity = 3;

        Drinks drink = DrinksFactory.getDrink(drinkName,size,quantity);
        Assert.assertNotNull(drink);
        System.out.println(drink);
    }
}