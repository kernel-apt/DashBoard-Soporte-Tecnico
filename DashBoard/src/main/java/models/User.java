package models;

public class User 
{
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