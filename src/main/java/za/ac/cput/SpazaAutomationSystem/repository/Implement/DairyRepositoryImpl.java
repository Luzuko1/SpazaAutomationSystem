package za.ac.cput.SpazaAutomationSystem.repository.Implement;

import za.ac.cput.SpazaAutomationSystem.domain.Dairy;
import za.ac.cput.SpazaAutomationSystem.repository.DairyRepository;

import java.util.HashSet;
import java.util.Set;

public class DairyRepositoryImpl implements DairyRepository
{
    private static DairyRepositoryImpl repository = null;
    private Set<Dairy> dairies;

    private DairyRepositoryImpl()
    {
        this.dairies = new HashSet<>();
    }

    public static DairyRepositoryImpl getRepository()
    {
        if(repository==null) repository = new DairyRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Dairy> getAll()
    {
        return this.dairies;
    }

    @Override
    public Dairy create(Dairy dairy)
    {
        this.dairies.add(dairy);
        return dairy;
    }

    @Override
    public Dairy update(Dairy dairy)
    {
        return dairy;
    }

    @Override
    public void delete(String s)
    {

    }

    @Override
    public Dairy read(String s)
    {
        return null;
    }
}
