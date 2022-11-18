/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ejercicio0201.servicio;

import com.mycompany.ejercicio0201.modelo.Propietario;
import java.util.List;

/**
 *
 * @author Jonna
 */
public interface servicePropietario {
   public abstract void crearPropietario(Propietario propietario);
   public abstract void modificar(String cedula,Propietario propietarioModificado );
   public abstract void eliminarPropietario(String cedula);
   public abstract List<Propietario> listar();
   
}
