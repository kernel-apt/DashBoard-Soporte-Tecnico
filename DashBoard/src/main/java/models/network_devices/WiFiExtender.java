package models.network_devices;

/**
 * representa un extensor de wifi
 * @author Cruz Sanchez Manuel
 */
public class WiFiExtender extends NetWorkDevice
{
    public WiFiExtender(String passKey, String userName, String ssid4GName, String ssid5GName, String passKey4G, String passKey5G, String ipDefault) 
    {
        super(passKey, userName, ssid4GName, ssid5GName, passKey4G, passKey5G, ipDefault);
    }
}