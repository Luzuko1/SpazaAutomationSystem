package za.ac.cput.SpazaAutomationSystem.Service;

public interface IService<T, ID>
{
    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(ID id);

}
