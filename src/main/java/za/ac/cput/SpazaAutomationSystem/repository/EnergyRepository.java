package za.ac.cput.SpazaAutomationSystem.repository;

import za.ac.cput.SpazaAutomationSystem.domain.Baverage.Energy;

import java.util.Set;

public interface EnergyRepository extends IRepository<Energy, String>
{
    Set<Energy> getAll();
}
