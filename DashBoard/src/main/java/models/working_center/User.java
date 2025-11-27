package models.working_center;

public class User 
{
    private String employeeNumber;
    private String dateCreated;
    private String userName;
    private String password;
    private String area;

    public User(String user, String passkey, String area) 
    {
        userName = user;
        password = passkey;
        this.area = area;
    }

    /**
     * Obtiene el nombre del usuario.
     * @return El nombre de usuario.
     */
    public String getNombreUsuario() 
    {
        return userName;
    }

    /**
     * Establece el nombre del usuario.
     * @param nombreUsuario El nuevo nombre de usuario.
     */
    public void setNombreUsuario(String userName) 
    {
        this.userName = userName;
    }

    /**
     * Obtiene la contraseña del usuario.
     * @return La contraseña del usuario.
     */
    public String getPassword() 
    {
        return password;
    }

    /**
     * Establece la contraseña del usuario.
     * @param password La nueva contraseña.
     */
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getArea() 
    {
        return area;
    }

    public void setArea(String area) 
    {
        this.area = area;
    }

    public String getEmployeeNumber() 
    {
        return this.employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) 
    {
        this.employeeNumber = employeeNumber;
    }

    public String getDateCreated() 
    {
        return this.dateCreated;
    }

    public void setDateCreated(String dateCreated) 
    {
        this.dateCreated = dateCreated;
    }

    public String getUserName() 
    {
        return this.userName;
    }

    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    /**
     * Devuelve una representación en cadena del objeto.
     * @return mostrando su nombre.
     */
    @Override
    public String toString() 
    {
        return "Usuario: " + userName;
    }
}