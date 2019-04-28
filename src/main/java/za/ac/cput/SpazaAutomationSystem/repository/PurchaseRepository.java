package za.ac.cput.SpazaAutomationSystem.repository;

import za.ac.cput.SpazaAutomationSystem.domain.Purchase;

import java.util.Set;

public interface PurchaseRepository extends IRepository<Purchase, String>
{
    Set<Purchase> getAll();
}
