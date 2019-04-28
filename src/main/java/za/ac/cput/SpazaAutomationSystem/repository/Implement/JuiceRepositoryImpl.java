package za.ac.cput.SpazaAutomationSystem.repository.Implement;

import za.ac.cput.SpazaAutomationSystem.domain.Juice;
import za.ac.cput.SpazaAutomationSystem.repository.JuiceRepository;

import java.util.HashSet;
import java.util.Set;

public class JuiceRepositoryImpl implements JuiceRepository
{
    private static JuiceRepositoryImpl repository = null;
    private Set<Juice> juices;

    private JuiceRepositoryImpl()
    {
        this.juices = new HashSet<>();
    }

    public static JuiceRepositoryImpl getRepository()
    {
        if (repository == null) repository = new JuiceRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Juice> getAll()
    {
        return this.juices;
    }

    @Override
    public Juice create(Juice juice)
    {
        this.juices.add(juice);
        return juice;
    }

    @Override
    public Juice update(Juice juice)
    {
        return juice;
    }

    @Override
    public void delete(String s)
    {

    }

    @Override
    public Juice read(String s)
    {
        return null;
    }
}
