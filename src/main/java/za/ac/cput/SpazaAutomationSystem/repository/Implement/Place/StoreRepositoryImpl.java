package za.ac.cput.SpazaAutomationSystem.repository.Implement.Place;

import za.ac.cput.SpazaAutomationSystem.domain.Place.Store;
import za.ac.cput.SpazaAutomationSystem.repository.StoreRepository;

import java.util.HashSet;
import java.util.Set;

public class StoreRepositoryImpl implements StoreRepository
{
    private static StoreRepositoryImpl repository = null;
    private Set<Store> stores;

    private StoreRepositoryImpl()
    {
       this.stores = new HashSet<>();
    }
    public static StoreRepositoryImpl getRepository()
    {
        if(repository ==null) repository = new StoreRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Store> getAll()
    {
        return null;
    }

    @Override
    public Store create(Store store)
    {
        return null;
    }

    @Override
    public Store update(Store store)
    {
        return null;
    }

    @Override
    public void delete(String s)
    {

    }

    @Override
    public Store read(String s)
    {
        return null;
    }
}
