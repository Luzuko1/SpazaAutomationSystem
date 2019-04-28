package za.ac.cput.SpazaAutomationSystem.repository.Implement;

import za.ac.cput.SpazaAutomationSystem.domain.Dairy;
import za.ac.cput.SpazaAutomationSystem.domain.Drinks;
import za.ac.cput.SpazaAutomationSystem.repository.DairyRepository;
import za.ac.cput.SpazaAutomationSystem.repository.DrinkRepository;

import java.util.HashSet;
import java.util.Set;

public class DrinkRepositoryImpl implements DrinkRepository
{
    private static DrinkRepositoryImpl repository = null;
    private Set<Drinks> drinks;

    private DrinkRepositoryImpl()
    {
        this.drinks = new HashSet<>();
    }

    public DrinkRepositoryImpl getRepository()
    {
        if (repository == null) repository = new DrinkRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Drinks> getAll()
    {
        return this.drinks;
    }

    @Override
    public Drinks create(Drinks drinks)
    {   this.drinks.add(drinks);
        return drinks;
    }

    @Override
    public Drinks update(Drinks drinks)
    {
        return drinks;
    }

    @Override
    public void delete(String s)
    {

    }

    @Override
    public Drinks read(String s)
    {
        return null;
    }
}
