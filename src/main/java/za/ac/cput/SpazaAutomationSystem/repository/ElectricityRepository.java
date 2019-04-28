package za.ac.cput.SpazaAutomationSystem.repository;

import za.ac.cput.SpazaAutomationSystem.domain.Egg;
import za.ac.cput.SpazaAutomationSystem.domain.Electricity;

import java.util.Set;

public interface ElectricityRepository  extends IRepository<Electricity, String>
{
    Set<Electricity> getAll();
}
