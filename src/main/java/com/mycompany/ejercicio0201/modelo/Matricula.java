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

    private int codigo;
    private float costo;
    private int yearCompra;
    private String modeloCarro;
    private Propietario propietario;

    public Matricula(int codigo, float costo, int yearCompra, String modeloCarro, Propietario propietario) {
        this.codigo = codigo;
        this.costo = costo;
        this.yearCompra = yearCompra;
        this.modeloCarro = modeloCarro;
         this.propietario = propietario;
    }

    public Matricula(int codigo, float costo, int yearCompra, String modeloCarro) {
        this.codigo = codigo;
        this.costo = costo;
        this.yearCompra = yearCompra;
        this.modeloCarro = modeloCarro;
    }

  

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public int getYearCompra() {
        return yearCompra;
    }

    public void setYearCompra(int yearCompra) {
        this.yearCompra = yearCompra;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public int yearUso() {
        var yearActual = LocalDate.now().getYear();
        var compra = yearCompra;
        var retorno = yearActual - compra;
        return retorno;

    }

    public double calcularDevaluacion() {

        var yearUsados = this.yearUso();
        var devaluacion = 0.0;

        if (yearUsados < 11) {
            devaluacion = (costo * yearUsados) / 100;
        }

        return devaluacion;

    }

    @Override
    public String toString() {
        return "Matricula{" + "codigo=" + codigo + ", costo=" + costo 
                + ", yearCompra=" + yearCompra + ", modeloCarro=" + modeloCarro 
                + ", propietario=" + propietario.getNombre() + '}';
    }
    

}
