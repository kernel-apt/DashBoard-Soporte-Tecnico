package models.network_devices;

public interface IDeviceOperations 
{
    /**
     * cambia la clave de wifi en su banda 2.4G
     * @param passkey
     */
    public void change4GPasskey(String passkey);
    
    /**
     * cambia la clave de wifi en su banda 5G
     * @param passkey
     */
    public void change5GPasskey(String passkey);
    
    /**
     * restablece la clave de acceso al administrador
     * del dispositivo en caso de que el usuario haya 
     * olvidado la clave
     */
    public void restoreCredentials();

    /**
     * apaga la red wifi en su banda 2.4G
     */
    public void shutDown4GWLAN();

    /**
     * apaga la red wifi en su banda 5G
     */
    public void shutDown5GWLAN();

    /**
     * apaga la red wifi en ambas bandas
     */
    public void shutDownWLAN();

    /**
     * reinicia la red wifi en su banda 2.4G
     */
    public void restart4GWifi();

    /**
     * reinicia la red wifi en su banda 5G
     */
    public void restart5GWifi();
     
    /**
     * reinicia la red wifi en ambas bandas
     */
    public void restartWLAN();
}