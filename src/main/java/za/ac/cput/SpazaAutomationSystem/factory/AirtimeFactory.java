package za.ac.cput.SpazaAutomationSystem.factory;

import za.ac.cput.SpazaAutomationSystem.domain.Airtime;

import za.ac.cput.SpazaAutomationSystem.util.GenarateID;

public class AirtimeFactory
{

        public static Airtime getAirtime(int airtimeID ,double amount)
        {
            return new Airtime.Builder()
                    .AirtimeID(airtimeID)
                    .amount(amount).build();
        }

}
