package models.network_devices;

public interface IDeviceActions
{
    /**
     * actualiza la firma digital del dispositivo
     */
    public void updateFirmWare();

    /**
     * restablece los valores por defecto del dispositivo lo que
     * borra todas las configuraciones hechas por el usuario
     */
    public void restoreDefaults();

    /**
     * reinicia el dispositivo sin borrar la 
     * configuraciones realizadas por el usuario
     * en el dispositivo
     */
    public void restartDevice();
}