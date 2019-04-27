package za.ac.cput.SpazaAutomationSystem.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.SpazaAutomationSystem.domain.Electricity;

import static org.junit.Assert.*;

public class ElectricityFactoryTest
{

    @Test
    public void getElectricity()
    {
        String company = "Eskom";
        double amount = 150;
        double price = 155.5;

        Electricity electricity = ElectricityFactory.getElectricity(company,amount,price);
        Assert.assertNotNull(electricity);
        System.out.println(electricity);

    }
}