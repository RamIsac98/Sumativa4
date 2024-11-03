/*Ejercicio 2. 
Por: Ramses Mariño Vivas. Para: Programación II-UBA */
package paquete;

//importamos clases para usar colas
import java.util.LinkedList;
import java.util.Queue;

//creamos la clase
class impresora {
    public Queue<Computadora> colaSolicitudes;

    // creamos un constructor donde se crea la cola
    public impresora() {
        colaSolicitudes = new LinkedList<>();
    }

    

 // Metodo para recibir la solicitud
    public void recibirSolicitud(String usuario, String archivo) {
        //creamos el objeto computadora con los parametro de los atributos
        //del constructor
        Computadora usuario_new = new Computadora(usuario, archivo);
        //agregamos el objeto a la cola 
        colaSolicitudes.add(usuario_new);
        //imprimiendo entrada de la solicitud
        System.out.println("----------------------------------");
        System.out.println("Solicitud recibida: Computadora: " + usuario_new +"\n");
    }    

    //Metodo para imprimir en la impresora
    public void imprimir() {
        //aplicamos metodo peek para tomar el primer objeto antes de eliminarlo
        Computadora usuario = colaSolicitudes.peek(); 
        //condicional si la cola esta vacia
        //se coloca igual null para comprobar que este vacia 
        if (usuario == null) { // Verifica si la cola está vacía
            System.out.println("------------------------------");
            System.out.println("NO HAY SOLICITUDES PENDIENTES");
            System.out.println("------------------------------");
        
            return;
        }
    
    //si no cumple con la condicion mandamos a eliminar el primer objeto
    colaSolicitudes.remove();
    
    //mandamos por consola el objeto impreso desde el objeto que quiso imprimir
    System.out.println("--------------------------------------------------------");
    System.out.println("Imprimiendo: " + usuario);
    // Simulación de impresión
    System.out.println("Archivo '" + usuario.getArchivo() + "' impreso desde " +
            usuario.getUsuario());
}

    // Metodo para mostrar el total de solicitudes y las pendientes
    public void mostrarEstado() {
        //mostrando datos por consola 
        System.out.println("-------------------------------------------------");
        //mostramos el tamaño de la cola prensete
        System.out.println("Total de solicitudes: " + (colaSolicitudes.size()));
        System.out.println("Solicitudes pendientes:");
        //condicional donde se comprueba que este vacia 
        if (colaSolicitudes.size() == 0) {
            System.out.println("No hay solicitudes pendientes.");
        System.out.println("-------------------------------------------------");
            
            return;
        }
        //si no cumple con la condicion imprime el resto de entradas pendientes
        for (Computadora computadoras : colaSolicitudes) {
            System.out.println(computadoras);
        }
    }
}
