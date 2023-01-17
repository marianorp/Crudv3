package com.Crud.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/* Convierte la clase en una tabla en la BD */
@Entity
public class Usuario {

    @Id /*Pk*/
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;
    private String nombre;
    private String direccion;
    private String email;

    /*Constructor*/
    public Usuario() {
    }

    public Usuario(String nombre, String direccion, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
