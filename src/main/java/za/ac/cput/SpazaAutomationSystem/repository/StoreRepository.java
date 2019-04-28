package za.ac.cput.SpazaAutomationSystem.repository;

import za.ac.cput.SpazaAutomationSystem.domain.Store;

import java.util.Set;

public interface StoreRepository extends IRepository<Store, String>
{
    Set<Store> getAll();
}
