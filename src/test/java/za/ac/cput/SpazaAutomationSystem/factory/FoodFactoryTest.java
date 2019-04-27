package za.ac.cput.SpazaAutomationSystem.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.SpazaAutomationSystem.domain.Food;

import static org.junit.Assert.*;

public class FoodFactoryTest
{

    @Test
    public void getFood()
    {

        String name = "stew";
        String description = "hot";
        double price = 35.5;

        Food food = FoodFactory.getFood(name, description, price);
        Assert.assertNotNull(food);
        System.out.println(food);
    }
}