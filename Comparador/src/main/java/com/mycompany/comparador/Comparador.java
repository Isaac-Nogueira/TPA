/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparador;

/**
 *
 * @author SUDEMIR
 */
import java.util.Scanner;
public class Comparador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        //Comparador de valores para saber se houve lucro ou perda
        System.out.println("Insira o valor da Compra do Produto: ");
        double ValC = scanner.nextDouble();
        System.out.println("Informe o valor da Venda do Produto: ");
        double ValV = scanner.nextDouble();
        
        double Dif = ValV - ValC;
        
        if (ValV > ValC) {
            System.out.println("Houve lucro, com uma diferênca de R$" + Dif + " a mais que o valor da compra do produto.");
        }
        else {
            System.out.println("Não houve lucro, pois há uma diferênca de R$" + Dif + " do valor da compra do produto.");
        }
        
        //Comparando chaves de acesso
        System.out.println("Insira a chave de acesso numérica: ");
        int chave = scanner.nextInt();
        
        int senha = 1234;
        
        if (chave == senha) {
            System.out.println("Acesso permitido.");
        }
        else {
            System.out.println("Acesso negado");
        }
        }
}
