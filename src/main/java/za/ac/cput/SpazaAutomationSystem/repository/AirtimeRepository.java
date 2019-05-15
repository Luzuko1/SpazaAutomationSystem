package za.ac.cput.SpazaAutomationSystem.repository;

import za.ac.cput.SpazaAutomationSystem.domain.Prepaid.Airtime;

import java.util.Set;

public interface AirtimeRepository extends IRepository<Airtime, String>
{
    Set<Airtime> getAll();
}
