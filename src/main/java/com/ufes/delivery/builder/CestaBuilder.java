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
public class CestaBuilder implements Builder {

    private Cesta cesta;

    public CestaBuilder() {

    }

    @Override
    public void setCesta(String tipoCesta, Pedido pedido, State state) {
        if (tipoCesta != "Cesta Basica" && tipoCesta != "Cesta Ultra") {
            
        } else {
            if (tipoCesta == "Cesta Basica") {
                cesta.setCestaTipo(CestaTipo.CESTA_BASICA);
            } else if (tipoCesta == "Cesta Ultra") {
                cesta.setCestaTipo(CestaTipo.CESTA_ULTRA);
            }
        }

        cesta.setPedido(pedido);
        cesta.setState(state);
    }

}
