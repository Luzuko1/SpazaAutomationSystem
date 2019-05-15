package za.ac.cput.SpazaAutomationSystem.Service;

import za.ac.cput.SpazaAutomationSystem.domain.Prepaid.Airtime;

import java.util.Set;

public interface AirtimeService extends IService<Airtime, String>
{
    Set<Airtime> getAllMTMAirtimes();
    Set<Airtime> getAll();
}
