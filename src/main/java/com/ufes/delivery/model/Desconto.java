/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.delivery.model;

/**
 *
 * @author Tábata Brandão
 */
public class Desconto {

    public String tipo;
    public double valorDesconto;
    public double percentual;

    public Desconto(String tipo, double percentual) {
        this.tipo = tipo;
        this.percentual = percentual;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    
}
