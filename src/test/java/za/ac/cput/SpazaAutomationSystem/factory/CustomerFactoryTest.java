package za.ac.cput.SpazaAutomationSystem.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.SpazaAutomationSystem.domain.Customer;

import static org.junit.Assert.*;

public class CustomerFactoryTest
{

    @Test
    public void getCustomer()
    {
        String custName= "John";
        double shoppingCost = 10.2;

        Customer cust = CustomerFactory.getCustomer(custName,shoppingCost);
        System.out.println(cust);
        Assert.assertNotNull("",cust.getCustName());
        Assert.assertNotNull("",cust.getShoppingCost());
    }
}