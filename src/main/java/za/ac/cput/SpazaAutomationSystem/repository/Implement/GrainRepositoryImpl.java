package za.ac.cput.SpazaAutomationSystem.repository.Implement;

import za.ac.cput.SpazaAutomationSystem.domain.Grain;
import za.ac.cput.SpazaAutomationSystem.repository.GrainRepository;

import java.util.HashSet;
import java.util.Set;

public class GrainRepositoryImpl implements GrainRepository
{
    private static GrainRepositoryImpl repository = null;
    private Set<Grain> grains;

    private GrainRepositoryImpl()
    {
        this.grains = new HashSet<>();
    }

    public static GrainRepositoryImpl getRepository()
    {
        if (repository == null) repository = new GrainRepositoryImpl();
        return repository;
    }



    @Override
    public Set<Grain> getAll()
    {
        return this.grains;
    }

    @Override
    public Grain create(Grain grain)
    {
        this.grains.add(grain);
        return grain;
    }

    @Override
    public Grain update(Grain grain)
    {
        return grain;
    }

    @Override
    public void delete(String s)
    {

    }

    @Override
    public Grain read(String s)
    {
        return null;
    }
}
