/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.impressora;

import java.util.Scanner;
/**
 *
 * @author silva
 */
public class Impressora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite qualquer palavra: ");
        String palavra = scan.nextLine();
        
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            System.out.println(letra);
        }
        
        
        scan.close();
        
        Nome meuNome = new Nome("Felipe");
        
        System.out.println("Quantidade de letras: " + meuNome.tamanho());
        
        meuNome.tudoMinusculo();
        
        System.out.println("Nome em minúsculo: " + meuNome.getNome());
        
    }
}
