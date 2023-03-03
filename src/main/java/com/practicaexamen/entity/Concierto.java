package com.practicaexamen.entity;
import java.io.Serializable;
import jakarta.persistence.*; //Importamos todos los "import" de jakarta.
//test
@Entity
@Table(name = "conciertos") //Nombre de la tabla en MySQL
public class Concierto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    //Atributos de la tabla:
    private long id;
    private String artista;
    private String fecha;
    private String lugar;
    private double costo;
    private int capacidad;
    
    //Agregamos getters and setters:

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
}
