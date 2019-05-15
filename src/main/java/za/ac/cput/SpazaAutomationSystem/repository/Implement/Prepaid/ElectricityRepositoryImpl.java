package za.ac.cput.SpazaAutomationSystem.repository.Implement.Prepaid;

import za.ac.cput.SpazaAutomationSystem.domain.Prepaid.Electricity;
import za.ac.cput.SpazaAutomationSystem.repository.ElectricityRepository;

import java.util.HashSet;
import java.util.Set;

public class ElectricityRepositoryImpl implements ElectricityRepository
{
    private static ElectricityRepositoryImpl repository = null;
    private Set<Electricity> electricities;

    private ElectricityRepositoryImpl()
    {
        this.electricities = new HashSet<>();
    }

    public static ElectricityRepositoryImpl getRepository()
    {
        if (repository == null) repository = new ElectricityRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Electricity> getAll()
    {
        return this.electricities;
    }

    @Override
    public Electricity create(Electricity electricity)
    {
        this.electricities.add(electricity);
        return electricity;
    }

    @Override
    public Electricity update(Electricity electricity)
    {
        return electricity;
    }

    @Override
    public void delete(String s)
    {

    }

    @Override
    public Electricity read(String s)
    {
        return null;
    }
}