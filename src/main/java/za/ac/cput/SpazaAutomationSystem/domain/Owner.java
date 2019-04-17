package za.ac.cput.SpazaAutomationSystem.domain;

public class Owner implements PersonName, PersonIdentity
{
    private int owner_ID;
    private String ownerName;

    public Owner()
    {
    }

    public Owner(int owner_ID, String ownerName)
    {
        this.owner_ID = owner_ID;
        this.ownerName = ownerName;
    }

    public int getOwner_ID()
    {
        return owner_ID;
    }

    public void setOwner_ID(int owner_ID)
    {
        this.owner_ID = owner_ID;
    }

    public String getOwnerName()
    {
        return ownerName;
    }

    public void setOwnerName(String ownerName)
    {
        this.ownerName = ownerName;
    }

    @Override
    public String toString()
    {
        return "Owner{" +
                "owner_ID=" + owner_ID +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }

    @Override
    public String getFirstName()
    {
        return null;
    }

    @Override
    public String getLastName()
    {
        return null;
    }

    @Override
    public int getIdValue()
    {
        return 0;
    }

    @Override
    public String getIdType()
    {
        return null;
    }
}
