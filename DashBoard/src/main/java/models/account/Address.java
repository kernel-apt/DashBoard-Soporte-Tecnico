package models.account;

public class Address 
{
    private String street;
    private String colony;
    private String district;
    private String externalNumber;
    private String internalNumber;
    private String city;
    private String state;
    private String zipCode;

    public Address(String street, String colony, String district, String externalNumber, String internalNumber, String city, String state, String zipCode)
    {
        this.street = street;
        this.colony = colony;
        this.district = district;
        this.externalNumber = externalNumber;
        this.internalNumber = internalNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreet() 
    {
        return street;
    }
    
    public void setStreet(String street) 
    {
        this.street = street;
    }

    public String getColony() 
    {
        return colony;
    }

    public void setColony(String colony) 
    {
        this.colony = colony;
    }

    public String getDistrict() 
    {
        return district;
    }

    public void setDistrict(String district) 
    {
        this.district = district;
    }

    public String getExternalNumber() 
    {
        return externalNumber;
    }

    public void setExternalNumber(String externalNumber) 
    {
        this.externalNumber = externalNumber;
    }

    public String getInternalNumber() 
    {
        return internalNumber;
    }

    public void setInternalNumber(String internalNumber) 
    {
        this.internalNumber = internalNumber;
    }

    public String getCity() 
    {
        return city;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getState() 
    {
        return state;
    }

    public void setState(String state) 
    {
        this.state = state;
    }

    public String getZipCode() 
    {
        return zipCode;
    }

    public void setZipCode(String zipCode) 
    {
        this.zipCode = zipCode;
    }
}