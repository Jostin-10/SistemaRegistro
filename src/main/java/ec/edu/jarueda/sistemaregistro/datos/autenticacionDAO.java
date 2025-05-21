/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.jarueda.sistemaregistro.datos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import modelo.Empleado;
import util.persistenceUtil;

/**
 *
 * @author Jostin Msi
 */
public class autenticacionDAO {
    
    
    public Empleado IniciarSesionUsuarioClave(String usuario, String clave){
        EntityManager em=persistenceUtil.getEntityManagerFactory().createEntityManager();
        try{
            return em.createQuery(
            "SELECT e FROM Empleado e WHERE e.numIdentificacion= :usuario AND e.clave = :contrasena", Empleado.class)
                    .setParameter("user", usuario)
                    .setParameter("contraseña", clave)
                    .getSingleResult();
        }catch(Exception e){
            return null;
        }finally{
            em.close();
        }
        
     
    }
}
