package com.mycompany.soporte;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Objeto de Acceso a Datos (DAO) para la entidad {@link Usuario}.
 * <p>
 * Esta clase se encarga de todas las operaciones de base de datos (CRUD)
 * relacionadas con los usuarios. Hereda de la clase {@link Dao} para obtener
 * la conexión a la base de datos.
 *
 * @author javis
 */
public class UsuarioDao extends Dao {

    /**
     * Constructor que establece la conexión a la base de datos.
     * Llama al constructor de la clase padre {@code Dao}.
     *
     * @throws SQLException Si ocurre un error de acceso a la base de datos.
     * @throws ClassNotFoundException Si no se encuentra el driver JDBC.
     */
    public UsuarioDao() throws SQLException, ClassNotFoundException {
        super();
    }

    /**
     * Inserta un nuevo usuario en la base de datos.
     *
     * @param nombreUsuario El nombre del nuevo usuario a registrar.
     * @param contrasena La contraseña para el nuevo usuario.
     * @return {@code true} si el usuario fue creado exitosamente (una fila afectada),
     * {@code false} en caso contrario.
     * @throws SQLException Si ocurre un error de sintaxis SQL o de base de datos.
     */
    public boolean altaUsuario(String nombreUsuario, String contrasena) throws SQLException {
        String sql = "INSERT INTO usuarios (nombre_usuario, contrasena) VALUES (?, ?)";
        try (PreparedStatement ps = this.linkToDataBase.prepareStatement(sql)) {
            ps.setString(1, nombreUsuario);
            ps.setString(2, contrasena);
            return ps.executeUpdate() > 0;
        }
    }

    /**
     * Autentica a un usuario verificando sus credenciales contra la base de datos.
     *
     * @param nombreUsuario El nombre de usuario a verificar.
     * @param clave La contraseña a verificar.
     * @return Un objeto {@link Usuario} poblado con el nombre de usuario si las
     * credenciales son correctas. Devuelve {@code null} si la autenticación falla.
     * @throws SQLException Si ocurre un error de sintaxis SQL o de base de datos.
     */
    public Usuario autenticar(String nombreUsuario, String clave) throws SQLException {
        String sql = "SELECT nombre_usuario FROM usuarios WHERE nombre_usuario = ? AND contrasena = ?";
        try (PreparedStatement ps = this.linkToDataBase.prepareStatement(sql)) {
            ps.setString(1, nombreUsuario);
            ps.setString(2, clave);
            this.resultSet = ps.executeQuery();

            if (this.resultSet.next()) {
                Usuario usuario = new Usuario();
                usuario.setNombreUsuario(this.resultSet.getString("nombre_usuario"));
                return usuario;
            }
        }
        return null;
    }
}