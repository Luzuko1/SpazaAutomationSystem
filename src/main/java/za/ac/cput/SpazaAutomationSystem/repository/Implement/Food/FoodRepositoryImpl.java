package za.ac.cput.SpazaAutomationSystem.repository.Implement.Food;

import za.ac.cput.SpazaAutomationSystem.domain.Food.Food;
import za.ac.cput.SpazaAutomationSystem.repository.FoodRepository;

import java.util.HashSet;
import java.util.Set;

public class FoodRepositoryImpl implements FoodRepository
{
    private static FoodRepositoryImpl repository = null;
    private Set<Food> food;

    private FoodRepositoryImpl()
    {
        this.food = new HashSet<>();
    }

    public static FoodRepositoryImpl getRepository()
    {
        if (repository ==null) repository = new FoodRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Food> getAll()
    {
        return this.food;
    }

    @Override
    public Food create(Food food)
    {
        this.food.add(food);
        return food;
    }

    @Override
    public Food update(Food food)
    {
        return food;
    }

    @Override
    public void delete(String s)
    {

    }

    @Override
    public Food read(String s)
    {
        return null;
    }
}
