package com.mycompany.soporte;

/**
 * Representa el modelo de datos para un Usuario en la aplicación.
 * <p>
 * Esta clase es un POJO (Plain Old Java Object) que encapsula la información
 * de un usuario, incluyendo su nombre y contraseña. Se utiliza para transportar
 * los datos del usuario entre las diferentes capas de la aplicación (Controlador, DAO).
 *
 * @author javis
 */
public class Usuario {

    /**
     * El nombre de usuario, utilizado para la autenticación.
     */
    private String nombreUsuario;

    /**
     * La contraseña del usuario.
     */
    private String password;

    /**
     * Constructor por defecto.
     */
    public Usuario() {
    }

    /**
     * Obtiene el nombre del usuario.
     * @return El nombre de usuario.
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Establece el nombre del usuario.
     * @param nombreUsuario El nuevo nombre de usuario.
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * Obtiene la contraseña del usuario.
     * @return La contraseña del usuario.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Establece la contraseña del usuario.
     * @param password La nueva contraseña.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Devuelve una representación en cadena del objeto.
     * <p>
     * <strong>Nota de seguridad:</strong> La contraseña se omite deliberadamente
     * de esta representación para evitar su exposición accidental en logs o consolas.
     *
     * @return Una cadena que representa al usuario, mostrando su nombre.
     */
    @Override
    public String toString() {
        return "Usuario{" + "nombreUsuario='" + nombreUsuario + '\'' + '}';
    }
}