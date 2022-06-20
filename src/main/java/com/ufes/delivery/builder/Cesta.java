/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.delivery.builder;

import com.ufes.delivery.model.Pedido;

/**
 *
 * @author Tábata Brandão
 */
public class Cesta {
    private CestaTipo cestaTipo;
    private Pedido pedido;

    public Cesta(CestaTipo cestaTipo, Pedido pedido) {
        this.cestaTipo = cestaTipo;
        this.pedido = pedido;
    }

    public CestaTipo getCestaTipo() {
        return cestaTipo;
    }

    public void setCestaTipo(CestaTipo cestaTipo) {
        this.cestaTipo = cestaTipo;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }    
    
}
