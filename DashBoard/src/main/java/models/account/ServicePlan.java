package models.account;

import models.network_devices.NetWorkDevice;
import java.util.List;

import javafx.collections.FXCollections;
import models.network_devices.Device;

public class ServicePlan 
{
    private List<NetWorkDevice> network_devices;
    private List<Device> devices;
    private String phoneNumber;
    private String contractDate;
    private int kindOfService;
    private double price;

    public ServicePlan(String phoneNumber, String contractDate, int kindOfService, double price)
    {
        this.network_devices = FXCollections.observableArrayList();
        this.devices = FXCollections.observableArrayList();
        this.phoneNumber = phoneNumber;
        this.contractDate = contractDate;
        this.kindOfService = kindOfService;
        this.price = price;
    }

    public void updateServicePlan(ServicePlan newPlan)
    {
        
    }

    public List<Device> getDevices() {
        return this.devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContractDate() {
        return this.contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public int getKindOfService() {
        return this.kindOfService;
    }

    public void setKindOfService(int kindOfService) {
        this.kindOfService = kindOfService;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}