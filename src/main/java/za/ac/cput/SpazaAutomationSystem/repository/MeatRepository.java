package za.ac.cput.SpazaAutomationSystem.repository;

import za.ac.cput.SpazaAutomationSystem.domain.Food.Meat;

import java.util.Set;

public interface MeatRepository extends IRepository<Meat, String>
{
    Set<Meat> getAll();
}
