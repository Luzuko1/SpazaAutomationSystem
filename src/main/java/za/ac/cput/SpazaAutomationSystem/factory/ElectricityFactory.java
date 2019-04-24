package za.ac.cput.SpazaAutomationSystem.factory;

import za.ac.cput.SpazaAutomationSystem.domain.Electricity;
import za.ac.cput.SpazaAutomationSystem.util.GenerateIDInt;

public class ElectricityFactory
{
    public static Electricity getElectricity(String company,double amount, double price)
    {
        return new Electricity.Builder()
                .electricity_ID(GenerateIDInt.generateIDInt())
                .electricity_Company(company)
                .amount(amount)
                .electricity_Price(price)
                .build();
    }
}
