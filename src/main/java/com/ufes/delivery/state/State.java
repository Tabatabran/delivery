/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.delivery.state;

/**
 *
 * @author Tábata Brandão
 */
public abstract class State {
    public abstract String concluir();
    public abstract String cancelar();
    public abstract String pagar();
    public abstract String prepararCesta();
    public abstract String sairParaEntrega();
    public abstract String entregar();
    public abstract String avaliarAtendimento();
    public abstract String reembolsarReporEstoque();
    
}
