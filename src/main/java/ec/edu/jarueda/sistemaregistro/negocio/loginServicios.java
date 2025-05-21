/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.jarueda.sistemaregistro.negocio;

import ec.edu.jarueda.sistemaregistro.datos.autenticacionDAO;
import modelo.Empleado;

/**
 *
 * @author Jostin Msi
 */
public class loginServicios {

    private final autenticacionDAO autenticacionDAO;

    public loginServicios() {
        this.autenticacionDAO = new autenticacionDAO();
    }

    public boolean loginUsuarioClave(String usuario, String clave) {
        Empleado empleadoLogeado = this.autenticacionDAO.IniciarSesionUsuarioClave(usuario, clave);
        return empleadoLogeado !=null;
        
        
//        if (empleadoLogeado == null) {
//            return false;
//        } else {
//            return false;
//        }

    }
}
