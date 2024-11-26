
package com.mycompany.sumativacuatro;

//importanto libreria de GUI
import com.mycompany.sumativacuatro.igu.vista;



public class main {

    public static void main(String[] args) {
        //creacion de pantalla
        vista pantalla =  new vista();
        //hacer pantalla visible
        pantalla.setVisible(true);
        //mostrar en el centro de la pantalla
        pantalla.setLocationRelativeTo(null);
    }
}
