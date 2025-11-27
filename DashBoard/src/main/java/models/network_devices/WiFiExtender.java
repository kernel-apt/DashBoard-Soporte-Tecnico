package models.network_devices;

/**
 * representa un extensor de wifi
 * @author Cruz Sanchez Manuel
 */
public class WiFiExtender extends NetWorkDevice
{
    public WiFiExtender(String ssid4GName, String ssid5GName, String passKey4G, String passKey5G) 
    {
        super(ssid4GName, ssid5GName, passKey4G, passKey5G);
        this.ipDefault = "192.168.1.255";
        this.userName = "extender";
        this.passKey = "extender123456";
    }
}