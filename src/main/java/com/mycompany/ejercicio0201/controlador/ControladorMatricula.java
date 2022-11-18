/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio0201.controlador;

import com.mycompany.ejercicio0201.modelo.Matricula;
import com.mycompany.ejercicio0201.modelo.Propietario;
import com.mycompany.ejercicio0201.servicio.ServiceMatriculaImpl;
import java.time.LocalDate;

/**
 *
 * @author Jonna
 */
public class ControladorMatricula {

    private ServiceMatriculaImpl serviceMatriculaImpl;

    public ControladorMatricula() {
        this.serviceMatriculaImpl = new ServiceMatriculaImpl();
    }

    public boolean validaCodigo(int codigo) {
        var retorno = false;

        String numCadena = String.valueOf(codigo);
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

        var cod = Integer.valueOf(codigo).intValue();

        if (cod > 0) {
            retorno = true;
        }

        return retorno;
    }

    public boolean validaCosto(float costo) {
        var retorno = false;

        String numCadena = String.valueOf(costo);
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

        var costoF = Float.valueOf(costo).intValue();

        if (costoF > 0 && costoF < 10000) {
            retorno = true;
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

    public boolean validaModelo(String modelo) {
        var retorno = false;

        switch (modelo) {
            case "Toyota":
                retorno = true;
                break;
            case "Chevrolet":
                retorno = true;
                break;
            case "Datsun":
                retorno = true;
                break;
            case "Pichirilo":
                retorno = true;
                break;
            case "Ford":
                retorno = true;
                break;
            case "Mazda":
                retorno = true;
                break;
            default:
                System.out.println("Marca no encontrada");
                break;
        }

        return retorno;
    }

    public String crear(String[] data, Propietario propietario) {

        var retorno = "No se pudo crear la matricula";
        var codigo = Integer.valueOf(data[0]).intValue();
        var costo = Float.valueOf(data[1]).floatValue();
        var year = Integer.valueOf(data[2]).intValue();
        var modelo = data[3];
        var nombrePropietario = propietario;
        var validar = true;

        if (validaCodigo(codigo) == false) {
            retorno += " \n ** No es valido el codigo! ** \n";
            validar = false;
        }
        if (validaCosto(costo) == false) {
            retorno += " \n ** No es valido el costo! ** \n";
            validar = false;
        }
        if (validaYear(year) == false) {
            retorno += " \n ** No es valido el año! ** \n";
            validar = false;
        }
        if (validaModelo(modelo) == false) {
            retorno += " \n ** No es valido el modelo! ** \n";
            validar = false;
        }

        if (validar == true) {
            var matricula = new Matricula(codigo, costo, year, modelo, nombrePropietario);

            this.serviceMatriculaImpl.crearMatricula(matricula);
            retorno = "Matricula con codigo " + matricula.getCodigo() + " creada correctamente";
        }

        return retorno;
    }
    
    public String modificar(String[] data) {

        var retorno = "No se pudo crear la matricula";
        var codigo = Integer.valueOf(data[0]).intValue();
        var costo = Float.valueOf(data[1]).floatValue();
        var year = Integer.valueOf(data[2]).intValue();
        var modelo = data[3];
      
        var validar = true;

        if (validaCodigo(codigo) == false) {
            retorno += " \n ** No es valido el codigo! ** \n";
            validar = false;
        }
        if (validaCosto(costo) == false) {
            retorno += " \n ** No es valido el costo! ** \n";
            validar = false;
        }
        if (validaYear(year) == false) {
            retorno += " \n ** No es valido el año! ** \n";
            validar = false;
        }
        if (validaModelo(modelo) == false) {
            retorno += " \n ** No es valido el modelo! ** \n";
            validar = false;
        }

        if (validar == true) {
            var matricula = new Matricula(codigo, costo, year, modelo);

            this.serviceMatriculaImpl.crearMatricula(matricula);
            retorno = "Matricula con codigo " + matricula.getCodigo() + " modificada correctamente";
        }

        return retorno;
    }
    
    public String eliminar(String[] data) {
        var retorno = "No se pudo eliminar matricula";
        var validar = true;

        var codigo = Integer.valueOf(data[0]).intValue();
        if (validaCodigo(codigo) == false) {
            retorno += " \n ** No es valido el codigo! ** \n";
            validar = false;
        } else {

            this.serviceMatriculaImpl.eliminarMatricula(codigo);
            retorno = "Matricula eliminado correctamente.";
        }

        return retorno;
    }

}
