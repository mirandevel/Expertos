/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mac.variables;

import java.util.LinkedList;

/**
 *
 * @author Usuario
 */
public class Variable {

    boolean esNumerica;
    String nombre;
    LinkedList<String> valoresEscalares;
    String intervaloNumerico="";

    public Variable(boolean esNumerica, String nombre) {
        this.esNumerica = esNumerica;
        this.nombre = nombre;
        if (!esNumerica) {
            valoresEscalares = new LinkedList<>();
        }
    }

    public boolean isEsNumerica() {
        return esNumerica;
    }

    public void setEsNumerica(boolean esNumerica) {
        this.esNumerica = esNumerica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<String> getValoresEscalares() {
        return valoresEscalares;
    }

    public void setValoresEscalares(LinkedList<String> valoresEscalares) {
        this.valoresEscalares = valoresEscalares;
    }

    public String getIntervaloNumerico() {
        return intervaloNumerico;
    }

    public void setIntervaloNumerico(String intervaloNumerico) {
        this.intervaloNumerico = intervaloNumerico;
    }
    
    

    public void agregarValor(String valor) {
        valoresEscalares.add(valor);
    }

    public void modificarValor(String valor,int posicion) {
        valoresEscalares.set(posicion,valor);
    }

    public void eliminarValor(int posicion) {
        valoresEscalares.remove(posicion);
    }
    
    
    
    
    public void agregarIntervalo(String valor) {
        intervaloNumerico=valor;
    }

    public void modificarIntervalo(String valor) {
        intervaloNumerico=valor;
    }

    public void eliminarIntervalo() {
        intervaloNumerico="";
    }
    
    

}
