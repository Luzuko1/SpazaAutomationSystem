package za.ac.cput.SpazaAutomationSystem.Repository.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.SpazaAutomationSystem.domain.Meat;
import za.ac.cput.SpazaAutomationSystem.repository.Implement.MeatRepositoryImpl;

import java.util.Set;

public class MeatRepositoryImplTest
{
    private MeatRepositoryImpl repository;

    @Before
    public void setUp() throws Exception {
        this.repository = MeatRepositoryImpl.getRepository();
    }

    @Test
    public void create() {
        //create a student, add it to the repository
        this.repository.create(null);
        Assert.assertEquals(null, null);
    }

    @Test
    public void read() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void getAll() {
        Set<Meat> students = this.repository.getAll();
        Assert.assertEquals(1, students.size());
    }
}
