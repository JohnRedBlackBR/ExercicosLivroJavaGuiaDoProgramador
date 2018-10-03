/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usodadiretivaif;

/**
 *
 * @author John
 */
public class UsoDaDiretivaIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(args.length > 0){ //teste de presensa de argumentos
            //converter 1 argumento para inteiro
            int max = Integer.parseInt(args[0]);
            for(int j = 0; j <  max ; j++){
                System.out.print(j + " ");
            }
            System.out.println("\n fim da Contagem");
        }
        System.out.println("Fim do programa");
    }
    
}
