/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio0201.controlador;

import com.mycompany.ejercicio0201.modelo.Matricula;
import com.mycompany.ejercicio0201.modelo.Propietario;
import com.mycompany.ejercicio0201.servicio.ServicePropietarioImpl;
import java.time.LocalDate;

/**
 *
 * @author Jonna
 */
public class ControladorPropietario {

    private ServicePropietarioImpl servicePropietarioImpl;

    public ControladorPropietario() {
        this.servicePropietarioImpl = new ServicePropietarioImpl();
    }

    public int validaCedula(String cedula) {
        var retorno = 0;

        String cadena = cedula;
        char[] cadena_div = cadena.toCharArray();
        String n = "";
        for (int i = 0; i < cadena_div.length; i++) {
            if (Character.isDigit(cadena_div[i])) {
                n += cadena_div[i];
                retorno = i + 1;

            }
        }

        return retorno;
    }

    public boolean validaNombre(String nombre) {
        var retorno = false;

        String cadena = nombre;
        char[] cadena_div = cadena.toCharArray();
        String n = "";
        for (int i = 0; i < cadena_div.length; i++) {
            if (Character.isDigit(cadena_div[i])) {
                n += cadena_div[i];
                retorno = true;
                return retorno;
            }
        }

        return retorno;
    }

    public boolean validaYear(int year) {
        var retorno = false;
        String numCadena = String.valueOf(year);
        String cadena = numCadena;

        char[] cadena_div = cadena.toCharArray();
        String n = "";
        for (int i = 0; i < cadena_div.length; i++) {
            if (Character.isDigit(cadena_div[i])) {
                n += cadena_div[i];
            } else {
                return retorno;
            }
        }

        var yearInt = Integer.valueOf(year).intValue();

        if (yearInt < 1930 || yearInt > LocalDate.now().getYear()) {
            retorno = true;
        }

        return retorno;
    }

    public int validaTelefono(String telefono) {
        var retorno = 0;

        String cadena = telefono;
        char[] cadena_div = cadena.toCharArray();
        String n = "";
        for (int i = 0; i < cadena_div.length; i++) {
            if (Character.isDigit(cadena_div[i])) {
                n += cadena_div[i];
                retorno = i + 1;
            }
        }

        return retorno;
    }

    public String crear(String[] data) {
        var retorno = "No se pudo crear el propietario";
        var validar = true;

        var cedula = data[0];
        var nombrePro = data[1];
        var direccion = data[2];
        var year = Integer.valueOf(data[3]).intValue();
        var telefono = data[4];

        if (validaCedula(cedula) != 10) {
            retorno += " \n ** No es valida la cedula! ** \n";
            validar = false;

        }
        if (validaNombre(nombrePro) == true) {
            retorno += " \n ** No es valido el nombre! ** \n";
            validar = false;

        }
        if (validaYear(year) != false) {
            retorno += " \n ** No es valido el año! ** \n";
            validar = false;

        }
        if (validaTelefono(telefono) != 10) {
            retorno += " \n ** No es valido el telefono! ** \n";
            validar = false;

        }

        if (validar == true) {
            var propietario = new Propietario(cedula, nombrePro, direccion, year, telefono);
            this.servicePropietarioImpl.crearPropietario(propietario);

            retorno = "Propietario " + propietario.getNombre() + " creado correctamente";
            propietario.toString();

        }

        return retorno;
    }

    public String modificar(String[] data) {
        var retorno = "No se pudo modificar el propietario";
        var validar = true;

        var cedula = data[0];
        var nombrePro = data[1];
        var direccion = data[2];
        var year = Integer.valueOf(data[3]).intValue();
        var telefono = data[4];

        if (validaCedula(cedula) != 10) {
            retorno += " \n ** No es valida la cedula! ** \n";
            validar = false;
        }
        if (validaNombre(nombrePro) == true) {
            retorno += " \n ** No es valido el nombre! ** \n";
            validar = false;
        }
        if (validaYear(year) == false) {
            retorno += " \n ** No es valido el año! ** \n";
            validar = false;
        }
        if (validaTelefono(telefono) != 10) {
            retorno += " \n ** No es valido el telefono! ** \n";
            validar = false;
        }

        if (validar == true) {
            var propietarioModificado = new Propietario(cedula, nombrePro, direccion, year, telefono);
            this.servicePropietarioImpl.modificar(cedula, propietarioModificado);
            retorno = "Propietario " + propietarioModificado.getNombre() + " modificado correctamente.";
        }

        return retorno;
    }

    public String eliminar(String[] data) {
        var retorno = "No se pudo eliminar el propietario";

        var cedula = data[0];
        if (validaCedula(cedula) != 10) {
            retorno += " \n ** No es valida la cedula! ** \n";
        } else {

            this.servicePropietarioImpl.eliminarPropietario(cedula);
            retorno = "Propietario eliminado correctamente.";
        }

        return retorno;
    }
}
