/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ejercicio0201.servicio;

import com.mycompany.ejercicio0201.modelo.Matricula;
import java.util.List;

/**
 *
 * @author Kristina
 */
public interface ServiceMatricula {
    public abstract void crearMatricula(Matricula matricula);
    public abstract void modificarMatricula(int codigo, Matricula matriculaModificada);
    public abstract void eliminarMatricula(int codigo);
    public abstract List<Matricula> listar();
}
