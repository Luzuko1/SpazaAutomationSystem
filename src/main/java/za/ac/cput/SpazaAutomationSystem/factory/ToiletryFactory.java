package za.ac.cput.SpazaAutomationSystem.factory;

import za.ac.cput.SpazaAutomationSystem.domain.Toiletry;

public class ToiletryFactory
{
    public static Toiletry getToiletry(int toiletry_ID , double price)
    {
        return new Toiletry.Builder()
                .toiletry_ID(toiletry_ID)
                .price(price).build();
    }
}
