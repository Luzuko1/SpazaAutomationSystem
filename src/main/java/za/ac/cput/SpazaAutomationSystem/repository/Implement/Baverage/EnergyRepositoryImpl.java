package za.ac.cput.SpazaAutomationSystem.repository.Implement.Baverage;

import za.ac.cput.SpazaAutomationSystem.domain.Baverage.Energy;
import za.ac.cput.SpazaAutomationSystem.repository.EnergyRepository;

import java.util.HashSet;
import java.util.Set;

public class EnergyRepositoryImpl implements EnergyRepository
{
    private static EnergyRepositoryImpl repository = null;
    private Set<Energy>  energy;

    private EnergyRepositoryImpl()
    {
        this.energy = new HashSet<>();
    }

    public static EnergyRepositoryImpl getRepository()
    {
        if (repository ==null) repository = new EnergyRepositoryImpl();
        return repository;
    }



    @Override
    public Set<Energy> getAll()
    {
        return this.energy;
    }

    @Override
    public Energy create(Energy energy)
    {
        this.energy.add(energy);
        return energy;
    }

    @Override
    public Energy update(Energy energy)
    {
        return energy;
    }

    @Override
    public void delete(String s)
    {

    }

    @Override
    public Energy read(String s)
    {
        return null;
    }
}
