/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio0201.vista;

import com.mycompany.ejercicio0201.controlador.ControladorMatricula;
import com.mycompany.ejercicio0201.controlador.ControladorPropietario;
import com.mycompany.ejercicio0201.modelo.Propietario;

/**
 *
 * @author Jonna
 */
public class Ejercicio0201 {

    public static void main(String[] args) {

        var propietarioControl = new ControladorPropietario();

        var data = new String[6];
        data[0] = "0106411937";
        data[1] = "Erika";
        data[2] = "Ricaurte";
        data[3] = "2000";
        data[4] = "0959122965";
        System.out.println(propietarioControl.crear(data));

        var data1 = new String[6];
        data1[0] = "0153843456";
        data1[1] = "Jonnathan ";
        data1[2] = "Batan";
        data1[3] = "2002";
        data1[4] = "0982846498";
        System.out.println(propietarioControl.crear(data1));

        var data2 = new String[6];
        data2[0] = "07373637";
        data2[1] = "Cesar ";
        data2[2] = "Gualaceo";
        data2[3] = "2001";
        data2[4] = "0837764663";
        System.out.println(propietarioControl.crear(data2));

        // matriculas
        var matriculaControl = new ControladorMatricula();
        var dataMat = new String[5];
        dataMat[0] = "12";
        dataMat[1] = "250";
        dataMat[2] = "2015";
        dataMat[3] = "Toyota";

       // System.out.println(matriculaControl.crear(dataMat,propietario));

    }
}
