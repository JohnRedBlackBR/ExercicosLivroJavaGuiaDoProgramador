/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada.e.saida.simples;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class EntradaESaidaSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ola"); //Mensagem inicial
        System.out.print("Digite um inteiro: "); //Exibe mensagem
        Scanner s = new Scanner(System.in);//Prepara entrada de dados
        int valor = s.nextInt(); //Diclara e inicia a variavel
        System.out.println("Valor = " + valor); //Exibe o valor
        s.close();
    }
    
}
