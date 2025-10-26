package models;

public class Device 
{
    private String serialNumber;
    private String network_passkey;
    private Boolean has_4G_wifi;
    private Boolean has_5G_wifi;
    private String ssid_4G_name;
    private String ssid_5G_name;
    private String mac;
    private String user_name_admin;
    private String user_admin_passkey;
    private String user_admin_ip;
    private String device_model;

    public Device(String ssid_name_4G, String ssid_name_5G, String user_admin, String passkey_admin, String ip_admin) 
    {
        this.user_admin_passkey = passkey_admin;
        this.ssid_4G_name = ssid_name_4G;
        this.ssid_5G_name = ssid_name_5G;
        this.user_name_admin = user_admin;
        this.user_admin_ip = ip_admin;
    }

    public Device(String serialNumber, String macAddress, String model, String wireless_passkey) 
    {
        this.network_passkey = wireless_passkey;
        this.serialNumber = serialNumber;
        this.device_model = model;
        this.mac = macAddress;
    }

    public Device(Boolean has_4G_wifi, Boolean has_5G_wifi) 
    {
        this.has_4G_wifi = has_4G_wifi;
        this.has_5G_wifi = has_5G_wifi;
    }

    public String getSerialNumber() 
    {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) 
    {
        this.serialNumber = serialNumber;
    }

    public String getNetwork_passkey() 
    {
        return network_passkey;
    }

    public void setNetwork_passkey(String network_passkey) 
    {
        this.network_passkey = network_passkey;
    }

    public Boolean getHas_4G_wifi() 
    {
        return has_4G_wifi;
    }

    public void setHas_4G_wifi(Boolean has_4G_wifi) 
    {
        this.has_4G_wifi = has_4G_wifi;
    }

    public Boolean getHas_5G_wifi() 
    {
        return has_5G_wifi;
    }

    public void setHas_5G_wifi(Boolean has_5G_wifi) 
    {
        this.has_5G_wifi = has_5G_wifi;
    }

    public String getSsid_4G_name() 
    {
        return ssid_4G_name;
    }

    public void setSsid_4G_name(String ssid_4G_name)
    {
        this.ssid_4G_name = ssid_4G_name;
    }

    public String getSsid_5G_name()
    {
        return ssid_5G_name;
    }

    public void setSsid_5G_name(String ssid_5G_name) 
    {
        this.ssid_5G_name = ssid_5G_name;
    }

    public String getMac() 
    {
        return mac;
    }

    public void setMac(String mac) 
    {
        this.mac = mac;
    }

    public String getUser_name_admin() 
    {
        return user_name_admin;
    }

    public void setUser_name_admin(String user_name_admin) 
    {
        this.user_name_admin = user_name_admin;
    }

    public String getUser_admin_passkey() 
    {
        return user_admin_passkey;
    }

    public void setUser_admin_passkey(String user_admin_passkey) 
    {
        this.user_admin_passkey = user_admin_passkey;
    }

    public String getUser_admin_ip() 
    {
        return user_admin_ip;
    }

    public void setUser_admin_ip(String user_admin_ip) 
    {
        this.user_admin_ip = user_admin_ip;
    }

    public String getDevice_model() 
    {
        return device_model;
    }

    public void setDevice_model(String device_model) 
    {
        this.device_model = device_model;
    }

    @Override
    public String toString() 
    {
        return "\nDevice{" + "serialNumber=" + serialNumber + ", network_passkey=" + network_passkey 
        + ", \nhas_4G_wifi=" + has_4G_wifi + ", has_5G_wifi=" + has_5G_wifi + ", ssid_4G_name=" 
        + ssid_4G_name + ", ssid_5G_name=" + ssid_5G_name + ", mac=" + mac + ", \nuser_name_admin=" 
        + user_name_admin + ", user_admin_passkey=" + user_admin_passkey + ", \nuser_admin_ip=" + user_admin_ip 
        + ", device_model=" + device_model + '}';
    }
}