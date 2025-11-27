package models.network_devices;

public abstract class Device implements IDeviceActions
{
    protected String serialNumber;
    protected String mark;
    protected String mac;

    public Device(String serialNumber, String deviceMark, String macAddress)
    {
        this.serialNumber = "";
        this.mark = "";
        this.mac = "";
    }

    public Device()
    {
        this.serialNumber = "";
        this.mark = "";
        this.mac = "";
    }
}