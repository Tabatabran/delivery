/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.delivery.state;

/**
 *
 * @author Tábata Brandão
 */
public class Reembolsado extends State{

    @Override
    public String concluir() {
        return "Pedido reembolsado";
    }

    @Override
    public String cancelar() {
        return "Pedido reembolsado";
    }

    @Override
    public String pagar() {
        return "Pedido reembolsado";
    }

    @Override
    public String prepararCesta() {
        return "Pedido reembolsado";
    }

    @Override
    public String sairParaEntrega() {
        return "Pedido reembolsado";
    }

    @Override
    public String entregar() {
        return "Pedido reembolsado";
    }

    @Override
    public String avaliarAtendimento() {
        return "O cliente está avaliando o atendimento";
    }

    @Override
    public String reembolsarReporEstoque() {
        return "O pedido já foi reembolsado";
    }
    
}
