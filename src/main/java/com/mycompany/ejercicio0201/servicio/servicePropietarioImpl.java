/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio0201.servicio;

import com.mycompany.ejercicio0201.modelo.Propietario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonna
 */
public class servicePropietarioImpl implements servicePropietario {

    private List<Propietario> propietarioList;

    public servicePropietarioImpl() {
        this.propietarioList = new ArrayList<>();

    }

    @Override
    public void crearPropietario(Propietario propietario) {
        this.propietarioList.add(propietario);
    }

    @Override
    public void modificar(String cedula, Propietario propietarioModificado) {
        var indice = 0;
        for (var propietario : this.propietarioList) {
            if (propietario.getCedula().endsWith(cedula)) {
                this.propietarioList.set(indice, propietarioModificado);
            } else {
                indice++;
            }
        }
    }

    @Override
    public void eliminarPropietario(String cedula) {
        var indice = 0;
        for (var propietario : this.propietarioList) {
            if (propietario.getCedula().endsWith(cedula)) {
                this.propietarioList.remove(indice);
            } else {
                indice++;
            }
        }
    }

    @Override
    public List<Propietario> listar() {
        return this.propietarioList;
    }

}
