package models.network_devices;

/**
 * representa un equipo de multipuertos LAN
 */
public class Switch extends Device
{
    public Switch(String serialNumber, String deviceMark, String macAddress)
    {
        super(serialNumber, deviceMark, macAddress);
    }

    public Switch()
    {
        super();
    }

    @Override
    public void updateFirmWare() 
    {
        
    }

    @Override
    public void restoreDefaults() 
    {

    }

    @Override
    public void restartDevice() 
    {
        
    }
}