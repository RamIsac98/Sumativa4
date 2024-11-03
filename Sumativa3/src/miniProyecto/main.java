/*Ejercicio 1. 
Por: Ramses Mariño Vivas. Para: Programación II-UBA */
package miniProyecto;

import java.util.Scanner;



public class main {
    public static void main(String[] args) {
    Scanner equipo = new Scanner(System.in);
    
    //creando objeto de la tienda llenando sus atributos del constructor
    Tienda tienda=new Tienda("Electronic.exe", "Ramses", 29239202);
    //creando 5 objetos de la clase computadora llenando sus atributos del constructor
    Computadora computadora1 = new Computadora("Lenovo", "16GB", "Corei5-12G", "Windonws 10", 455);
    Computadora computadora2= new Computadora("Lenovo", "8GB", "Corei3-11G", "Windonws 10", 300);
    Computadora computadora3= new Computadora("HP", "16GB", "Corei7-10G", "Windonws 10", 380);
    Computadora computadora4= new Computadora("HP", "32GB", "corei9-12G", "Windonws 11", 700);
    Computadora computadora5= new Computadora("HP", "32GB", "corei9-11G", "Windonws 11", 630);
        
    //agregamos los objetos existentes creados desde la sumativa 1
    computadora1.registro();
    computadora2.registro();
    computadora3.registro();
    computadora4.registro();
    computadora5.registro();
    
    Computadora.nuevoEquipo(equipo);
    Computadora.imprimirLista();
    System.out.println("-------------------------");
    Computadora.equipoEspecifico();
    Computadora.imprimirLista();
    
    System.out.println("----------------------------------------------------");
    System.out.println("introduzca el indice para elimanr el equipo presente");
    System.out.println("----------------------------------------------------");
    int indice = equipo.nextInt();
    Computadora.eliminarEquipo(indice);
    Computadora.imprimirLista();
    
        
    
    
    
    //datos del propietario
    //tienda.imprimir();
    

    
    
    
    
    //fin de codigo
    
    }
    
  
            
}
