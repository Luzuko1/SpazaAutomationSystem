package za.ac.cput.SpazaAutomationSystem.Repository.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.SpazaAutomationSystem.domain.Owner;
import za.ac.cput.SpazaAutomationSystem.repository.Implement.OwnerRepositoryImpl;

import java.util.Set;

public class OwnerRepositoryImplTest
{
    private OwnerRepositoryImpl repository;

    @Before
    public void setUp() throws Exception {
        this.repository = OwnerRepositoryImpl.getRepository();
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
    public void update()
    {

    }

    @Test
    public void delete()
    {

    }

    @Test
    public void getAll() {
        Set<Owner> owners = this.repository.getAll();
        Assert.assertEquals(1, owners.size());
    }
}
