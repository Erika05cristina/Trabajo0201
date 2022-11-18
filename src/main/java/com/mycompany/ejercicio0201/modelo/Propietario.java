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
    private int fechaNacimiento;
    private String telefono;

    public Propietario(String cedula, String nombre, String direccion, int fechaNacimiento, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;

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

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    

    public void mostrarProvincia() {
        var numIniciales = cedula.substring(0, 1);

        switch (numIniciales) {
            case "01":
                System.out.println("Azuay");
                break;
            case "02":
                System.out.println("Bolivar");
                break;
            case "03":
                System.out.println("Cañar");
                break;
            case "04":
                System.out.println("Carchi");
                break;
            case "05":
                System.out.println("Cotopaxi");
                break;
            case "06":
                System.out.println("Chimborazo");
                break;
            case "07":
                System.out.println("El oro");
                break;
            case "08":
                System.out.println("Esmeraldas");
                break;
            case "09":
                System.out.println("Guayas");
                break;
            case "10":
                System.out.println("Imbabura");
                break;
            case "11":
                System.out.println("Loja");
                break;
            case "12":
                System.out.println("Los Rios");
                break;
            case "13":
                System.out.println("Manabi");
                break;
            case "14":
                System.out.println("Morona Santiago");
                break;
            case "15":
                System.out.println("Napo");
                break;
            case "16":
                System.out.println("Pastaza");
                break;
            case "17":
                System.out.println("Pichincha");
                break;
            case "18":
                System.out.println("Tungurahua");
                break;
            case "19":
                System.out.println("Zamora Chinchipe");
                break;
            case "20":
                System.out.println("Galapagos");
                break;
            case "21":
                System.out.println("Sucumbios");
                break;
            case "22":
                System.out.println("Orellana");
                break;
            case "23":
                System.out.println("S.D.T");
                break;
            case "24":
                System.out.println("Santa Elena");
                break;

            default:
                System.out.println("No encontrada");
                break;
        }

    }

    public int calcularEdad() {
        var retorno = 0;
        retorno = LocalDate.now().getYear() - fechaNacimiento;

        return retorno;
    }
    
    @Override
    public String toString() {
        return "Propietario{" + "cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + '}';
    }

}
