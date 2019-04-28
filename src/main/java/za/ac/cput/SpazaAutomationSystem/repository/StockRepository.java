package za.ac.cput.SpazaAutomationSystem.repository;

import za.ac.cput.SpazaAutomationSystem.domain.Stock;

import java.util.Set;

public interface StockRepository extends IRepository<Stock, String>
{
    Set<Stock> getAll();
}
