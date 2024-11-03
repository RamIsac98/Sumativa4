/*Ejercicio 1. 
Por: Ramses Mariño Vivas. Para: Programación II-UBA */
package miniProyecto;


public class Tienda {
    //creamos atributos de la clase tienda
    public String nombreTienda;
    public String propietarioTienda;
    public int id_Tribunario_Tienda;

    //creacion de constructor vacio
    public Tienda() {
    } 
    
    //creando constructor con los atrubutos
    public Tienda(String nombreTienda, String propietarioTienda, int id_Tribunario_Tienda) {
        this.nombreTienda = nombreTienda;
        this.propietarioTienda = propietarioTienda;
        this.id_Tribunario_Tienda = id_Tribunario_Tienda;
    }
    
    //creando metodo donde se muestra por consola los datos
    public void imprimir() {
        System.out.println("nombre de la tienda: "+nombreTienda);
        System.out.println("Nombre del propietario: "+propietarioTienda);
        System.out.println("identificacion tribunario de la tienda: "+id_Tribunario_Tienda);
    }
    //fin de codigo
}
