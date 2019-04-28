package za.ac.cput.SpazaAutomationSystem.repository;

import za.ac.cput.SpazaAutomationSystem.domain.Owner;

import java.util.Set;

public interface OwnerRepository extends IRepository<Owner, String>
{
    Set<Owner> getAll();
}
