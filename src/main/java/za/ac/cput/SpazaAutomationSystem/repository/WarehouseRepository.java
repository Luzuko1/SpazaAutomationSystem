package za.ac.cput.SpazaAutomationSystem.repository;

import za.ac.cput.SpazaAutomationSystem.domain.Warehouse;

import java.util.Set;

public interface WarehouseRepository extends IRepository<Warehouse, String>
{
    Set<Warehouse> getAll();
}

