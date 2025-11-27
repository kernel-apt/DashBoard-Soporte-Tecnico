package models.network_devices;

public class NetWorkDevice implements IDeviceOperations 
{
    protected String passKey;
    protected String userName;
    protected String ssid4GName;
    protected String ssid5GName;
    protected String passKey4G;
    protected String passKey5G;
    protected String ipDefault;

    public NetWorkDevice(String ssid4GName, String ssid5GName, String passKey4G, String passKey5G) 
    {
        this.passKey = "admin";
        this.userName = "root";
        this.ssid4GName = ssid4GName;
        this.ssid5GName = ssid5GName;
        this.passKey4G = passKey4G;
        this.passKey5G = passKey5G;
        this.ipDefault = "192.168.1.254";
    }

    @Override
    public void change4GPasskey(String passkey) 
    {
        this.passKey4G = passkey;
    }
    
    @Override
    public void change5GPasskey(String passkey) 
    {
        this.passKey5G = passkey;
    }
    
    @Override
    public void restoreCredentials() 
    {
        this.passKey = "admin";
        this.userName = "root";
    }
    
    @Override
    public void shutDown4GWLAN() 
    {
           
    }

    @Override
    public void shutDown5GWLAN() 
    {
        
    }

    @Override
    public void shutDownWLAN() 
    {
        
    }

    @Override
    public void restart4GWifi() 
    {
        
    }

    @Override
    public void restart5GWifi() 
    {
        
    }

    @Override
    public void restartWLAN() 
    {
        
    }
}