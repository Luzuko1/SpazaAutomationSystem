package za.ac.cput.SpazaAutomationSystem.repository;

import za.ac.cput.SpazaAutomationSystem.domain.Food.Food;

import java.util.Set;

public interface FoodRepository extends IRepository<Food, String>
{
    Set<Food> getAll();
}
