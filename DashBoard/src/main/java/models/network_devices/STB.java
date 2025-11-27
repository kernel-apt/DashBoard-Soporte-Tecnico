package models.network_devices;

/**
 * representa un dispositivo STB para servicio de tv
 */
public class STB extends Device
{
    public STB(String stbSerialNumber, String stbMark, String stbMac)
    {
        super(stbSerialNumber, stbMark, stbMac);
    }

    public STB()
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