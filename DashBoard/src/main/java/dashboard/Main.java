package dashboard;

import models.Device;

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello World!");

        Device device = new Device(true, true);

        device = new Device
        (
            "serie", 
            "mac address", 
            "huawei", 
            "password1234"
        );

        device = new Device
        (
            "RED 2.4G", 
            "RED 5G", 
            "admin", 
            "admin1234", 
            "192.168.100.1"
        );

        System.out.println(device.toString());
    }
}
