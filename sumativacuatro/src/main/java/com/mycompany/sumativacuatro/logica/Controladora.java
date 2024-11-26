/*Ejercicio proyecto. 
Por: Ramses Mariño Vivas. Para: Programación II-UBA */
//importando paquetes necesarios
package com.mycompany.sumativacuatro.logica;

import com.mycompany.sumativacuatro.persistencia.controladoraPersistencia;
import java.util.ArrayList;
import java.util.List;


public class Controladora {
    //creando la conexion para hacer operacion a la base de datos
    controladoraPersistencia controlPersis = new controladoraPersistencia();
    
    //creando el metodo que recibe los datos del text field
    public void guardar(String marca, String procesador, String memoria,
            String sistemaOperativo, int precio) {
        
        //creando objeto de computadora
        Computadora compu = new Computadora();
        
        //asignando datos del text field a cada atributo
        compu.setMarca(marca);
        compu.setMemoria(memoria);
        compu.setPrecio(precio);
        compu.setProcesador(procesador);
        compu.setSistemaOperativo(sistemaOperativo);
        
        //se guarda en la conexion de la base de datos
        controlPersis.guardar(compu);  
    }
    
    //creando extraccion de la base de datos
    public List<Computadora> traerDatos() {
        return controlPersis.traerDatos();
    }

    //elimando objeto de la base de datos
    public void borrarComputadora(int id) {
        controlPersis.borrarComputadora(id);
    }   

    //pendiente
    public Computadora traerComputadora(int id){
        return controlPersis.traerComputadora(id);
    }
    
    public ArrayList<Computadora> traerListaComputadora() {
        return controlPersis.traerListaComputadora();
    }
}
