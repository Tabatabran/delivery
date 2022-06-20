/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.delivery.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Tábata Brandão
 */
public class Pedido {

    public int numero;
    public LocalDateTime data;
    public double valorTotal;
    public double valorTotoalImpostos;
    public double valorFinalApagar;
    public double valorTotalDescontos;
    private ArrayList<ItemDePedido> itens;
    private ArrayList<Imposto> impostos;
    private ArrayList<Desconto> descontos;
    private Cliente cliente;

    public Pedido(int numero, LocalDateTime data, Cliente cliente) {
        this.numero = numero;
        this.data = data;
        this.cliente = cliente;
    }
    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double getValorTotoalImpostos() {
        return valorTotoalImpostos;
    }

    public double getValorFinalApagar() {
        return valorFinalApagar;
    }

    public double getValorTotalDescontos() {
        return valorTotalDescontos;
    }

    public ArrayList<ItemDePedido> getItens() {
        return itens;
    }

    public ArrayList<Imposto> getImpostos() {
        return impostos;
    }

    public ArrayList<Desconto> getDescontos() {
        return descontos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setItens(ArrayList<ItemDePedido> itens) {
        this.itens = itens;
    }

    public void setImpostos(ArrayList<Imposto> impostos) {
        this.impostos = impostos;
    }

    public void setDescontos(ArrayList<Desconto> descontos) {
        this.descontos = descontos;
    }
    
    public void calculaValorTotal() {
        
        for (ItemDePedido item: itens){
            this.valorTotal += item.getValorTotal();
        }
        
    }
    
    public void calculaImpostos(){
        for (Imposto imposto: impostos){
            imposto.setValor(imposto.getPercentual() * valorTotal);
            this.valorTotoalImpostos += imposto.getValor();
        }   
    }
    
    public void calculaDescontos(){
        for (Desconto desconto: descontos){
            desconto.setValorDesconto(desconto.getPercentual() * valorTotal); 
            this.valorTotoalImpostos += desconto.getValorDesconto();
        }
    }
    
    public void calculaValorFinalApagar() {
        this.valorFinalApagar = valorTotal + valorTotoalImpostos - valorTotalDescontos;
    }

}
