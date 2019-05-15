package za.ac.cput.SpazaAutomationSystem.repository;

import za.ac.cput.SpazaAutomationSystem.domain.Dairy.Milk;

import java.util.Set;

public interface MilkRepository extends IRepository<Milk, String>
{
    Set<Milk> getAll();
}
