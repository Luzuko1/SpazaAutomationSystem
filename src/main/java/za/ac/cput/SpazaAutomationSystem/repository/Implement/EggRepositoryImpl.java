package za.ac.cput.SpazaAutomationSystem.repository.Implement;

import za.ac.cput.SpazaAutomationSystem.domain.Egg;
import za.ac.cput.SpazaAutomationSystem.repository.EggRepository;

import java.util.HashSet;
import java.util.Set;

public class EggRepositoryImpl implements EggRepository
{
    private static EggRepositoryImpl repository = null;
    private Set<Egg> eggs;

    private EggRepositoryImpl()
    {
        this.eggs = new HashSet<>();
    }

    public static EggRepositoryImpl getRepository()
    {
        if (repository == null) repository = new EggRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Egg> getAll()
    {
        return null;
    }

    @Override
    public Egg create(Egg egg)
    {
        this.eggs.add(egg);
        return egg;
    }

    @Override
    public Egg update(Egg egg)
    {
        return egg;
    }

    @Override
    public void delete(String s)
    {

    }

    @Override
    public Egg read(String s)
    {
        return null;
    }
}
