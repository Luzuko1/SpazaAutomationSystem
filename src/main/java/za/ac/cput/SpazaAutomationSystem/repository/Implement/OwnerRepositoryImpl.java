package za.ac.cput.SpazaAutomationSystem.repository.Implement;

import za.ac.cput.SpazaAutomationSystem.domain.Owner;
import za.ac.cput.SpazaAutomationSystem.repository.OwnerRepository;

import java.util.HashSet;
import java.util.Set;

public class OwnerRepositoryImpl implements OwnerRepository
{
    private static OwnerRepositoryImpl repository = null;
    private Set<Owner> owners;


    private OwnerRepositoryImpl()
    {
        this.owners = new HashSet<>();
    }
    public static OwnerRepositoryImpl getRepository()
    {
        if(repository ==null) repository = new OwnerRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Owner> getAll()
    {
        return this.owners;
    }

    @Override
    public Owner create(Owner owner)
    {
        this.owners.add(owner);
        return owner;
    }

    @Override
    public Owner update(Owner owner)
    {
        return owner;
    }

    @Override
    public void delete(String s)
    {

    }

    @Override
    public Owner read(String s)
    {
        return null;
    }
}
