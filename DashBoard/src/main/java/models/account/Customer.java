package models.account;

import java.util.List;

public class Customer 
{
    private List<Account> accounts;
    private String phoneNumber;
    private String email;

    public Customer(String phoneNumber, String email)
    {
        this.accounts = null;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public List<Account> getAccounts() 
    {
        return this.accounts;
    }

    public void setAccounts(List<Account> accounts) 
    {
        this.accounts = accounts;
    }

    public String getPhoneNumber() 
    {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() 
    {
        return this.email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    /**
     * agrega una cuenta a la lista de cuentas del cliente
     * @param account
     */
    public void addAccount(Account account)
    {
        this.accounts.add(account);
    }
}