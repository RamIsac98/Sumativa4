/*Ejercicio 2. 
Por: Ramses Mariño Vivas. Para: Programación II-UBA */
package paquete;

//creando clase
public class Computadora {
    public String usuario;
    public String archivo;

    //creando constructor
    public Computadora(String usuario, String archivo) {
        this.usuario = usuario;
        this.archivo = archivo;
    }
    
    //creando gets and sets
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
    
    //creando toString que se utiliza para imprimir las entradas pendientes
    public String toString() {
            return "Solicitud de " + usuario + ": " + archivo;
        }    
    
}
