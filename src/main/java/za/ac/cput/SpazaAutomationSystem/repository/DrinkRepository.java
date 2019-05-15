package za.ac.cput.SpazaAutomationSystem.repository;

import za.ac.cput.SpazaAutomationSystem.domain.Baverage.Drinks;

import java.util.Set;

public interface DrinkRepository extends IRepository<Drinks, String>
{
    Set<Drinks> getAll();
}
