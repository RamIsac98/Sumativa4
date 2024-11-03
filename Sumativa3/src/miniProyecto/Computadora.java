/*Ejercicio 1. 
Por: Ramses Mariño Vivas. Para: Programación II-UBA */
package miniProyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Computadora {

    //creando atributos de la clase
    public String marca;
    public String memoria;
    public String procesador;
    public String sistemaOperativo;
    public double precio;

    //creando lista donde se ubucan todo los equipos
    public static List<Computadora> listaEquipos = new ArrayList<>();

    //creando contructor con los atributos de la clase
    public Computadora(String marca, String memoria, String procesador,
            String sistemaOperativo, double precio) {
        this.marca = marca;
        this.memoria = memoria;
        this.procesador = procesador;
        this.sistemaOperativo = sistemaOperativo;
        this.precio = precio;
    }

    //creacion de get and set
    //-------------------------------------------
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //-------------------------------------------
    //metodo de registro de obj ya existentes
    public void registro() {
        //Creando objeto para almacenar
        Computadora listaAlmacen = new Computadora(marca, memoria, procesador,
                sistemaOperativo, precio);

        //agregando el objetoa la lista
        listaEquipos.add(listaAlmacen);

    }

    //Metodo de entradas de los equipos
    public static void nuevoEquipo(Scanner equipo) {
        System.out.println("Ingrese sistema Operativo:");
        String sistemaOperativo = equipo.nextLine();

        System.out.println("Ingrese la marca del equipo:");
        String marca = equipo.nextLine();

        System.out.println("Ingrese la cantidad de memoria RAM:");
        String memoria = equipo.nextLine();

        System.out.println("Ingrese el tipo de procesador y Generacion");
        String procesador = equipo.nextLine();

        System.out.println("Ingrese precio del equipo:");
        double precio = equipo.nextDouble();

        //Metodo Lista almacenar los objetos creados
        Computadora listaAlmacen = new Computadora(sistemaOperativo, marca, memoria,
                procesador, precio);

        listaEquipos.add(listaAlmacen);
        System.out.println("se agrego el equipo");
    }

    //metodo para mostrar los datos del arreglo
    public String toString() {
        return "Computadora{"
                + "marca='" + marca + '\''
                + ", memoria='" + memoria + '\''
                + ", procesador='" + procesador + '\''
                + ", sistemaOperativo='" + sistemaOperativo + '\''
                + ", precio=" + precio
                + '}';
    }

    public static void imprimirLista() {
        System.out.println("-------------------------");
        System.out.println("Lista de Computadoras:");
        
        for (int i = 0; i < listaEquipos.size(); i++) {
            System.out.println(i + ": " + listaEquipos.get(i) + "\n");
        }
        System.out.println("-------------------------");

    }
    
    // Método estático para eliminar una computadora por índice
    public static void eliminarEquipo(int indice) {
        if (indice >= 0 && indice < listaEquipos.size()) {
            listaEquipos.remove(indice);
            System.out.println("---------------------");
            System.out.println("OPERACION COMPLETADA.");
            System.out.println("---------------------");            
        } else {
            System.out.println("-------------------------------------------");            
            System.out.println("ERROR DE OPERACION.\nINDIQUE BIEN EL INDICE");
            System.out.println("-------------------------------------------");            
            
        }
    }
    
    

    //metodo para mostrar una equipo especifico y eliminarlo
    public static List<Computadora> equipoEspecifico() {
        System.out.println("-------------------------------");
        
        System.out.println("Ingrese nombre del modelo");
        
        Scanner entrada = new Scanner(System.in);
        String idMarca = entrada.nextLine();
        List<Computadora> identificador = new ArrayList<>();

        for (Computadora computadora : listaEquipos) {

            String marcaComputadora = computadora.getMarca();
            //convertimos las cadenas en minusculas y comparamos
            if (computadora.getMarca().toLowerCase().equals(idMarca.toLowerCase())) {
                identificador.add(computadora);
            }
           
        }
         
        //estructura de control si se encuentra el equipo
        if (identificador.size() == 0) {
            System.out.println("-------------------------------");
            System.out.println("ERROR NO SE ENCUENTRA EQUIPO!!");
            System.out.println("-------------------------------");
            
        }

        System.out.println("\nComputadoras de la marca '" + idMarca + "':");
        for (int i = 0; i < identificador.size(); i++) {
            System.out.println(i + ": " + identificador.get(i));
        }
        
        

        //estructura de control si desea eliminar el equipo especifico
        System.out.println("Eliminar Equipo \nSI-1, NO-2");
        int confirmacion = entrada.nextInt();

        if (confirmacion == 1) {
            //creacion de eliminacion por el usuario
            System.out.println("---------------------------------");
            System.out.println("SISTEMA DE ELIMINACION DE EQUIPO");
            System.out.println("---------------------------------");
            System.out.println("Introduzca el indice del equipo:");

            int indice = entrada.nextInt();

            //control logico de validacion del indice
            if (indice >= 0 && indice < identificador.size()) {
                Computadora eliminar = identificador.get(indice);
                listaEquipos.remove(eliminar);
                System.out.println("--------------------");
                System.out.println("OPERACION COMPLETA!");
                System.out.println("--------------------");
            } else {
                System.out.println("ERROR DE OPERACION\n INDICE NO VALIDO");
            }
        }
        else {
            System.out.println("EXIT");
        }
        
        return null;
        
    }
    
    
    
    
    
//    public static void eliminarEquipo(String valor){
//        Scanner entrada = new Scanner(System.in);
//
//
//
//
//
//        //estructura de control si desea eliminar el equipo especifico
//        System.out.println("Eliminar Equipo \nSI-1, NO-2");
//        int confirmacion = entrada.nextInt();
//
//        if (confirmacion == 1) {
//            //creacion de eliminacion por el usuario
//            System.out.println("---------------------------------");
//            System.out.println("SISTEMA DE ELIMINACION DE EQUIPO");
//            System.out.println("---------------------------------");
//            System.out.println("Introduzca el indice del equipo:");
//
//            int indice = entrada.nextInt();
//
//            //control logico de validacion del indice
//            if (indice >= 0 && indice < identificador.size()) {
//                Computadora eliminar = identificador.get(indice);
//                listaEquipos.remove(eliminar);
//                System.out.println("--------------------");
//                System.out.println("OPERACION COMPLETA!");
//                System.out.println("--------------------");
//            } else {
//                System.out.println("ERROR DE OPERACION\n INDICE NO VALIDO");
//            }
//        }
//        else {
//            System.out.println("EXIT");
//        }
//    }
}
