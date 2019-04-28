package za.ac.cput.SpazaAutomationSystem.repository;

import za.ac.cput.SpazaAutomationSystem.domain.Egg;

import java.util.Set;

public interface EggRepository extends IRepository<Egg, String>
{
    Set<Egg> getAll();
}
