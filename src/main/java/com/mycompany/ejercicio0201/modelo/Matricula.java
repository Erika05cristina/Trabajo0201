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
public class Matricula {
    private Propietario propietario;
    private float costo;
    private LocalDate yearCompra;
    private String modeloCarro;

    public Matricula(Propietario propietario, float costo, LocalDate yearCompra, String modeloCarro) {
        this.propietario = propietario;
        this.costo = costo;
        this.yearCompra = yearCompra;
        this.modeloCarro = modeloCarro;
    }
    public int yearUso(){
        var yearActual = LocalDate.now().getYear();
        var compra = yearCompra.getYear();
        var retorno = yearActual - compra;
        return retorno;
        
    }
    public float calcularDevaluacion(){
        var yearUsados = this.yearUso();
        var retorno = 0;
        
        
        return retorno;
    }
    

    
}
