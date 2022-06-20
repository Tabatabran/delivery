/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.delivery.builder;

import com.ufes.delivery.model.Cliente;
import com.ufes.delivery.model.Desconto;
import com.ufes.delivery.model.Imposto;
import com.ufes.delivery.model.ItemDePedido;
import com.ufes.delivery.model.Pedido;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Tábata Brandão
 */
public class Director {

    private ArrayList<ItemDePedido> itens;

    public void addItensPedido(ItemDePedido item) {
        this.itens.add(item);
    }

    public void removeItensPedido(ItemDePedido item) {
        for (ItemDePedido itemfor : itens) {
            if (itemfor == item){
                itens.remove(itemfor);
            }
        }
    }

    public void constructCesta(Builder builder, String cestaTipo, int codigo, LocalDateTime data, Cliente cliente, ArrayList<Imposto> impostos, ArrayList<Desconto> descontos) {
        Pedido pedido = new Pedido(codigo, data, cliente);

        pedido.setDescontos(descontos);
        pedido.setImpostos(impostos);
        pedido.setItens(itens);

        pedido.calculaValorTotal();
        pedido.calculaDescontos();
        pedido.calculaImpostos();
        pedido.calculaValorFinalApagar();

        builder.setCesta(cestaTipo, pedido);
    }

}
