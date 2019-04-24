package za.ac.cput.SpazaAutomationSystem.factory;

import za.ac.cput.SpazaAutomationSystem.domain.Purchase;
import za.ac.cput.SpazaAutomationSystem.util.GenerateIDInt;

public class PurchaseFactory
{
    public static Purchase getDairy( String custName, String purchaseDate)
    {
        return new Purchase.Builder()
                .invoice_ID(GenerateIDInt.generateIDInt())
                .custName(custName)
                .purchaseDate(purchaseDate)
                .build();
    }
}
