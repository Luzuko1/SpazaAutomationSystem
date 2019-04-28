package za.ac.cput.SpazaAutomationSystem.repository;

import za.ac.cput.SpazaAutomationSystem.domain.Yoghurt;

import java.util.Set;

public interface YoghurtRepository extends IRepository<Yoghurt, String>
{
    Set<Yoghurt> getAll();
}
