package models.account;

import java.util.List;

import models.network_devices.Device;
import models.network_devices.NetWorkDevice;
public class Account 
{
    private ServicePlan service_plan;
    private Customer customer;
    private List<Ticket> tickets;
    private Address address;

    public Account(ServicePlan service_plan, Customer customer, List<Ticket> tickets, Address address)
    {
        this.service_plan = service_plan;
        this.customer = customer;
        this.tickets = tickets;
        this.address = address;
    }

    public ServicePlan getService_plan() 
    {
        return this.service_plan;
    }

    public void setService_plan(ServicePlan service_plan) 
    {
        this.service_plan = service_plan;
    }

    public Customer getCustomer() 
    {
        return this.customer;
    }

    public void setCustomer(Customer customer) 
    {
        this.customer = customer;
    }

    public List<Ticket> getTickets() 
    {
        return this.tickets;
    }

    public void setTickets(List<Ticket> tickets) 
    {
        this.tickets = tickets;
    }

    public Address getAddress() 
    {
        return this.address;
    }

    public void setAddress(Address address) 
    {
        this.address = address;
    }

    public void addDevice(NetWorkDevice device)
    {
        
    }
    
    public void addDevice(Device device)
    {
        
    }
}