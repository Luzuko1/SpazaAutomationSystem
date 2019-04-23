package za.ac.cput.SpazaAutomationSystem.factory;

import za.ac.cput.SpazaAutomationSystem.domain.Airtime;
import za.ac.cput.SpazaAutomationSystem.util.GenerateIDInt;

public class AirtimeFactory
{

        public static Airtime getAirtime(double amount)
        {
            return new Airtime.Builder()
                    .AirtimeID(GenerateIDInt.generateIDInt())
                    .amount(amount).build();
        }

}
