package za.ac.cput.SpazaAutomationSystem.repository;

import za.ac.cput.SpazaAutomationSystem.domain.Grain;

import java.util.Set;

public interface GrainRepository extends IRepository<Grain, String>
{
    Set<Grain> getAll();
}
