/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.jarueda.sistemaregistro.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jostin Msi
 */
public class ConexionDB {
    
    public static Connection AbrirConexion(){
        try{
        return DriverManager.getConnection("jdbc:mysql://localhost:3307/persona_database", "root", "jostin12345");
        }catch(SQLException ex){
            return null;
        }
    }
    
    public static void CerrarConexion(Connection conn){
        if(conn != null){
            try{
                conn.close();
            }catch(SQLException ex){
                System.out.println(ex+ "no se cerro la conexion");
            }
        }
    }
}
