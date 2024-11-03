import java.util.LinkedList;
import java.util.Queue;

class Solicitud {
    private String computador;
    private String archivo;

    public Solicitud(String computador, String archivo) {
        this.computador = computador;
        this.archivo = archivo;
    }

    public String getComputador() {
        return computador;
    }

    public String getArchivo() {
        return archivo;
    }

    
    public String toString() {
        return "Solicitud de " + computador + ": " + archivo;
    }
}

class Impresora {
    private Queue<Solicitud> colaSolicitudes;

    public Impresora() {
        colaSolicitudes = new LinkedList<>();
    }

    // Método para recibir la solicitud
    public void recibirSolicitud(String computador, String archivo) {
        Solicitud solicitud = new Solicitud(computador, archivo);
        colaSolicitudes.add(solicitud);
        System.out.println("Solicitud recibida: " + solicitud);
    }

public void imprimir() {
    Solicitud solicitud = colaSolicitudes.peek(); // Obtiene el primer elemento sin eliminarlo
    if (solicitud == null) { // Verifica si la cola está vacía
        System.out.println("No hay solicitudes pendientes.");
        return;
    }
    
    // Ahora eliminamos la solicitud después de haberla verificado
    colaSolicitudes.poll(); // Eliminar la solicitud después de haberla verificado
    
    System.out.println("Imprimiendo: " + solicitud);
    // Simulación de impresión
    System.out.println("Archivo '" + solicitud.getArchivo() + "' impreso desde " + solicitud.getComputador());
}

    // Método para mostrar el total de solicitudes y las pendientes
    public void mostrarEstado() {
        System.out.println("Total de solicitudes: " + (colaSolicitudes.size()));
        System.out.println("Solicitudes pendientes:");
        
        if (colaSolicitudes.isEmpty()) {
            System.out.println("No hay solicitudes pendientes.");
            return;
        }

        for (Solicitud s : colaSolicitudes) {
            System.out.println(s);
        }
    }
}

public class prueba {
    public static void main(String[] args) {
        Impresora impresora = new Impresora();

        // Recibir solicitudes
        impresora.recibirSolicitud("usuario1", "documento1.docx");
        impresora.recibirSolicitud("usuario2", "documento2.pdf");
        impresora.recibirSolicitud("usuario3", "documento3.txt");

        // Mostrar estado inicial
        impresora.mostrarEstado();

        // Imprimir solicitudes
        impresora.imprimir();
        impresora.imprimir();

        // Mostrar estado después de algunas impresiones
        impresora.mostrarEstado();

        // Imprimir el resto de las solicitudes
        impresora.imprimir();
        
        // Intentar imprimir cuando no hay más solicitudes
        impresora.imprimir();
        
        // Mostrar estado final
        impresora.mostrarEstado();
    }
}