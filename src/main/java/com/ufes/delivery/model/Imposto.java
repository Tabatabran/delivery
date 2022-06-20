/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.delivery.model;

/**
 *
 * @author Tábata Brandão
 */
public class Imposto {

    public String nome;
    public double percentual;
    public double valor;

    public Imposto(String nome, double percentual) {
        this.nome = nome;
        this.percentual = percentual;
    }

    public String getNome() {
        return nome;
    }

    public double getPercentual() {
        return percentual;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    

}
