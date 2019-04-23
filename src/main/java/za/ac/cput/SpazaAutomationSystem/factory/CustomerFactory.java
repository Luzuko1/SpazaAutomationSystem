package za.ac.cput.SpazaAutomationSystem.factory;

import za.ac.cput.SpazaAutomationSystem.domain.Airtime;
import za.ac.cput.SpazaAutomationSystem.domain.Customer;
import za.ac.cput.SpazaAutomationSystem.util.GenerateIDInt;

public class CustomerFactory
{
    public static Customer getCustomer(String custName,double shoppingCost)
    {
        return new Customer.Builder()
                .custName(custName)
                .shoppingCost(shoppingCost).build();
    }
}
