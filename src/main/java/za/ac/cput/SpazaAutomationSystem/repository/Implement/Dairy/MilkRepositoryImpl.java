package za.ac.cput.SpazaAutomationSystem.repository.Implement.Dairy;

import za.ac.cput.SpazaAutomationSystem.domain.Dairy.Milk;
import za.ac.cput.SpazaAutomationSystem.repository.MilkRepository;

import java.util.HashSet;
import java.util.Set;

public class MilkRepositoryImpl implements MilkRepository
{
    private static MilkRepositoryImpl repository = null;
    private Set<Milk> milks;

    private MilkRepositoryImpl()
    {
        this.milks = new HashSet<>();
    }

    public static MilkRepositoryImpl getRepository()
    {
        if (repository == null) repository = new MilkRepositoryImpl();
        return repository;
    }
    @Override
    public Set<Milk> getAll()
    {
        return this.milks;
    }

    @Override
    public Milk create(Milk milk)
    {
        this.milks.add(milk);
        return milk;
    }

    @Override
    public Milk update(Milk milk)
    {
        return milk;
    }

    @Override
    public void delete(String s)
    {

    }

    @Override
    public Milk read(String s)
    {
        return null;
    }
}
