package za.ac.cput.SpazaAutomationSystem.repository;

import za.ac.cput.SpazaAutomationSystem.domain.Dairy;

import java.util.Set;

public interface DairyRepository extends IRepository<Dairy, String>
{
    Set<Dairy> getAll();
}
