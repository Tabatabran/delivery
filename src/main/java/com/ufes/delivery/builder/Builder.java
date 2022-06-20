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
public interface Builder {

    void setCesta(String tipoCesta, Pedido pedido, State state);

}
