/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.delivery.model;


/**
 *
 * @author Tábata Brandão
 */
public class ItemDePedido {

    public int quantidade;
    public double valorUnitario;
    public double valorTotal;
    public Produto produto;

    public ItemDePedido(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
        setValorUnitario();
        calculaValorTotal();
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario() {
        this.valorUnitario = produto.getPrecoUnitario();
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void calculaValorTotal() {
        this.valorTotal = valorUnitario * quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    
}
