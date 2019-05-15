package za.ac.cput.SpazaAutomationSystem.repository;

import za.ac.cput.SpazaAutomationSystem.domain.Toiletry.Toiletry;

import java.util.Set;

public interface ToiletryRepository extends IRepository<Toiletry, String>
{
    Set<Toiletry> getAll();
}
