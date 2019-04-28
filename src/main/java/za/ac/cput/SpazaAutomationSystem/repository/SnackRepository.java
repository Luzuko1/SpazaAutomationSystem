package za.ac.cput.SpazaAutomationSystem.repository;

import za.ac.cput.SpazaAutomationSystem.domain.Snack;

import java.util.Set;

public interface SnackRepository extends IRepository<Snack, String>
{
    Set<Snack> getAll();
}
