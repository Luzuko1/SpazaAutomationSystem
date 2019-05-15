package za.ac.cput.SpazaAutomationSystem.repository;

import za.ac.cput.SpazaAutomationSystem.domain.Baverage.Juice;

import java.util.Set;

public interface JuiceRepository extends IRepository<Juice, String>
{
    Set<Juice> getAll();
}
