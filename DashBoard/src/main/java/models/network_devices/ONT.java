package models.network_devices;

public class ONT extends NetWorkDevice
{
    private double opticalPower;
    private String public_ip;

    public ONT(String ssid4GName, String ssid5GName, String passKey4G, String passKey5G) 
    {
        super(ssid4GName, ssid5GName, passKey4G, passKey5G);
        this.opticalPower = -27;
        this.public_ip = "187.192.485.145";
    }
}