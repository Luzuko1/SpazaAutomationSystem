package za.ac.cput.SpazaAutomationSystem.Service.Impliment;

import za.ac.cput.SpazaAutomationSystem.Service.AirtimeService;
import za.ac.cput.SpazaAutomationSystem.domain.Airtime;
import za.ac.cput.SpazaAutomationSystem.repository.AirtimeRepository;
import za.ac.cput.SpazaAutomationSystem.repository.Implement.AirtimeRepositoryImpl;

import java.util.Set;

public class AirtimeServiceImpl implements AirtimeService
{
    private AirtimeServiceImpl service = null;
    private AirtimeRepository repository;

    private AirtimeServiceImpl()
    {
        this.repository = AirtimeRepositoryImpl.getRepository();
    }

    public AirtimeService getService()
    {
        if (service == null) service = new AirtimeServiceImpl();
        return  service;
    }

    @Override
    public Set<Airtime> getAllMTMAirtimes()
    {
        Set<Airtime> Airtimes = getAll();
        return null;
    }

    @Override
    public Set<Airtime> getAll()
    {
        return null;
    }

    @Override
    public Airtime create(Airtime airtime)
    {
        return this.repository.create(airtime);
    }

    @Override
    public Airtime update(Airtime airtime)
    {
        return this.repository.update(airtime);
    }

    @Override
    public void delete(String s)
    {
        this.repository.read(s);
    }

    @Override
    public Airtime read(String s)
    {
        return null;
    }
}
