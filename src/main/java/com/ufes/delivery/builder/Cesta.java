/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.delivery.builder;

import com.ufes.delivery.model.Pedido;
import com.ufes.delivery.state.State;

/**
 *
 * @author Tábata Brandão
 */
public class Cesta {
    private CestaTipo cestaTipo;
    private Pedido pedido;
    private State state;

    public Cesta(CestaTipo cestaTipo, Pedido pedido, State state) {
        this.cestaTipo = cestaTipo;
        this.pedido = pedido;
        this.state = state;
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

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
    
    
}
