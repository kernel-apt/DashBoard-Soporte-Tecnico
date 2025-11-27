package models.working_center;

public abstract class Person 
{
    private String name;
    private String lastName;
    private String surName;
    private String bornDate;

    public Person(String name, String lastName, String surName, String bornDate)
    {
        this.name = name;
        this.lastName = lastName;
        this.surName = surName;
        this.bornDate = bornDate;
    }

    public String getName() 
    {
        return this.name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getLastName() 
    {
        return this.lastName;
    }

    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    public String getSurName() 
    {
        return this.surName;
    }

    public void setSurName(String surName) 
    {
        this.surName = surName;
    }

    public String getBornDate() 
    {
        return this.bornDate;
    }

    public void setBornDate(String bornDate) 
    {
        this.bornDate = bornDate;
    }
}