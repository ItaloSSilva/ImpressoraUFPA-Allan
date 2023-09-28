/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.impressora;

/**
 *
 * @author silva
 */
public class Nome extends Impressora{
    private String nome;

    public Nome() {
    }

    public Nome(String nome) {
        this.nome = nome;
    }
    
    public void tudoMinusculo(){
        nome = nome.toLowerCase();
    }
    
    public int tamanho() {
        return nome.length();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    
    
}
