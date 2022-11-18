/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio0201.modelo;

import java.time.LocalDate;

/**
 *
 * @author Jonna
 */
public class Propietario {
    private String cedula;
    private String nombre;
    private String direccion;
    private LocalDate fechaNacimiento;
    private String telefono;

    public Propietario(String cedula, String nombre, String direccion, LocalDate fechaNacimiento, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Propietario{" + "cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + '}';
    }
    
    
      
}
