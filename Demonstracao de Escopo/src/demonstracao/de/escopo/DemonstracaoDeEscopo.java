/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonstracao.de.escopo;

/**
 *
 * @author John
 */
public class DemonstracaoDeEscopo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Inicio do bloco 1
        // TODO code application logic here
        int i = 5; //Variavel do bloco 1
        { //Inicio do bloco 2
            int j; //Variavel do bloco 2
            System.out.println(i); // Uso de i dentro do seu escopo
            j = 5 * i;             // Uso de j dentro do seu escopo
            System.out.println(j);
            { //Inicio do bloco 3
                System.out.println(i); //Uso de i dentro do seu escopo
                System.out.println(j); //Uso de j dentro do seu escopo
            }
        }
        System.out.println(i); //Uso de i dentro do seu escopo
        //System.out.println(j); ERRO! Uso de j FORA do seu escopo 
    }
}
