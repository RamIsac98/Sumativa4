/*Ejercicio 2. 
Por: Ramses Mariño Vivas. Para: Programación II-UBA */
package paquete;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //creando objeto
        impresora impresoras = new impresora();

        // Recibir solicitudes
        
        impresoras.recibirSolicitud("usuario1", "documento1.docx");
        impresoras.recibirSolicitud("usuario2", "documento2.pdf");
        impresoras.recibirSolicitud("usuario3", "documento3.txt");
        impresoras.recibirSolicitud("usuario4", "archivo4.word");
        impresoras.recibirSolicitud("usuario5", "archivo5.word");
        impresoras.recibirSolicitud("usuario6", "foto6.png");
        impresoras.recibirSolicitud("usuario7", "plantilla7.pdf");
        impresoras.recibirSolicitud("usuario8", "documento8.txt");
        impresoras.recibirSolicitud("usuario9", "archivo9.word");
        impresoras.recibirSolicitud("usuario10", "documento10.word");        
        

        // Mostrar estado inicial
        impresoras.mostrarEstado();

        // Imprimir solicitudes
        impresoras.imprimir();
        impresoras.imprimir();

        // Mostrar estado despues de algunas impresiones
        impresoras.mostrarEstado();

        // Imprimir el resto de las solicitudes
        impresoras.imprimir();
        
        //imprimir solicitudes
        impresoras.mostrarEstado();
        
        //entrada de solicitud por el usuario 
        System.out.println("-----------------");
        System.out.println("ingrese archivo:");
        String entradaDatos = entrada.nextLine();
        impresoras.recibirSolicitud("computadora", entradaDatos);
        impresoras.mostrarEstado();
        
        
        
    }
}
