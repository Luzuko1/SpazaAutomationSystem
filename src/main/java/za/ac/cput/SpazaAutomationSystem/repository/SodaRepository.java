package za.ac.cput.SpazaAutomationSystem.repository;

import za.ac.cput.SpazaAutomationSystem.domain.Soda;

import java.util.Set;

public interface SodaRepository extends IRepository<Soda, String>
{
    Set<Soda> getAll();
}
