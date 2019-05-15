package za.ac.cput.SpazaAutomationSystem.repository.Implement.Food;

import za.ac.cput.SpazaAutomationSystem.domain.Food.Meat;
import za.ac.cput.SpazaAutomationSystem.repository.MeatRepository;

import java.util.HashSet;
import java.util.Set;

public class MeatRepositoryImpl implements MeatRepository
{
    private static MeatRepositoryImpl repository = null;
    private Set<Meat> meats;


    private MeatRepositoryImpl()
    {
        this.meats = new HashSet<>();
    }

    public static MeatRepositoryImpl getRepository()
    {
        if (repository == null) repository = new MeatRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Meat> getAll()
    {
        return this.meats;
    }

    @Override
    public Meat create(Meat meat)
    {
        this.meats.add(meat);
        return null;
    }

    @Override
    public Meat update(Meat meat)
    {
        return meat;
    }

    @Override
    public void delete(String s)
    {

    }

    @Override
    public Meat read(String s)
    {
        return null;
    }
}
