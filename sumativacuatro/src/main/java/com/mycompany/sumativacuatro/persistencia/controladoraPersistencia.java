/*Ejercicio proyecto. 
Por: Ramses Mariño Vivas. Para: Programación II-UBA */

//importando librerias necesarias 
package com.mycompany.sumativacuatro.persistencia;

import com.mycompany.sumativacuatro.logica.Computadora;
import com.mycompany.sumativacuatro.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

//conexion de la base de datos
public class controladoraPersistencia {
    ComputadoraJpaController comJpa = new ComputadoraJpaController();

    //mandar informacion nueva a la base de datos
    public void guardar(Computadora compu) {
        comJpa.create(compu); 
    }
    

    //metodo de extraer datos de la base de datos para la interfaz grafica
    public List<Computadora> traerDatos() {
        return comJpa.findComputadoraEntities();
    }

    //metodo de eliminar un objeto de la base de datos
    public void borrarComputadora(int id) {
        //excepcion si no se encuentra el id del objeto
        try {
            comJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //pendiente
    public Computadora traerComputadora(int id) {
        return comJpa.findComputadora(id);
    }

    public ArrayList<Computadora> traerListaComputadora() {
        List<Computadora> lista = comJpa.findComputadoraEntities();
        ArrayList<Computadora> listaComputadora = new ArrayList<Computadora> (lista);
        return listaComputadora;
    }
}
