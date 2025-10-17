package com.mycompany.soporte;

import java.sql.*;

/**
 * Data Access Object (DAO) para la gestión de usuarios en la base de datos.
 * Proporciona métodos para operaciones CRUD relacionadas con usuarios.
 * 
 * @author Javis
 */
public class UsuarioDao {
    
    /**
     * URL de conexión a la base de datos MariaDB.
     */
    private static final String DB_URL = "jdbc:mariadb://localhost:3306/db_tech_support";
    
    /**
     * Usuario para la conexión a la base de datos.
     */
    private static final String DB_USER = "root";
    
    /**
     * Contraseña para la conexión a la base de datos.
     */
    private static final String DB_PASSWORD = "12345678";

    /**
     * Establece y retorna una conexión a la base de datos.
     * 
     * @return Conexión a la base de datos
     * @throws SQLException si ocurre un error al establecer la conexión
     */
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    /**
     * Registra un nuevo usuario en el sistema.
     * 
     * @param nombreUsuario Nombre de usuario para el nuevo registro
     * @param clave Contraseña del usuario
     * @return true si el usuario fue registrado exitosamente, false en caso contrario
     * @throws SQLException si ocurre un error de base de datos durante la operación
     */
    public boolean altaUsuario(String nombreUsuario, String clave) {
        String sql = "INSERT INTO usuarios (nombre_usuario, contrasena) VALUES (?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombreUsuario);
            pstmt.setString(2, clave);
            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Autentica un usuario verificando sus credenciales.
     * 
     * @param nombreUsuario Nombre de usuario a autenticar
     * @param clave Contraseña a verificar
     * @return true si las credenciales son válidas, false en caso contrario
     * @throws SQLException si ocurre un error de base de datos durante la autenticación
     */
    public boolean autenticar(String nombreUsuario, String clave) {
        String sql = "SELECT contrasena FROM usuarios WHERE nombre_usuario = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombreUsuario);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return clave.equals(rs.getString("contrasena"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Verifica si un nombre de usuario ya existe en el sistema.
     * 
     * @param nombreUsuario Nombre de usuario a verificar
     * @return true si el usuario existe, false en caso contrario
     * @throws SQLException si ocurre un error de base de datos durante la verificación
     */
    public boolean existeUsuario(String nombreUsuario) {
        String sql = "SELECT 1 FROM usuarios WHERE nombre_usuario = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombreUsuario);
            ResultSet rs = pstmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Actualiza la contraseña de un usuario existente.
     * 
     * @param nombreUsuario Nombre de usuario cuya contraseña será actualizada
     * @param nuevaClave Nueva contraseña para el usuario
     * @return true si la contraseña fue actualizada exitosamente, false en caso contrario
     * @throws SQLException si ocurre un error de base de datos durante la actualización
     */
    public boolean actualizarClave(String nombreUsuario, String nuevaClave) {
        String sql = "UPDATE usuarios SET contrasena = ? WHERE nombre_usuario = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nuevaClave);
            pstmt.setString(2, nombreUsuario);
            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}