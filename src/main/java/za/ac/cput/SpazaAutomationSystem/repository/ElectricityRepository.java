package za.ac.cput.SpazaAutomationSystem.repository;

import za.ac.cput.SpazaAutomationSystem.domain.Prepaid.Electricity;

import java.util.Set;

public interface ElectricityRepository  extends IRepository<Electricity, String>
{
    Set<Electricity> getAll();
}
