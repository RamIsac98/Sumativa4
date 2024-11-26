/*Ejercicio proyecto. 
Por: Ramses Mariño Vivas. Para: Programación II-UBA */
package com.mycompany.sumativacuatro.logica;

//importando metodos necesarios
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Esquematizando tabla de la clase Computadora para la base de datos
@Entity
public class Computadora implements Serializable {
    
    //identificador del id
    @Id
    //generador automatico de id al tener un registro
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int id;
    
    //atributos de la clase
    public String marca;
    public String memoria;
    public String procesador;
    public String sistemaOperativo;
    public double precio;
    
    //constructor vacio para el registro para el metodo guardar de controladora
    public Computadora() {
    }
    
    //constructor con los atributos uso para la lista 
    public Computadora(int id, String marca, String memoria, String procesador,
            String sistemaOperativo, double precio) {
        this.id = id;
        this.marca = marca;
        this.memoria = memoria;
        this.procesador = procesador;
        this.sistemaOperativo = sistemaOperativo;
        this.precio = precio;
    }

    //gets y sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    
    
    
}
