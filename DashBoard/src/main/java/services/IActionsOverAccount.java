package services;

import models.Account;
import models.Device;

public interface IActionsOverAccount 
{
    void UpdateDevice(Device device, Account account);   
    void DeleteDevice(Device device, Account account);   
    void AddDevice(Device device, Account account);   
}