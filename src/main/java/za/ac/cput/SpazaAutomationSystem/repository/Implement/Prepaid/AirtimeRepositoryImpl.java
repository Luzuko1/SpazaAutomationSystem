package za.ac.cput.SpazaAutomationSystem.repository.Implement.Prepaid;

import za.ac.cput.SpazaAutomationSystem.domain.Prepaid.Airtime;
import za.ac.cput.SpazaAutomationSystem.repository.AirtimeRepository;

import java.util.HashSet;
import java.util.Set;


public class AirtimeRepositoryImpl implements AirtimeRepository
{

    private static AirtimeRepositoryImpl repository = null;
    private Set<Airtime> airtimes;

    private AirtimeRepositoryImpl()
    {
          this.airtimes = new HashSet<>();
    }

    public static AirtimeRepositoryImpl getRepository()
    {
        if(repository == null) repository = new AirtimeRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Airtime> getAll()
    {
        return this.airtimes;
    }

    @Override
    public Airtime create(Airtime airtime)
    {
        this.airtimes.add(airtime);
        return airtime;
    }

    @Override
    public Airtime update(Airtime airtime)
    {
        return airtime;
    }

    @Override
    public void delete(String s)
    {

    }

    @Override
    public Airtime read(String s)
    {
        return null;
    }
}
