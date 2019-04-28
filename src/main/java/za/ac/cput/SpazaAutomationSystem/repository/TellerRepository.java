package za.ac.cput.SpazaAutomationSystem.repository;

import za.ac.cput.SpazaAutomationSystem.domain.Teller;

import java.util.Set;

public interface TellerRepository extends IRepository<Teller, String>
{
    Set<Teller> getAll();
}
