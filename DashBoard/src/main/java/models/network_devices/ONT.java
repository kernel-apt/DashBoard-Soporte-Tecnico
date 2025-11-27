package models.network_devices;

public class ONT extends NetWorkDevice
{
    private double opticalPower;
    private String public_ip;

    public ONT(String passKey, String userName, String ssid4GName, String ssid5GName, String passKey4G, String passKey5G, String ipDefault, double opticalPower, String public_ip) 
    {
        super(passKey, userName, ssid4GName, ssid5GName, passKey4G, passKey5G, ipDefault);
        this.opticalPower = opticalPower;
        this.public_ip = public_ip;
    }
}