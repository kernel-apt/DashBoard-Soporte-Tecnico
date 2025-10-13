package dashboard;

import org.junit.jupiter.api.Test;
import models.Device;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

@DisplayName("DashBoard Unit Tests")
public class DashBoardTest 
{
    @BeforeEach
    void setUp() 
    {
        
    }

    @Test
    @DisplayName("Probando constructor por cachos")
    void ConstructorByParts() 
    {
        Device device = new Device("Telmex 4G SSID", null, null, null, null);
        System.out.println(device.toString());
    }
}